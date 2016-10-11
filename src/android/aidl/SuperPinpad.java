/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Test\\printDemo\\app\\src\\main\\aidl\\com\\seuic\\android\\SuperPinpad.aidl
 */
package com.seuic.android;

public interface SuperPinpad extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.seuic.android.SuperPinpad {
        private static final java.lang.String DESCRIPTOR = "com.seuic.android.SuperPinpad";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.seuic.android.SuperPinpad interface,
         * generating a proxy if needed.
         */
        public static com.seuic.android.SuperPinpad asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.seuic.android.SuperPinpad))) {
                return ((com.seuic.android.SuperPinpad) iin);
            }
            return new com.seuic.android.SuperPinpad.Stub.Proxy(obj);
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
                case TRANSACTION_DownloadMKFromPC: {
                    data.enforceInterface(DESCRIPTOR);
                    com.seuic.android.DownloadMKFromPCListener _arg0;
                    _arg0 = com.seuic.android.DownloadMKFromPCListener.Stub.asInterface(data.readStrongBinder());
                    byte _arg1;
                    _arg1 = data.readByte();
                    int _result = this.DownloadMKFromPC(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_StopDonloadMKFromPC: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.StopDonloadMKFromPC();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_SetSN: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    int _result = this.SetSN(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_SetSNASCII: {
                    data.enforceInterface(DESCRIPTOR);
                    byte[] _arg0;
                    _arg0 = data.createByteArray();
                    int _result = this.SetSNASCII(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_DownloadPinMK: {
                    data.enforceInterface(DESCRIPTOR);
                    byte _arg0;
                    _arg0 = data.readByte();
                    byte[] _arg1;
                    _arg1 = data.createByteArray();
                    int _result = this.DownloadPinMK(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_DownloadMacMK: {
                    data.enforceInterface(DESCRIPTOR);
                    byte _arg0;
                    _arg0 = data.readByte();
                    byte[] _arg1;
                    _arg1 = data.createByteArray();
                    int _result = this.DownloadMacMK(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_DownloadDesMK: {
                    data.enforceInterface(DESCRIPTOR);
                    byte _arg0;
                    _arg0 = data.readByte();
                    byte[] _arg1;
                    _arg1 = data.createByteArray();
                    int _result = this.DownloadDesMK(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_DownloadMagicMK: {
                    data.enforceInterface(DESCRIPTOR);
                    byte _arg0;
                    _arg0 = data.readByte();
                    byte _arg1;
                    _arg1 = data.readByte();
                    byte[] _arg2;
                    _arg2 = data.createByteArray();
                    int _result = this.DownloadMagicMK(_arg0, _arg1, _arg2);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.seuic.android.SuperPinpad {
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
            public int DownloadMKFromPC(com.seuic.android.DownloadMKFromPCListener listener, byte type) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    _data.writeByte(type);
                    mRemote.transact(Stub.TRANSACTION_DownloadMKFromPC, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int StopDonloadMKFromPC() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_StopDonloadMKFromPC, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int SetSN(byte[] sn) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(sn);
                    mRemote.transact(Stub.TRANSACTION_SetSN, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int SetSNASCII(byte[] sn) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(sn);
                    mRemote.transact(Stub.TRANSACTION_SetSNASCII, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int DownloadPinMK(byte index, byte[] key) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByte(index);
                    _data.writeByteArray(key);
                    mRemote.transact(Stub.TRANSACTION_DownloadPinMK, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int DownloadMacMK(byte index, byte[] key) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByte(index);
                    _data.writeByteArray(key);
                    mRemote.transact(Stub.TRANSACTION_DownloadMacMK, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int DownloadDesMK(byte index, byte[] key) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByte(index);
                    _data.writeByteArray(key);
                    mRemote.transact(Stub.TRANSACTION_DownloadDesMK, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int DownloadMagicMK(byte type, byte index, byte[] key) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByte(type);
                    _data.writeByte(index);
                    _data.writeByteArray(key);
                    mRemote.transact(Stub.TRANSACTION_DownloadMagicMK, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
        }

        static final int TRANSACTION_DownloadMKFromPC = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_StopDonloadMKFromPC = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_SetSN = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_SetSNASCII = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
        static final int TRANSACTION_DownloadPinMK = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
        static final int TRANSACTION_DownloadMacMK = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
        static final int TRANSACTION_DownloadDesMK = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
        static final int TRANSACTION_DownloadMagicMK = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    }

    public int DownloadMKFromPC(com.seuic.android.DownloadMKFromPCListener listener, byte type) throws android.os.RemoteException;

    public int StopDonloadMKFromPC() throws android.os.RemoteException;

    public int SetSN(byte[] sn) throws android.os.RemoteException;

    public int SetSNASCII(byte[] sn) throws android.os.RemoteException;

    public int DownloadPinMK(byte index, byte[] key) throws android.os.RemoteException;

    public int DownloadMacMK(byte index, byte[] key) throws android.os.RemoteException;

    public int DownloadDesMK(byte index, byte[] key) throws android.os.RemoteException;

    public int DownloadMagicMK(byte type, byte index, byte[] key) throws android.os.RemoteException;
}
