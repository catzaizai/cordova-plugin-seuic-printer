/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\Test\\printDemo\\app\\src\\main\\aidl\\com\\seuic\\android\\Printer.aidl
 */
package com.seuic.android;

public interface Printer extends android.os.IInterface {
    /**
     * Local-side IPC implementation stub class.
     */
    public static abstract class Stub extends android.os.Binder implements com.seuic.android.Printer {
        private static final java.lang.String DESCRIPTOR = "com.seuic.android.Printer";

        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an com.seuic.android.Printer interface,
         * generating a proxy if needed.
         */
        public static com.seuic.android.Printer asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof com.seuic.android.Printer))) {
                return ((com.seuic.android.Printer) iin);
            }
            return new com.seuic.android.Printer.Stub.Proxy(obj);
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
                case TRANSACTION_startPrint: {
                    data.enforceInterface(DESCRIPTOR);
                    com.seuic.android.PrinterListener _arg0;
                    _arg0 = com.seuic.android.PrinterListener.Stub.asInterface(data.readStrongBinder());
                    byte[] _arg1;
                    _arg1 = data.createByteArray();
                    int _result = this.startPrint(_arg0, _arg1);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_setGray: {
                    data.enforceInterface(DESCRIPTOR);
                    byte _arg0;
                    _arg0 = data.readByte();
                    int _result = this.setGray(_arg0);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_printQRCode: {
                    data.enforceInterface(DESCRIPTOR);
                    com.seuic.android.PrintQRCodeListener _arg0;
                    _arg0 = com.seuic.android.PrintQRCodeListener.Stub.asInterface(data.readStrongBinder());
                    java.lang.String _arg1;
                    _arg1 = data.readString();
                    int _arg2;
                    _arg2 = data.readInt();
                    int _arg3;
                    _arg3 = data.readInt();
                    int _result = this.printQRCode(_arg0, _arg1, _arg2, _arg3);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_printBarCode: {
                    data.enforceInterface(DESCRIPTOR);
                    com.seuic.android.PrintBarCodeListener _arg0;
                    _arg0 = com.seuic.android.PrintBarCodeListener.Stub.asInterface(data.readStrongBinder());
                    java.lang.String _arg1;
                    _arg1 = data.readString();
                    int _arg2;
                    _arg2 = data.readInt();
                    int _arg3;
                    _arg3 = data.readInt();
                    int _arg4;
                    _arg4 = data.readInt();
                    int _result = this.printBarCode(_arg0, _arg1, _arg2, _arg3, _arg4);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
                case TRANSACTION_printImage: {
                    data.enforceInterface(DESCRIPTOR);
                    com.seuic.android.PrintImageListener _arg0;
                    _arg0 = com.seuic.android.PrintImageListener.Stub.asInterface(data.readStrongBinder());
                    byte[] _arg1;
                    _arg1 = data.createByteArray();
                    int _arg2;
                    _arg2 = data.readInt();
                    int _arg3;
                    _arg3 = data.readInt();
                    int _result = this.printImage(_arg0, _arg1, _arg2, _arg3);
                    reply.writeNoException();
                    reply.writeInt(_result);
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements com.seuic.android.Printer {
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
            public int startPrint(com.seuic.android.PrinterListener listener, byte[] print_data) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    _data.writeByteArray(print_data);
                    mRemote.transact(Stub.TRANSACTION_startPrint, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int setGray(byte greyval) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeByte(greyval);
                    mRemote.transact(Stub.TRANSACTION_setGray, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int printQRCode(com.seuic.android.PrintQRCodeListener listener, java.lang.String str, int qr_size, int qr_level) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    _data.writeString(str);
                    _data.writeInt(qr_size);
                    _data.writeInt(qr_level);
                    mRemote.transact(Stub.TRANSACTION_printQRCode, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int printBarCode(com.seuic.android.PrintBarCodeListener listener, java.lang.String str, int type, int width, int height) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    _data.writeString(str);
                    _data.writeInt(type);
                    _data.writeInt(width);
                    _data.writeInt(height);
                    mRemote.transact(Stub.TRANSACTION_printBarCode, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }

            @Override
            public int printImage(com.seuic.android.PrintImageListener listener, byte[] image_data, int width, int height) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                int _result;
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeStrongBinder((((listener != null)) ? (listener.asBinder()) : (null)));
                    _data.writeByteArray(image_data);
                    _data.writeInt(width);
                    _data.writeInt(height);
                    mRemote.transact(Stub.TRANSACTION_printImage, _data, _reply, 0);
                    _reply.readException();
                    _result = _reply.readInt();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
                return _result;
            }
        }

        static final int TRANSACTION_startPrint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_setGray = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        static final int TRANSACTION_printQRCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
        static final int TRANSACTION_printBarCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
        static final int TRANSACTION_printImage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    }

    public int startPrint(com.seuic.android.PrinterListener listener, byte[] print_data) throws android.os.RemoteException;

    public int setGray(byte greyval) throws android.os.RemoteException;

    public int printQRCode(com.seuic.android.PrintQRCodeListener listener, java.lang.String str, int qr_size, int qr_level) throws android.os.RemoteException;

    public int printBarCode(com.seuic.android.PrintBarCodeListener listener, java.lang.String str, int type, int width, int height) throws android.os.RemoteException;

    public int printImage(com.seuic.android.PrintImageListener listener, byte[] image_data, int width, int height) throws android.os.RemoteException;
}
