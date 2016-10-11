/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Test\\printDemo\\app\\src\\main\\aidl\\com\\seuic\\android\\MifareReader.aidl
 */
package com.seuic.android;

public interface MifareReader extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.seuic.android.MifareReader {
        private static final java.lang.String DESCRIPTOR = "com.seuic.android.MifareReader";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.seuic.android.MifareReader interface,
         * generating a proxy if needed.
         */
        public static com.seuic.android.MifareReader asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.seuic.android.MifareReader))) {
                return ((com.seuic.android.MifareReader) iin);
            }
            return new com.seuic.android.MifareReader.Stub.Proxy(obj);
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
                case TRANSACTION_read: {
                    data.enforceInterface(DESCRIPTOR);
                    com.seuic.android.MifareReadListener _arg0;
                    _arg0 = com.seuic.android.MifareReadListener.Stub.asInterface(data.readStrongBinder());
                    byte _arg1;
                    _arg1 = data.readByte();
                    byte _arg2;
                    _arg2 = data.readByte();
                    byte[] _arg3;
                    _arg3 = data.createByteArray();
                    byte[] _arg4;
                    _arg4 = data.createByteArray();
                    int _arg5;
                    _arg5 = data.readInt();
                    int _result = this.read(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_write: {
                    data.enforceInterface(DESCRIPTOR);
                    com.seuic.android.MifareWriteListener _arg0;
                    _arg0 = com.seuic.android.MifareWriteListener.Stub.asInterface(data.readStrongBinder());
                    byte _arg1;
                    _arg1 = data.readByte();
                    byte _arg2;
                    _arg2 = data.readByte();
                    byte[] _arg3;
                    _arg3 = data.createByteArray();
                    byte[] _arg4;
                    _arg4 = data.createByteArray();
                    byte[] _arg5;
                    _arg5 = data.createByteArray();
                    int _arg6;
                    _arg6 = data.readInt();
                    int _result = this.write(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_cancel: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.cancel();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.seuic.android.MifareReader {
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
            public int read(com.seuic.android.MifareReadListener listener, byte section, byte block, byte[] keyA, byte[] keyB, int overtime) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    _data.writeByte(section);
                    _data.writeByte(block);
                    _data.writeByteArray(keyA);
                    _data.writeByteArray(keyB);
                    _data.writeInt(overtime);
                    mRemote.transact(Stub.TRANSACTION_read, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int write(com.seuic.android.MifareWriteListener listener, byte section, byte block, byte[] keyA, byte[] keyB, byte[] writeData, int overtime) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    _data.writeByte(section);
                    _data.writeByte(block);
                    _data.writeByteArray(keyA);
                    _data.writeByteArray(keyB);
                    _data.writeByteArray(writeData);
                    _data.writeInt(overtime);
                    mRemote.transact(Stub.TRANSACTION_write, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int cancel() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_cancel, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
        }

        static final int TRANSACTION_read = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_write = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_cancel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    }

    public int read(com.seuic.android.MifareReadListener listener, byte section, byte block, byte[] keyA, byte[] keyB, int overtime) throws android.os.RemoteException;

    public int write(com.seuic.android.MifareWriteListener listener, byte section, byte block, byte[] keyA, byte[] keyB, byte[] writeData, int overtime) throws android.os.RemoteException;

    public int cancel() throws android.os.RemoteException;
}
