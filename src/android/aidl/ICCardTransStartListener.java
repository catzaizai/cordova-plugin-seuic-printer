/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Test\\printDemo\\app\\src\\main\\aidl\\com\\seuic\\android\\ICCardTransStartListener.aidl
 */
package com.seuic.android;

public interface ICCardTransStartListener extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.seuic.android.ICCardTransStartListener {
        private static final java.lang.String DESCRIPTOR = "com.seuic.android.ICCardTransStartListener";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.seuic.android.ICCardTransStartListener interface,
         * generating a proxy if needed.
         */
        public static com.seuic.android.ICCardTransStartListener asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.seuic.android.ICCardTransStartListener))) {
                return ((com.seuic.android.ICCardTransStartListener) iin);
            }
            return new com.seuic.android.ICCardTransStartListener.Stub.Proxy(obj);
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
                case TRANSACTION_OnIcCardInsert: {
                    data.enforceInterface(DESCRIPTOR);
                    this.OnIcCardInsert();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_OnUseICCard: {
                    data.enforceInterface(DESCRIPTOR);
                    this.OnUseICCard();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_OnFallback: {
                    data.enforceInterface(DESCRIPTOR);
                    this.OnFallback();
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_OnICCardField55: {
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
                    byte _arg6;
                    _arg6 = data.readByte();
                    this.OnICCardField55(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_OnTrackPlain: {
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
                    this.OnTrackPlain(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
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
                case TRANSACTION_OnQPbocField55: {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _arg0;
                    _arg0 = (0 != data.readInt());
                    byte[] _arg1;
                    _arg1 = data.createByteArray();
                    int _arg2;
                    _arg2 = data.readInt();
                    byte[] _arg3;
                    _arg3 = data.createByteArray();
                    int _arg4;
                    _arg4 = data.readInt();
                    byte[] _arg5;
                    _arg5 = data.createByteArray();
                    int _arg6;
                    _arg6 = data.readInt();
                    byte _arg7;
                    _arg7 = data.readByte();
                    this.OnQPbocField55(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
                    reply.writeNoException();
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.seuic.android.ICCardTransStartListener {
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
            public void OnIcCardInsert() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_OnIcCardInsert, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void OnUseICCard() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_OnUseICCard, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void OnFallback() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_OnFallback, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void OnICCardField55(byte[] pan, int pan_len, byte[] feild55, int field55_len, byte[] track, int trackLen, byte panSeq) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(pan);
                    _data.writeInt(pan_len);
                    _data.writeByteArray(feild55);
                    _data.writeInt(field55_len);
                    _data.writeByteArray(track);
                    _data.writeInt(trackLen);
                    _data.writeByte(panSeq);
                    mRemote.transact(Stub.TRANSACTION_OnICCardField55, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override
            public void OnTrackPlain(byte[] pan, int pan_len, byte[] trackData, int trackLen, byte[] track2Data, int track2Len, byte[] track3Data, int track3Len) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByteArray(pan);
                    _data.writeInt(pan_len);
                    _data.writeByteArray(trackData);
                    _data.writeInt(trackLen);
                    _data.writeByteArray(track2Data);
                    _data.writeInt(track2Len);
                    _data.writeByteArray(track3Data);
                    _data.writeInt(track3Len);
                    mRemote.transact(Stub.TRANSACTION_OnTrackPlain, _data, _reply, 0);
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

            @Override
            public void OnQPbocField55(boolean is_tc, byte[] pan, int pan_len, byte[] feild55, int field55_len, byte[] track, int trackLen, byte panSeq) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(((is_tc) ? (1) : (0)));
                    _data.writeByteArray(pan);
                    _data.writeInt(pan_len);
                    _data.writeByteArray(feild55);
                    _data.writeInt(field55_len);
                    _data.writeByteArray(track);
                    _data.writeInt(trackLen);
                    _data.writeByte(panSeq);
                    mRemote.transact(Stub.TRANSACTION_OnQPbocField55, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }

        static final int TRANSACTION_OnIcCardInsert = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_OnUseICCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_OnFallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_OnICCardField55 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
        static final int TRANSACTION_OnTrackPlain = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
        static final int TRANSACTION_OnFail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
        static final int TRANSACTION_OnQPbocField55 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    }

    public void OnIcCardInsert() throws android.os.RemoteException;

    public void OnUseICCard() throws android.os.RemoteException;

    public void OnFallback() throws android.os.RemoteException;

    public void OnICCardField55(byte[] pan, int pan_len, byte[] feild55, int field55_len, byte[] track, int trackLen, byte panSeq) throws android.os.RemoteException;

    public void OnTrackPlain(byte[] pan, int pan_len, byte[] trackData, int trackLen, byte[] track2Data, int track2Len, byte[] track3Data, int track3Len) throws android.os.RemoteException;

    public void OnFail(int returnCode) throws android.os.RemoteException;

    public void OnQPbocField55(boolean is_tc, byte[] pan, int pan_len, byte[] feild55, int field55_len, byte[] track, int trackLen, byte panSeq) throws android.os.RemoteException;
}
