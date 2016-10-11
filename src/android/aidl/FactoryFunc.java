/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Test\\printDemo\\app\\src\\main\\aidl\\com\\seuic\\android\\FactoryFunc.aidl
 */
package com.seuic.android;

public interface FactoryFunc extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.seuic.android.FactoryFunc {
        private static final java.lang.String DESCRIPTOR = "com.seuic.android.FactoryFunc";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.seuic.android.FactoryFunc interface,
         * generating a proxy if needed.
         */
        public static com.seuic.android.FactoryFunc asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.seuic.android.FactoryFunc))) {
                return ((com.seuic.android.FactoryFunc) iin);
            }
            return new com.seuic.android.FactoryFunc.Stub.Proxy(obj);
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
                case TRANSACTION_CheckUpdate: {
                    data.enforceInterface(DESCRIPTOR);
                    java.lang.String _arg0;
                    _arg0 = data.readString();
                    java.lang.String _arg1;
                    _arg1 = data.readString();
                    int _result = this.CheckUpdate(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_StartUpdate: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.StartUpdate();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.seuic.android.FactoryFunc {
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
            public int CheckUpdate(java.lang.String sysAddress, java.lang.String serviceAddress) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeString(sysAddress);
                    _data.writeString(serviceAddress);
                    mRemote.transact(Stub.TRANSACTION_CheckUpdate, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int StartUpdate() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_StartUpdate, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
        }

        static final int TRANSACTION_CheckUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_StartUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    }

    public int CheckUpdate(java.lang.String sysAddress, java.lang.String serviceAddress) throws android.os.RemoteException;

    public int StartUpdate() throws android.os.RemoteException;
}
