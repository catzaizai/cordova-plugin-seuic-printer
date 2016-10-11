/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Test\\printDemo\\app\\src\\main\\aidl\\com\\seuic\\android\\ICCardTransFinishListener.aidl
 */
package com.seuic.android;

public interface ICCardTransFinishListener extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.seuic.android.ICCardTransFinishListener {
        private static final java.lang.String DESCRIPTOR = "com.seuic.android.ICCardTransFinishListener";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.seuic.android.ICCardTransFinishListener interface,
         * generating a proxy if needed.
         */
        public static com.seuic.android.ICCardTransFinishListener asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.seuic.android.ICCardTransFinishListener))) {
                return ((com.seuic.android.ICCardTransFinishListener) iin);
            }
            return new com.seuic.android.ICCardTransFinishListener.Stub.Proxy(obj);
        }

        @Override
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            switch (code) {
                case INTERFACE_TRANSACTION: {
                    reply.writeString(DESCRIPTOR);
                    return true;
                }
                case TRANSACTION_OnTC: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    int _arg1;
                    _arg1 = data.readInt();
                    byte[] _arg2;
                    _arg2 = data.createByteArray();
                    int _arg3;
                    _arg3 = data.readInt();
                    this.OnTC(_arg0, _arg1, _arg2, _arg3);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_OnAAC: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    int _arg1;
                    _arg1 = data.readInt();
                    byte[] _arg2;
                    _arg2 = data.createByteArray();
                    int _arg3;
                    _arg3 = data.readInt();
                    this.OnAAC(_arg0, _arg1, _arg2, _arg3);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_OnFail: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    this.OnFail(_arg0);
                    reply.writeNoException();
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.seuic.android.ICCardTransFinishListener {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder remote) {
                mRemote = remote;
            }

            @Override
            public android.os.IBinder asBinder() {
                return mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            @Override
            public void OnTC(byte[] outdata, int outdata_len, byte[] script_result, int script_result_len) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(outdata);
                    _data.writeInt(outdata_len);
                    _data.writeByteArray(script_result);
                    _data.writeInt(script_result_len);
                    mRemote.transact(Stub.TRANSACTION_OnTC, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void OnAAC(byte[] outdata, int outdata_len, byte[] script_result, int script_result_len) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(outdata);
                    _data.writeInt(outdata_len);
                    _data.writeByteArray(script_result);
                    _data.writeInt(script_result_len);
                    mRemote.transact(Stub.TRANSACTION_OnAAC, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void OnFail(int returnCode) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(returnCode);
                    mRemote.transact(Stub.TRANSACTION_OnFail, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }

        static final int TRANSACTION_OnTC = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_OnAAC = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_OnFail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    }

    public void OnTC(byte[] outdata, int outdata_len, byte[] script_result, int script_result_len) throws android.os.RemoteException;

    public void OnAAC(byte[] outdata, int outdata_len, byte[] script_result, int script_result_len) throws android.os.RemoteException;

    public void OnFail(int returnCode) throws android.os.RemoteException;
}
