/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Test\\printDemo\\app\\src\\main\\aidl\\com\\seuic\\android\\TermCert.aidl
 */
package com.seuic.android;

public interface TermCert extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.seuic.android.TermCert {
        private static final java.lang.String DESCRIPTOR = "com.seuic.android.TermCert";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.seuic.android.TermCert interface,
         * generating a proxy if needed.
         */
        public static com.seuic.android.TermCert asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.seuic.android.TermCert))) {
                return ((com.seuic.android.TermCert) iin);
            }
            return new com.seuic.android.TermCert.Stub.Proxy(obj);
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
                case TRANSACTION_DownloadRsakey: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    byte[] _arg1;
                    _arg1 = data.createByteArray();
                    byte[] _arg2;
                    _arg2 = data.createByteArray();
                    byte[] _arg3;
                    _arg3 = data.createByteArray();
                    byte[] _arg4;
                    _arg4 = data.createByteArray();
                    byte[] _arg5;
                    _arg5 = data.createByteArray();
                    byte[] _arg6;
                    _arg6 = data.createByteArray();
                    byte[] _arg7;
                    _arg7 = data.createByteArray();
                    int _result = this.DownloadRsakey(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_SignRand: {
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
                    int _result = this.SignRand(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg1);
                    reply.writeIntArray(_arg2);
                    return true;
                }
                case TRANSACTION_SignHashWithSha1: {
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
                    int _result = this.SignHashWithSha1(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg1);
                    reply.writeIntArray(_arg2);
                    return true;
                }
                case TRANSACTION_SignHashWithSha256: {
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
                    int _result = this.SignHashWithSha256(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg1);
                    reply.writeIntArray(_arg2);
                    return true;
                }
                case TRANSACTION_DownloadSck: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    int _result = this.DownloadSck(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_SckEncrypt: {
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
                    int _result = this.SckEncrypt(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg1);
                    reply.writeIntArray(_arg2);
                    return true;
                }
                case TRANSACTION_SckDecrypt: {
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
                    int _result = this.SckDecrypt(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg1);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.seuic.android.TermCert {
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
            public int DownloadRsakey(byte[] n, byte[] e, byte[] d, byte[] p, byte[] q, byte[] dp, byte[] dq, byte[] u) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(n);
                    _data.writeByteArray(e);
                    _data.writeByteArray(d);
                    _data.writeByteArray(p);
                    _data.writeByteArray(q);
                    _data.writeByteArray(dp);
                    _data.writeByteArray(dq);
                    _data.writeByteArray(u);
                    mRemote.transact(Stub.TRANSACTION_DownloadRsakey, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int SignRand(byte[] rand, byte[] sign, int[] sign_len) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(rand);
                    if ((sign == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(sign.length);
                    }
                    if ((sign_len == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(sign_len.length);
                    }
                    mRemote.transact(Stub.TRANSACTION_SignRand, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                    _reply.readByteArray(sign);
                    _reply.readIntArray(sign_len);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int SignHashWithSha1(byte[] hash, byte[] sign, int[] sign_len) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(hash);
                    if ((sign == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(sign.length);
                    }
                    if ((sign_len == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(sign_len.length);
                    }
                    mRemote.transact(Stub.TRANSACTION_SignHashWithSha1, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                    _reply.readByteArray(sign);
                    _reply.readIntArray(sign_len);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int SignHashWithSha256(byte[] hash, byte[] sign, int[] sign_len) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(hash);
                    if ((sign == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(sign.length);
                    }
                    if ((sign_len == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(sign_len.length);
                    }
                    mRemote.transact(Stub.TRANSACTION_SignHashWithSha256, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                    _reply.readByteArray(sign);
                    _reply.readIntArray(sign_len);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int DownloadSck(byte[] enc_key) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(enc_key);
                    mRemote.transact(Stub.TRANSACTION_DownloadSck, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int SckEncrypt(byte[] plain, byte[] enc, int[] enc_len) throws android.os.RemoteException {
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
                    mRemote.transact(Stub.TRANSACTION_SckEncrypt, _data, _reply, 0);
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

            @Override
            public int SckDecrypt(byte[] enc, byte[] dec) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(enc);
                    if ((dec == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(dec.length);
                    }
                    mRemote.transact(Stub.TRANSACTION_SckDecrypt, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                    _reply.readByteArray(dec);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
        }

        static final int TRANSACTION_Download = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_DownloadRsakey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_SignRand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_SignHashWithSha1 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
        static final int TRANSACTION_SignHashWithSha256 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
        static final int TRANSACTION_DownloadSck = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
        static final int TRANSACTION_SckEncrypt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
        static final int TRANSACTION_SckDecrypt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    }

    public int Download(byte[] cert) throws android.os.RemoteException;

    public int DownloadRsakey(byte[] n, byte[] e, byte[] d, byte[] p, byte[] q, byte[] dp, byte[] dq, byte[] u) throws android.os.RemoteException;

    public int SignRand(byte[] rand, byte[] sign, int[] sign_len) throws android.os.RemoteException;

    public int SignHashWithSha1(byte[] hash, byte[] sign, int[] sign_len) throws android.os.RemoteException;

    public int SignHashWithSha256(byte[] hash, byte[] sign, int[] sign_len) throws android.os.RemoteException;

    public int DownloadSck(byte[] enc_key) throws android.os.RemoteException;

    public int SckEncrypt(byte[] plain, byte[] enc, int[] enc_len) throws android.os.RemoteException;

    public int SckDecrypt(byte[] enc, byte[] dec) throws android.os.RemoteException;
}
