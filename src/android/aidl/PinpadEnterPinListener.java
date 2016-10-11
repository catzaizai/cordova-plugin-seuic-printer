/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Test\\printDemo\\app\\src\\main\\aidl\\com\\seuic\\android\\PinpadEnterPinListener.aidl
 */
package com.seuic.android;

public interface PinpadEnterPinListener extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.seuic.android.PinpadEnterPinListener {
        private static final java.lang.String DESCRIPTOR = "com.seuic.android.PinpadEnterPinListener";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.seuic.android.PinpadEnterPinListener interface,
         * generating a proxy if needed.
         */
        public static com.seuic.android.PinpadEnterPinListener asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.seuic.android.PinpadEnterPinListener))) {
                return ((com.seuic.android.PinpadEnterPinListener) iin);
            }
            return new com.seuic.android.PinpadEnterPinListener.Stub.Proxy(obj);
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
                    int _arg1;
                    _arg1 = data.readInt();
                    this.OnSuccess(_arg0, _arg1);
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
                case TRANSACTION_OnInput: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    this.OnInput(_arg0);
                    reply.writeNoException();
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.seuic.android.PinpadEnterPinListener {
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
            public void OnSuccess(byte[] enc, int enc_len) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(enc);
                    _data.writeInt(enc_len);
                    mRemote.transact(Stub.TRANSACTION_OnSuccess, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void OnFail(int error_code) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(error_code);
                    mRemote.transact(Stub.TRANSACTION_OnFail, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void OnInput(int input_num) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(input_num);
                    mRemote.transact(Stub.TRANSACTION_OnInput, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }

        static final int TRANSACTION_OnSuccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_OnFail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_OnInput = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    }

    public void OnSuccess(byte[] enc, int enc_len) throws android.os.RemoteException;

    public void OnFail(int error_code) throws android.os.RemoteException;

    public void OnInput(int input_num) throws android.os.RemoteException;
}
