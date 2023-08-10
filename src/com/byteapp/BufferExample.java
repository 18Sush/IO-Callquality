package com.byteapp;
import java.io.*;
public class BufferExample {

	public static void main(String[] args) {
		try {
            FileOutputStream fileOutputStream = new FileOutputStream("data.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String data = "Developer Name:Sushmitha K Bug No:B0123\nBud Description:File Not Found";
            byte[] bytes = data.getBytes();
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("data.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte[] buffer = new byte[1000];
            int bytesRead = bufferedInputStream.read(buffer);
            String readData = new String(buffer, 0, bytesRead);
            System.out.println(readData);
            bufferedInputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
	}
}
