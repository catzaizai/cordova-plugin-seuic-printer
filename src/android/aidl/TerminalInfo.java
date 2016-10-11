/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Test\\printDemo\\app\\src\\main\\aidl\\com\\seuic\\android\\TerminalInfo.aidl
 */
package com.seuic.android;

public interface TerminalInfo extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.seuic.android.TerminalInfo {
        private static final java.lang.String DESCRIPTOR = "com.seuic.android.TerminalInfo";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.seuic.android.TerminalInfo interface,
         * generating a proxy if needed.
         */
        public static com.seuic.android.TerminalInfo asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.seuic.android.TerminalInfo))) {
                return ((com.seuic.android.TerminalInfo) iin);
            }
            return new com.seuic.android.TerminalInfo.Stub.Proxy(obj);
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
                case TRANSACTION_SetSKey: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    int _result = this.SetSKey(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_GetSKey: {
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
                    int _result = this.GetSKey(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg0);
                    reply.writeIntArray(_arg1);
                    return true;
                }
                case TRANSACTION_SetCustomNum: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    int _result = this.SetCustomNum(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_GetCustomNum: {
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
                    int _result = this.GetCustomNum(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg0);
                    reply.writeIntArray(_arg1);
                    return true;
                }
                case TRANSACTION_SetCustomName: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    int _result = this.SetCustomName(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_GetCustomName: {
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
                    int _result = this.GetCustomName(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg0);
                    reply.writeIntArray(_arg1);
                    return true;
                }
                case TRANSACTION_SetTermNum: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    int _result = this.SetTermNum(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_GetTermNum: {
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
                    int _result = this.GetTermNum(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg0);
                    reply.writeIntArray(_arg1);
                    return true;
                }
                case TRANSACTION_SetPinPadID: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    int _result = this.SetPinPadID(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_GetPinPadID: {
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
                    int _result = this.GetPinPadID(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg0);
                    reply.writeIntArray(_arg1);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.seuic.android.TerminalInfo {
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
            public int SetSKey(byte[] skey) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(skey);
                    mRemote.transact(Stub.TRANSACTION_SetSKey, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int GetSKey(byte[] skey, int[] skey_len) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((skey == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(skey.length);
                    }
                    if ((skey_len == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(skey_len.length);
                    }
                    mRemote.transact(Stub.TRANSACTION_GetSKey, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                    _reply.readByteArray(skey);
                    _reply.readIntArray(skey_len);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int SetCustomNum(byte[] num) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(num);
                    mRemote.transact(Stub.TRANSACTION_SetCustomNum, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int GetCustomNum(byte[] num, int[] num_len) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((num == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(num.length);
                    }
                    if ((num_len == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(num_len.length);
                    }
                    mRemote.transact(Stub.TRANSACTION_GetCustomNum, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                    _reply.readByteArray(num);
                    _reply.readIntArray(num_len);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int SetCustomName(byte[] name) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(name);
                    mRemote.transact(Stub.TRANSACTION_SetCustomName, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int GetCustomName(byte[] name, int[] name_len) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((name == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(name.length);
                    }
                    if ((name_len == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(name_len.length);
                    }
                    mRemote.transact(Stub.TRANSACTION_GetCustomName, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                    _reply.readByteArray(name);
                    _reply.readIntArray(name_len);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int SetTermNum(byte[] num) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(num);
                    mRemote.transact(Stub.TRANSACTION_SetTermNum, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int GetTermNum(byte[] num, int[] num_len) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((num == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(num.length);
                    }
                    if ((num_len == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(num_len.length);
                    }
                    mRemote.transact(Stub.TRANSACTION_GetTermNum, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                    _reply.readByteArray(num);
                    _reply.readIntArray(num_len);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int SetPinPadID(byte[] id) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(id);
                    mRemote.transact(Stub.TRANSACTION_SetPinPadID, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int GetPinPadID(byte[] id, int[] id_len) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((id == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(id.length);
                    }
                    if ((id_len == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(id_len.length);
                    }
                    mRemote.transact(Stub.TRANSACTION_GetPinPadID, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                    _reply.readByteArray(id);
                    _reply.readIntArray(id_len);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
        }

        static final int TRANSACTION_SetSKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_GetSKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_SetCustomNum = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_GetCustomNum = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
        static final int TRANSACTION_SetCustomName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
        static final int TRANSACTION_GetCustomName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
        static final int TRANSACTION_SetTermNum = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
        static final int TRANSACTION_GetTermNum = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
        static final int TRANSACTION_SetPinPadID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
        static final int TRANSACTION_GetPinPadID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    }

    public int SetSKey(byte[] skey) throws android.os.RemoteException;

    public int GetSKey(byte[] skey, int[] skey_len) throws android.os.RemoteException;

    public int SetCustomNum(byte[] num) throws android.os.RemoteException;

    public int GetCustomNum(byte[] num, int[] num_len) throws android.os.RemoteException;

    public int SetCustomName(byte[] name) throws android.os.RemoteException;

    public int GetCustomName(byte[] name, int[] name_len) throws android.os.RemoteException;

    public int SetTermNum(byte[] num) throws android.os.RemoteException;

    public int GetTermNum(byte[] num, int[] num_len) throws android.os.RemoteException;

    public int SetPinPadID(byte[] id) throws android.os.RemoteException;

    public int GetPinPadID(byte[] id, int[] id_len) throws android.os.RemoteException;
}
