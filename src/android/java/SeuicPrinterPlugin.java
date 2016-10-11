package com.seuic.cordova.plugin;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.seuic.android.PosdService;
import com.seuic.android.Printer;
import com.seuic.android.PrinterListener;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

import java.io.UnsupportedEncodingException;

public class SeuicPrinterPlugin extends CordovaPlugin {

    public static final String ACTION = "printMethod";
    public static PosdService posdService = null;
    public static Printer printer = null;

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        Activity activity = cordova.getActivity();
        activity.bindService(new Intent("com.seuic.android.PosdService"), posdConnection, Context.BIND_AUTO_CREATE);
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals(ACTION)) {
            try {
                printText(args.getString(0));
                callbackContext.success("Success!");
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                callbackContext.error("错误:" + e.getMessage() + args.getString(0));
                return false;
            }
        }

        return false;
    }


    private ServiceConnection posdConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {

            posdService = PosdService.Stub.asInterface(service);
            if (null != posdService) {
                try {
                    printer = Printer.Stub.asInterface(posdService.getPrinter());
                } catch (RemoteException e) {
                    Log.e(e.getClass().getSimpleName(),e.getMessage());
                }
            } else {
                Log.e(this.getClass().getSimpleName(), "服务未启动");
            }
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            posdService = null;
            printer = null;
        }
    };


    private void printText(String str){
        StringBuilder bill = new StringBuilder();
        bill.append(str);
        bill.append("\r\n\n\n\n\n\n\n");
        Log.i(this.getClass().getSimpleName(), "startPrint");
        try {
            byte[] data_in = bill.toString().getBytes("GBK");
            printer.startPrint(new PrinterCallback(), data_in);
        } catch (RemoteException e) {
            Log.e(e.getClass().getSimpleName(), e.getMessage());
        } catch (UnsupportedEncodingException e) {
            Log.e(e.getClass().getSimpleName(), e.getMessage());
        }
    }

    private class PrinterCallback extends PrinterListener.Stub {
        @Override
        public void OnPrintSuccess() throws RemoteException {
            Log.i(this.getClass().getSimpleName(), "OnPrintSuccess");
        }

        @Override
        public void OnPrintFail(int returnCode) throws RemoteException {
            Log.e(this.getClass().getSimpleName(), "OnPrintFail");
        }
    }
}
