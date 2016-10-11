/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Test\\printDemo\\app\\src\\main\\aidl\\com\\seuic\\android\\ServerCert.aidl
 */
package com.seuic.android;

public interface ServerCert extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.seuic.android.ServerCert {
        private static final java.lang.String DESCRIPTOR = "com.seuic.android.ServerCert";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.seuic.android.ServerCert interface,
         * generating a proxy if needed.
         */
        public static com.seuic.android.ServerCert asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.seuic.android.ServerCert))) {
                return ((com.seuic.android.ServerCert) iin);
            }
            return new com.seuic.android.ServerCert.Stub.Proxy(obj);
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
                case TRANSACTION_Download: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    int _result = this.Download(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_DownloadPubkey: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    byte[] _arg1;
                    _arg1 = data.createByteArray();
                    int _result = this.DownloadPubkey(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_Verify: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    byte[] _arg1;
                    _arg1 = data.createByteArray();
                    int _result = this.Verify(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_VerifyHash: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    byte[] _arg1;
                    _arg1 = data.createByteArray();
                    int _result = this.VerifyHash(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_Enc: {
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
                    int[] _arg2;
                    int _arg2_length = data.readInt();
                    if ((_arg2_length < 0)) {
                        _arg2 = null;
                    } else {
                        _arg2 = new int[_arg2_length];
                    }
                    int _result = this.Enc(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg1);
                    reply.writeIntArray(_arg2);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.seuic.android.ServerCert {
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
            public int Download(byte[] cert) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(cert);
                    mRemote.transact(Stub.TRANSACTION_Download, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int DownloadPubkey(byte[] n, byte[] e) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(n);
                    _data.writeByteArray(e);
                    mRemote.transact(Stub.TRANSACTION_DownloadPubkey, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int Verify(byte[] abc_data, byte[] sign) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(abc_data);
                    _data.writeByteArray(sign);
                    mRemote.transact(Stub.TRANSACTION_Verify, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int VerifyHash(byte[] hash, byte[] sign) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(hash);
                    _data.writeByteArray(sign);
                    mRemote.transact(Stub.TRANSACTION_VerifyHash, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int Enc(byte[] plain, byte[] enc, int[] enc_len) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(plain);
                    if ((enc == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(enc.length);
                    }
                    if ((enc_len == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(enc_len.length);
                    }
                    mRemote.transact(Stub.TRANSACTION_Enc, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                    _reply.readByteArray(enc);
                    _reply.readIntArray(enc_len);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
        }

        static final int TRANSACTION_Download = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_DownloadPubkey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_Verify = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_VerifyHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
        static final int TRANSACTION_Enc = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    }

    public int Download(byte[] cert) throws android.os.RemoteException;

    public int DownloadPubkey(byte[] n, byte[] e) throws android.os.RemoteException;

    public int Verify(byte[] abc_data, byte[] sign) throws android.os.RemoteException;

    public int VerifyHash(byte[] hash, byte[] sign) throws android.os.RemoteException;

    public int Enc(byte[] plain, byte[] enc, int[] enc_len) throws android.os.RemoteException;
}
