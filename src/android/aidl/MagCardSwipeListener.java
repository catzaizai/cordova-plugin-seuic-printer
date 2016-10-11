/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Test\\printDemo\\app\\src\\main\\aidl\\com\\seuic\\android\\MagCardSwipeListener.aidl
 */
package com.seuic.android;

public interface MagCardSwipeListener extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.seuic.android.MagCardSwipeListener {
        private static final java.lang.String DESCRIPTOR = "com.seuic.android.MagCardSwipeListener";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.seuic.android.MagCardSwipeListener interface,
         * generating a proxy if needed.
         */
        public static com.seuic.android.MagCardSwipeListener asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.seuic.android.MagCardSwipeListener))) {
                return ((com.seuic.android.MagCardSwipeListener) iin);
            }
            return new com.seuic.android.MagCardSwipeListener.Stub.Proxy(obj);
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
                    byte[] _arg2;
                    _arg2 = data.createByteArray();
                    int _arg3;
                    _arg3 = data.readInt();
                    byte[] _arg4;
                    _arg4 = data.createByteArray();
                    int _arg5;
                    _arg5 = data.readInt();
                    byte[] _arg6;
                    _arg6 = data.createByteArray();
                    int _arg7;
                    _arg7 = data.readInt();
                    this.OnSuccess(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
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
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.seuic.android.MagCardSwipeListener {
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
            public void OnSuccess(byte[] pan, int panLen, byte[] trackData, int trackLen, byte[] track2Data, int track2Len, byte[] track3Data, int track3Len) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(pan);
                    _data.writeInt(panLen);
                    _data.writeByteArray(trackData);
                    _data.writeInt(trackLen);
                    _data.writeByteArray(track2Data);
                    _data.writeInt(track2Len);
                    _data.writeByteArray(track3Data);
                    _data.writeInt(track3Len);
                    mRemote.transact(Stub.TRANSACTION_OnSuccess, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void OnFail(int returnCode) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(returnCode);
                    mRemote.transact(Stub.TRANSACTION_OnFail, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }

        static final int TRANSACTION_OnSuccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_OnFail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    }

    public void OnSuccess(byte[] pan, int panLen, byte[] trackData, int trackLen, byte[] track2Data, int track2Len, byte[] track3Data, int track3Len) throws android.os.RemoteException;

    public void OnFail(int returnCode) throws android.os.RemoteException;
}
