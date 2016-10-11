/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Test\\printDemo\\app\\src\\main\\aidl\\com\\seuic\\android\\Hash.aidl
 */
package com.seuic.android;

public interface Hash extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.seuic.android.Hash {
        private static final java.lang.String DESCRIPTOR = "com.seuic.android.Hash";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.seuic.android.Hash interface,
         * generating a proxy if needed.
         */
        public static com.seuic.android.Hash asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.seuic.android.Hash))) {
                return ((com.seuic.android.Hash) iin);
            }
            return new com.seuic.android.Hash.Stub.Proxy(obj);
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
                case TRANSACTION_Sha1: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    byte[] _arg1;
                    int _arg1_length = data.readInt();
                    if ((_arg1_length < 0)) {
                        _arg1 = null;
                    } else {
                        _arg1 = new byte[_arg1_length];
                    }
                    int _result = this.Sha1(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg1);
                    return true;
                }
                case TRANSACTION_Sha256: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    byte[] _arg1;
                    int _arg1_length = data.readInt();
                    if ((_arg1_length < 0)) {
                        _arg1 = null;
                    } else {
                        _arg1 = new byte[_arg1_length];
                    }
                    int _result = this.Sha256(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg1);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.seuic.android.Hash {
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
            public int Sha1(byte[] msg, byte[] hash) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(msg);
                    if ((hash == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(hash.length);
                    }
                    mRemote.transact(Stub.TRANSACTION_Sha1, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                    _reply.readByteArray(hash);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int Sha256(byte[] msg, byte[] hash) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(msg);
                    if ((hash == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(hash.length);
                    }
                    mRemote.transact(Stub.TRANSACTION_Sha256, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                    _reply.readByteArray(hash);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
        }

        static final int TRANSACTION_Sha1 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_Sha256 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    }

    public int Sha1(byte[] msg, byte[] hash) throws android.os.RemoteException;

    public int Sha256(byte[] msg, byte[] hash) throws android.os.RemoteException;
}
