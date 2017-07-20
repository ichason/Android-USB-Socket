package com.geo.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHelper
{
	private static String FILEPATH = "c:\\";

	public static File newFile(String filename)
	{
		File file = null;

		try
		{
			file = new File(FILEPATH, filename);
			file.delete();
			file.createNewFile();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		return file;
	}

	public static void writeFile(File file, byte[] data, int offset, int count) throws IOException
	{
		FileOutputStream fos = new FileOutputStream(file, true);
		fos.write(data, offset, count);
		fos.flush();
		fos.close();
	}

	public static byte[] readFile(String filename) throws IOException
	{
		File file = new File(FILEPATH, filename);
		// file.createNewFile();
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int leng = bis.available();
		byte[] b = new byte[leng];
		bis.read(b, 0, leng);
		bis.close();
		return b;
	}
}
