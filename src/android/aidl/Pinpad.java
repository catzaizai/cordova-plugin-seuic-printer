/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Test\\printDemo\\app\\src\\main\\aidl\\com\\seuic\\android\\Pinpad.aidl
 */
package com.seuic.android;

public interface Pinpad extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.seuic.android.Pinpad {
        private static final java.lang.String DESCRIPTOR = "com.seuic.android.Pinpad";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.seuic.android.Pinpad interface,
         * generating a proxy if needed.
         */
        public static com.seuic.android.Pinpad asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.seuic.android.Pinpad))) {
                return ((com.seuic.android.Pinpad) iin);
            }
            return new com.seuic.android.Pinpad.Stub.Proxy(obj);
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
                case TRANSACTION_GetSN: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    int _arg0_length = data.readInt();
                    if ((_arg0_length < 0)) {
                        _arg0 = null;
                    } else {
                        _arg0 = new byte[_arg0_length];
                    }
                    int[] _arg1;
                    int _arg1_length = data.readInt();
                    if ((_arg1_length < 0)) {
                        _arg1 = null;
                    } else {
                        _arg1 = new int[_arg1_length];
                    }
                    int _result = this.GetSN(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg0);
                    reply.writeIntArray(_arg1);
                    return true;
                }
                case TRANSACTION_DownloadPinK: {
                    data.enforceInterface(DESCRIPTOR);
                    byte _arg0;
                    _arg0 = data.readByte();
                    byte _arg1;
                    _arg1 = data.readByte();
                    byte[] _arg2;
                    _arg2 = data.createByteArray();
                    int _result = this.DownloadPinK(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_DownloadMacK: {
                    data.enforceInterface(DESCRIPTOR);
                    byte _arg0;
                    _arg0 = data.readByte();
                    byte _arg1;
                    _arg1 = data.readByte();
                    byte[] _arg2;
                    _arg2 = data.createByteArray();
                    int _result = this.DownloadMacK(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_DownloadDesK: {
                    data.enforceInterface(DESCRIPTOR);
                    byte _arg0;
                    _arg0 = data.readByte();
                    byte _arg1;
                    _arg1 = data.readByte();
                    byte[] _arg2;
                    _arg2 = data.createByteArray();
                    int _result = this.DownloadDesK(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_EnterPin: {
                    data.enforceInterface(DESCRIPTOR);
                    com.seuic.android.PinpadEnterPinListener _arg0;
                    _arg0 = com.seuic.android.PinpadEnterPinListener.Stub.asInterface(data.readStrongBinder());
                    byte _arg1;
                    _arg1 = data.readByte();
                    byte _arg2;
                    _arg2 = data.readByte();
                    byte _arg3;
                    _arg3 = data.readByte();
                    byte[] _arg4;
                    _arg4 = data.createByteArray();
                    int _arg5;
                    _arg5 = data.readInt();
                    int _result = this.EnterPin(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_StopEnterPin: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.StopEnterPin();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_Mac: {
                    data.enforceInterface(DESCRIPTOR);
                    byte _arg0;
                    _arg0 = data.readByte();
                    byte[] _arg1;
                    _arg1 = data.createByteArray();
                    byte[] _arg2;
                    int _arg2_length = data.readInt();
                    if ((_arg2_length < 0)) {
                        _arg2 = null;
                    } else {
                        _arg2 = new byte[_arg2_length];
                    }
                    int _result = this.Mac(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg2);
                    return true;
                }
                case TRANSACTION_SetPinLen: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    int _result = this.SetPinLen(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_SetMacType: {
                    data.enforceInterface(DESCRIPTOR);
                    byte _arg0;
                    _arg0 = data.readByte();
                    int _result = this.SetMacType(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_TrackKeyEncrypt: {
                    data.enforceInterface(DESCRIPTOR);
                    byte _arg0;
                    _arg0 = data.readByte();
                    byte[] _arg1;
                    _arg1 = data.createByteArray();
                    byte[] _arg2;
                    int _arg2_length = data.readInt();
                    if ((_arg2_length < 0)) {
                        _arg2 = null;
                    } else {
                        _arg2 = new byte[_arg2_length];
                    }
                    int _result = this.TrackKeyEncrypt(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg2);
                    return true;
                }
                case TRANSACTION_TrackKeyDecrypt: {
                    data.enforceInterface(DESCRIPTOR);
                    byte _arg0;
                    _arg0 = data.readByte();
                    byte[] _arg1;
                    _arg1 = data.createByteArray();
                    byte[] _arg2;
                    int _arg2_length = data.readInt();
                    if ((_arg2_length < 0)) {
                        _arg2 = null;
                    } else {
                        _arg2 = new byte[_arg2_length];
                    }
                    int _result = this.TrackKeyDecrypt(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg2);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.seuic.android.Pinpad {
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
            public int GetSN(byte[] sn, int[] sn_len) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((sn == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(sn.length);
                    }
                    if ((sn_len == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(sn_len.length);
                    }
                    mRemote.transact(Stub.TRANSACTION_GetSN, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                    _reply.readByteArray(sn);
                    _reply.readIntArray(sn_len);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int DownloadPinK(byte mk_index, byte index, byte[] key) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByte(mk_index);
                    _data.writeByte(index);
                    _data.writeByteArray(key);
                    mRemote.transact(Stub.TRANSACTION_DownloadPinK, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int DownloadMacK(byte mk_index, byte index, byte[] key) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByte(mk_index);
                    _data.writeByte(index);
                    _data.writeByteArray(key);
                    mRemote.transact(Stub.TRANSACTION_DownloadMacK, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int DownloadDesK(byte mk_index, byte index, byte[] key) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByte(mk_index);
                    _data.writeByte(index);
                    _data.writeByteArray(key);
                    mRemote.transact(Stub.TRANSACTION_DownloadDesK, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int EnterPin(com.seuic.android.PinpadEnterPinListener listener, byte pink_index, byte pin_mode, byte desk_index, byte[] track_key, int overtime) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    _data.writeByte(pink_index);
                    _data.writeByte(pin_mode);
                    _data.writeByte(desk_index);
                    _data.writeByteArray(track_key);
                    _data.writeInt(overtime);
                    mRemote.transact(Stub.TRANSACTION_EnterPin, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int StopEnterPin() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_StopEnterPin, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int Mac(byte key_index, byte[] inData, byte[] mac) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByte(key_index);
                    _data.writeByteArray(inData);
                    if ((mac == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(mac.length);
                    }
                    mRemote.transact(Stub.TRANSACTION_Mac, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                    _reply.readByteArray(mac);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int SetPinLen(byte[] pinLen) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(pinLen);
                    mRemote.transact(Stub.TRANSACTION_SetPinLen, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int SetMacType(byte type) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByte(type);
                    mRemote.transact(Stub.TRANSACTION_SetMacType, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int TrackKeyEncrypt(byte key_index, byte[] indata, byte[] outdata) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByte(key_index);
                    _data.writeByteArray(indata);
                    if ((outdata == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(outdata.length);
                    }
                    mRemote.transact(Stub.TRANSACTION_TrackKeyEncrypt, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                    _reply.readByteArray(outdata);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int TrackKeyDecrypt(byte key_index, byte[] indata, byte[] outdata) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByte(key_index);
                    _data.writeByteArray(indata);
                    if ((outdata == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(outdata.length);
                    }
                    mRemote.transact(Stub.TRANSACTION_TrackKeyDecrypt, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                    _reply.readByteArray(outdata);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
        }

        static final int TRANSACTION_GetSN = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_DownloadPinK = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_DownloadMacK = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_DownloadDesK = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
        static final int TRANSACTION_EnterPin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
        static final int TRANSACTION_StopEnterPin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
        static final int TRANSACTION_Mac = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
        static final int TRANSACTION_SetPinLen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
        static final int TRANSACTION_SetMacType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
        static final int TRANSACTION_TrackKeyEncrypt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
        static final int TRANSACTION_TrackKeyDecrypt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    }

    public int GetSN(byte[] sn, int[] sn_len) throws android.os.RemoteException;

    public int DownloadPinK(byte mk_index, byte index, byte[] key) throws android.os.RemoteException;

    public int DownloadMacK(byte mk_index, byte index, byte[] key) throws android.os.RemoteException;

    public int DownloadDesK(byte mk_index, byte index, byte[] key) throws android.os.RemoteException;

    public int EnterPin(com.seuic.android.PinpadEnterPinListener listener, byte pink_index, byte pin_mode, byte desk_index, byte[] track_key, int overtime) throws android.os.RemoteException;

    public int StopEnterPin() throws android.os.RemoteException;

    public int Mac(byte key_index, byte[] inData, byte[] mac) throws android.os.RemoteException;

    public int SetPinLen(byte[] pinLen) throws android.os.RemoteException;

    public int SetMacType(byte type) throws android.os.RemoteException;

    public int TrackKeyEncrypt(byte key_index, byte[] indata, byte[] outdata) throws android.os.RemoteException;

    public int TrackKeyDecrypt(byte key_index, byte[] indata, byte[] outdata) throws android.os.RemoteException;
}
