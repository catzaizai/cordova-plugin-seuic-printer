/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Test\\printDemo\\app\\src\\main\\aidl\\com\\seuic\\android\\MifareReadListener.aidl
 */
package com.seuic.android;

public interface MifareReadListener extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.seuic.android.MifareReadListener {
        private static final java.lang.String DESCRIPTOR = "com.seuic.android.MifareReadListener";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.seuic.android.MifareReadListener interface,
         * generating a proxy if needed.
         */
        public static com.seuic.android.MifareReadListener asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.seuic.android.MifareReadListener))) {
                return ((com.seuic.android.MifareReadListener) iin);
            }
            return new com.seuic.android.MifareReadListener.Stub.Proxy(obj);
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
                case TRANSACTION_OnSuccess: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    this.OnSuccess(_arg0);
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

        private static class Proxy implements com.seuic.android.MifareReadListener {
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
            public void OnSuccess(byte[] readData) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(readData);
                    mRemote.transact(Stub.TRANSACTION_OnSuccess, _data, _reply, 0);
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

        static final int TRANSACTION_OnSuccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_OnFail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    }

    public void OnSuccess(byte[] readData) throws android.os.RemoteException;

    public void OnFail(int returnCode) throws android.os.RemoteException;
}
