/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Test\\printDemo\\app\\src\\main\\aidl\\com\\seuic\\android\\ICCardReader.aidl
 */
package com.seuic.android;

public interface ICCardReader extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.seuic.android.ICCardReader {
        private static final java.lang.String DESCRIPTOR = "com.seuic.android.ICCardReader";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.seuic.android.ICCardReader interface,
         * generating a proxy if needed.
         */
        public static com.seuic.android.ICCardReader asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.seuic.android.ICCardReader))) {
                return ((com.seuic.android.ICCardReader) iin);
            }
            return new com.seuic.android.ICCardReader.Stub.Proxy(obj);
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
                case TRANSACTION_getEccBalance: {
                    data.enforceInterface(DESCRIPTOR);
                    com.seuic.android.ICCardGetEccListener _arg0;
                    _arg0 = com.seuic.android.ICCardGetEccListener.Stub.asInterface(data.readStrongBinder());
                    int _arg1;
                    _arg1 = data.readInt();
                    int _result = this.getEccBalance(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_transStart: {
                    data.enforceInterface(DESCRIPTOR);
                    com.seuic.android.ICCardTransStartListener _arg0;
                    _arg0 = com.seuic.android.ICCardTransStartListener.Stub.asInterface(data.readStrongBinder());
                    byte[] _arg1;
                    _arg1 = data.createByteArray();
                    byte[] _arg2;
                    _arg2 = data.createByteArray();
                    byte[] _arg3;
                    _arg3 = data.createByteArray();
                    byte _arg4;
                    _arg4 = data.readByte();
                    byte _arg5;
                    _arg5 = data.readByte();
                    byte _arg6;
                    _arg6 = data.readByte();
                    byte[] _arg7;
                    _arg7 = data.createByteArray();
                    int _arg8;
                    _arg8 = data.readInt();
                    int _result = this.transStart(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_transFinish: {
                    data.enforceInterface(DESCRIPTOR);
                    com.seuic.android.ICCardTransFinishListener _arg0;
                    _arg0 = com.seuic.android.ICCardTransFinishListener.Stub.asInterface(data.readStrongBinder());
                    byte[] _arg1;
                    _arg1 = data.createByteArray();
                    int _arg2;
                    _arg2 = data.readInt();
                    int _arg3;
                    _arg3 = data.readInt();
                    int _result = this.transFinish(_arg0, _arg1, _arg2, _arg3);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_stopRequest: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.stopRequest();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_stopWaitTransFinish: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.stopWaitTransFinish();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_downloadAID: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    int _result = this.downloadAID(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_clearAIDs: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.clearAIDs();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_downloadPubkey: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    int _result = this.downloadPubkey(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_clearPubkeys: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.clearPubkeys();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_setQPbocTransType: {
                    data.enforceInterface(DESCRIPTOR);
                    byte _arg0;
                    _arg0 = data.readByte();
                    int _result = this.setQPbocTransType(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_getAIDCount: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getAIDCount();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_getAID: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
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
                    int _result = this.getAID(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg1);
                    reply.writeIntArray(_arg2);
                    return true;
                }
                case TRANSACTION_getPubkeyCount: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getPubkeyCount();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_getPubkey: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
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
                    int _result = this.getPubkey(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    reply.writeByteArray(_arg1);
                    reply.writeIntArray(_arg2);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.seuic.android.ICCardReader {
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
            public int getEccBalance(com.seuic.android.ICCardGetEccListener listener, int overtime) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    _data.writeInt(overtime);
                    mRemote.transact(Stub.TRANSACTION_getEccBalance, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int transStart(com.seuic.android.ICCardTransStartListener listener, byte[] amount, byte[] date, byte[] time, byte transtype, byte key_index, byte track_type, byte[] track_key, int overtime) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    _data.writeByteArray(amount);
                    _data.writeByteArray(date);
                    _data.writeByteArray(time);
                    _data.writeByte(transtype);
                    _data.writeByte(key_index);
                    _data.writeByte(track_type);
                    _data.writeByteArray(track_key);
                    _data.writeInt(overtime);
                    mRemote.transact(Stub.TRANSACTION_transStart, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int transFinish(com.seuic.android.ICCardTransFinishListener listener, byte[] issuer_data, int issuer_data_len, int overtime) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    _data.writeByteArray(issuer_data);
                    _data.writeInt(issuer_data_len);
                    _data.writeInt(overtime);
                    mRemote.transact(Stub.TRANSACTION_transFinish, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int stopRequest() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_stopRequest, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int stopWaitTransFinish() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_stopWaitTransFinish, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int downloadAID(byte[] aid) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(aid);
                    mRemote.transact(Stub.TRANSACTION_downloadAID, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int clearAIDs() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_clearAIDs, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int downloadPubkey(byte[] pubkey) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(pubkey);
                    mRemote.transact(Stub.TRANSACTION_downloadPubkey, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int clearPubkeys() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_clearPubkeys, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int setQPbocTransType(byte type) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByte(type);
                    mRemote.transact(Stub.TRANSACTION_setQPbocTransType, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int getAIDCount() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getAIDCount, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int getAID(int index, byte[] aid, int[] aid_len) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(index);
                    if ((aid == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(aid.length);
                    }
                    if ((aid_len == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(aid_len.length);
                    }
                    mRemote.transact(Stub.TRANSACTION_getAID, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                    _reply.readByteArray(aid);
                    _reply.readIntArray(aid_len);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int getPubkeyCount() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getPubkeyCount, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int getPubkey(int index, byte[] pubkey, int[] pubkey_len) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(index);
                    if ((pubkey == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(pubkey.length);
                    }
                    if ((pubkey_len == null)) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(pubkey_len.length);
                    }
                    mRemote.transact(Stub.TRANSACTION_getPubkey, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                    _reply.readByteArray(pubkey);
                    _reply.readIntArray(pubkey_len);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
        }

        static final int TRANSACTION_getEccBalance = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_transStart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_transFinish = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_stopRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
        static final int TRANSACTION_stopWaitTransFinish = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
        static final int TRANSACTION_downloadAID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
        static final int TRANSACTION_clearAIDs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
        static final int TRANSACTION_downloadPubkey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
        static final int TRANSACTION_clearPubkeys = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
        static final int TRANSACTION_setQPbocTransType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
        static final int TRANSACTION_getAIDCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
        static final int TRANSACTION_getAID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
        static final int TRANSACTION_getPubkeyCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
        static final int TRANSACTION_getPubkey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    }

    public int getEccBalance(com.seuic.android.ICCardGetEccListener listener, int overtime) throws android.os.RemoteException;

    public int transStart(com.seuic.android.ICCardTransStartListener listener, byte[] amount, byte[] date, byte[] time, byte transtype, byte key_index, byte track_type, byte[] track_key, int overtime) throws android.os.RemoteException;

    public int transFinish(com.seuic.android.ICCardTransFinishListener listener, byte[] issuer_data, int issuer_data_len, int overtime) throws android.os.RemoteException;

    public int stopRequest() throws android.os.RemoteException;

    public int stopWaitTransFinish() throws android.os.RemoteException;

    public int downloadAID(byte[] aid) throws android.os.RemoteException;

    public int clearAIDs() throws android.os.RemoteException;

    public int downloadPubkey(byte[] pubkey) throws android.os.RemoteException;

    public int clearPubkeys() throws android.os.RemoteException;

    public int setQPbocTransType(byte type) throws android.os.RemoteException;

    public int getAIDCount() throws android.os.RemoteException;

    public int getAID(int index, byte[] aid, int[] aid_len) throws android.os.RemoteException;

    public int getPubkeyCount() throws android.os.RemoteException;

    public int getPubkey(int index, byte[] pubkey, int[] pubkey_len) throws android.os.RemoteException;
}
