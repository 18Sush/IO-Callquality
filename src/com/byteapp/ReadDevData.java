package com.byteapp;

import java.io.*;

public class ReadDevData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin=new FileInputStream("buginfodata.txt");
			byte[] bt=new byte[100];
			fin.read(bt);
			for(byte b:bt) {
				System.out.print((char)b);
			}}catch(Exception e) {
				
			}
	}

}
