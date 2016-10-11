/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Test\\printDemo\\app\\src\\main\\aidl\\com\\seuic\\android\\PrinterListener.aidl
 */
package com.seuic.android;

public interface PrinterListener extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.seuic.android.PrinterListener {
        private static final java.lang.String DESCRIPTOR = "com.seuic.android.PrinterListener";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.seuic.android.PrinterListener interface,
         * generating a proxy if needed.
         */
        public static com.seuic.android.PrinterListener asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.seuic.android.PrinterListener))) {
                return ((com.seuic.android.PrinterListener) iin);
            }
            return new com.seuic.android.PrinterListener.Stub.Proxy(obj);
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
                case TRANSACTION_OnPrintSuccess: {
                    data.enforceInterface(DESCRIPTOR);
                    this.OnPrintSuccess();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_OnPrintFail: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    this.OnPrintFail(_arg0);
                    reply.writeNoException();
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.seuic.android.PrinterListener {
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
            public void OnPrintSuccess() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_OnPrintSuccess, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void OnPrintFail(int returnCode) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(returnCode);
                    mRemote.transact(Stub.TRANSACTION_OnPrintFail, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }

        static final int TRANSACTION_OnPrintSuccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_OnPrintFail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    }

    public void OnPrintSuccess() throws android.os.RemoteException;

    public void OnPrintFail(int returnCode) throws android.os.RemoteException;
}
