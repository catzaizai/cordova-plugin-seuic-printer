/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Test\\printDemo\\app\\src\\main\\aidl\\com\\seuic\\android\\PosdService.aidl
 */
package com.seuic.android;

public interface PosdService extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.seuic.android.PosdService {
        private static final java.lang.String DESCRIPTOR = "com.seuic.android.PosdService";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.seuic.android.PosdService interface,
         * generating a proxy if needed.
         */
        public static com.seuic.android.PosdService asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.seuic.android.PosdService))) {
                return ((com.seuic.android.PosdService) iin);
            }
            return new com.seuic.android.PosdService.Stub.Proxy(obj);
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
                case TRANSACTION_getServiceName: {
                    data.enforceInterface(DESCRIPTOR);
                    java.lang.String _result = this.getServiceName();
                    reply.writeNoException();
                    reply.writeString(_result);
                    return true;
                }
                case TRANSACTION_getMcuInfo: {
                    data.enforceInterface(DESCRIPTOR);
                    java.lang.String _result = this.getMcuInfo();
                    reply.writeNoException();
                    reply.writeString(_result);
                    return true;
                }
                case TRANSACTION_getMcuStatus: {
                    data.enforceInterface(DESCRIPTOR);
                    int _result = this.getMcuStatus();
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_isBatteryLow: {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _result = this.isBatteryLow();
                    reply.writeNoException();
                    reply.writeInt(((_result) ? (1) : (0)));
                    return true;
                }
                case TRANSACTION_getMagCardReader: {
                    data.enforceInterface(DESCRIPTOR);
                    android.os.IBinder _result = this.getMagCardReader();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getICCardReader: {
                    data.enforceInterface(DESCRIPTOR);
                    android.os.IBinder _result = this.getICCardReader();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getPrinter: {
                    data.enforceInterface(DESCRIPTOR);
                    android.os.IBinder _result = this.getPrinter();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getPinpad: {
                    data.enforceInterface(DESCRIPTOR);
                    android.os.IBinder _result = this.getPinpad();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getSuperPinpad: {
                    data.enforceInterface(DESCRIPTOR);
                    android.os.IBinder _result = this.getSuperPinpad();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getFactoryFunc: {
                    data.enforceInterface(DESCRIPTOR);
                    android.os.IBinder _result = this.getFactoryFunc();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getTerminalInfo: {
                    data.enforceInterface(DESCRIPTOR);
                    android.os.IBinder _result = this.getTerminalInfo();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getServerCert: {
                    data.enforceInterface(DESCRIPTOR);
                    android.os.IBinder _result = this.getServerCert();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getTermCert: {
                    data.enforceInterface(DESCRIPTOR);
                    android.os.IBinder _result = this.getTermCert();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_getHash: {
                    data.enforceInterface(DESCRIPTOR);
                    android.os.IBinder _result = this.getHash();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
                case TRANSACTION_isMcuUpdateing: {
                    data.enforceInterface(DESCRIPTOR);
                    boolean _result = this.isMcuUpdateing();
                    reply.writeNoException();
                    reply.writeInt(((_result) ? (1) : (0)));
                    return true;
                }
                case TRANSACTION_getMifareReader: {
                    data.enforceInterface(DESCRIPTOR);
                    android.os.IBinder _result = this.getMifareReader();
                    reply.writeNoException();
                    reply.writeStrongBinder(_result);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.seuic.android.PosdService {
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
            public java.lang.String getServiceName() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.lang.String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getServiceName, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public java.lang.String getMcuInfo() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                java.lang.String _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getMcuInfo, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readString();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int getMcuStatus() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getMcuStatus, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public boolean isBatteryLow() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_isBatteryLow, _data, _reply, 0);
                    _reply.readException();
                    _result = (0 != _reply.readInt());
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getMagCardReader() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getMagCardReader, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getICCardReader() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getICCardReader, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getPrinter() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getPrinter, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getPinpad() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getPinpad, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getSuperPinpad() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getSuperPinpad, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getFactoryFunc() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getFactoryFunc, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getTerminalInfo() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getTerminalInfo, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getServerCert() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getServerCert, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getTermCert() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getTermCert, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getHash() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getHash, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public boolean isMcuUpdateing() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                boolean _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_isMcuUpdateing, _data, _reply, 0);
                    _reply.readException();
                    _result = (0 != _reply.readInt());
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public android.os.IBinder getMifareReader() throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                android.os.IBinder _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    mRemote.transact(Stub.TRANSACTION_getMifareReader, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readStrongBinder();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
        }

        static final int TRANSACTION_getServiceName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_getMcuInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_getMcuStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_isBatteryLow = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
        static final int TRANSACTION_getMagCardReader = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
        static final int TRANSACTION_getICCardReader = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
        static final int TRANSACTION_getPrinter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
        static final int TRANSACTION_getPinpad = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
        static final int TRANSACTION_getSuperPinpad = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
        static final int TRANSACTION_getFactoryFunc = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
        static final int TRANSACTION_getTerminalInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
        static final int TRANSACTION_getServerCert = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
        static final int TRANSACTION_getTermCert = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
        static final int TRANSACTION_getHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
        static final int TRANSACTION_isMcuUpdateing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
        static final int TRANSACTION_getMifareReader = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    }

    public java.lang.String getServiceName() throws android.os.RemoteException;

    public java.lang.String getMcuInfo() throws android.os.RemoteException;

    public int getMcuStatus() throws android.os.RemoteException;

    public boolean isBatteryLow() throws android.os.RemoteException;

    public android.os.IBinder getMagCardReader() throws android.os.RemoteException;

    public android.os.IBinder getICCardReader() throws android.os.RemoteException;

    public android.os.IBinder getPrinter() throws android.os.RemoteException;

    public android.os.IBinder getPinpad() throws android.os.RemoteException;

    public android.os.IBinder getSuperPinpad() throws android.os.RemoteException;

    public android.os.IBinder getFactoryFunc() throws android.os.RemoteException;

    public android.os.IBinder getTerminalInfo() throws android.os.RemoteException;

    public android.os.IBinder getServerCert() throws android.os.RemoteException;

    public android.os.IBinder getTermCert() throws android.os.RemoteException;

    public android.os.IBinder getHash() throws android.os.RemoteException;

    public boolean isMcuUpdateing() throws android.os.RemoteException;

    public android.os.IBinder getMifareReader() throws android.os.RemoteException;
}
