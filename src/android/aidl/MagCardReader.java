/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Test\\printDemo\\app\\src\\main\\aidl\\com\\seuic\\android\\MagCardReader.aidl
 */
package com.seuic.android;

public interface MagCardReader extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.seuic.android.MagCardReader {
        private static final java.lang.String DESCRIPTOR = "com.seuic.android.MagCardReader";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.seuic.android.MagCardReader interface,
         * generating a proxy if needed.
         */
        public static com.seuic.android.MagCardReader asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.seuic.android.MagCardReader))) {
                return ((com.seuic.android.MagCardReader) iin);
            }
            return new com.seuic.android.MagCardReader.Stub.Proxy(obj);
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
                case TRANSACTION_startSwipe: {
                    data.enforceInterface(DESCRIPTOR);
                    com.seuic.android.MagCardSwipeListener _arg0;
                    _arg0 = com.seuic.android.MagCardSwipeListener.Stub.asInterface(data.readStrongBinder());
                    byte _arg1;
                    _arg1 = data.readByte();
                    byte _arg2;
                    _arg2 = data.readByte();
                    byte[] _arg3;
                    _arg3 = data.createByteArray();
                    int _arg4;
                    _arg4 = data.readInt();
                    int _result = this.startSwipe(_arg0, _arg1, _arg2, _arg3, _arg4);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_stopSwipe: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.stopSwipe();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.seuic.android.MagCardReader {
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
            public int startSwipe(com.seuic.android.MagCardSwipeListener listener, byte key_index, byte track_type, byte[] track_key, int overtime) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    _data.writeByte(key_index);
                    _data.writeByte(track_type);
                    _data.writeByteArray(track_key);
                    _data.writeInt(overtime);
                    mRemote.transact(Stub.TRANSACTION_startSwipe, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int stopSwipe() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_stopSwipe, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
        }

        static final int TRANSACTION_startSwipe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_stopSwipe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    }

    public int startSwipe(com.seuic.android.MagCardSwipeListener listener, byte key_index, byte track_type, byte[] track_key, int overtime) throws android.os.RemoteException;

    public int stopSwipe() throws android.os.RemoteException;
}
