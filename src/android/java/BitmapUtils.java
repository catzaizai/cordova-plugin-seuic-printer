package com.seuic.cordova.plugin;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;

public class BitmapUtils {
	
	public static byte[] bmp2bytesStream(Bitmap bitmap){
		int width = bitmap.getWidth();
		int height = bitmap.getHeight();
		if(width%8!=0){
			int adjustWidth = width+(8-width%8);
			final Bitmap.Config config = Bitmap.Config.ARGB_8888;
			Bitmap whiteBgBitmap = Bitmap.createBitmap(adjustWidth, height, config);
			Canvas canvas = new Canvas(whiteBgBitmap);
			canvas.drawColor(Color.WHITE);
			canvas.drawBitmap(bitmap, 0, 0, null);
			
			bitmap = whiteBgBitmap;
			width = bitmap.getWidth();
		}
		int[] pixels = new int[width * height];
		bitmap.getPixels(pixels, 0, width, 0, 0, width, height);
		byte[] image = new byte[width*height];
		final byte WHITE = 0,BLACK=1;
		for(int i = 0; i < pixels.length; i++){
			image[i] = (pixels[i] != 0xFFFFFFFF) ? BLACK : WHITE;
	    }
		final int COL = width + width % 2;
		byte[] row = new byte[COL];
		byte[] res = new byte[COL / 8 * height];
		for (int i = 0, dex = 0, num = 0; i < height; ++i) {
			System.arraycopy(image, i * width, row, 0, width);
			for (byte e : row) {
				res[dex] += e << (7 - num++);
				num = 8 == num ? 0 : num;
				dex = 0 == num ? dex + 1 : dex;
			}
		}
		return res;
	}
}
