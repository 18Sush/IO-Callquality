package com.byteapp;
import java.io.*;
public class DevDataFile {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Enter developer name: ");
            String developerName = br.readLine();
            
            System.out.print("Enter bug number: ");
            String bugNumber = br.readLine();
            
            System.out.print("Enter bug description: ");
            String bugDescription = br.readLine();
            
            String data = "Developer Name: " + developerName + "\nBug Number: " + bugNumber + "\nBug Description: " + bugDescription;
            
            FileOutputStream fs= new FileOutputStream("buginfodata.txt");
            fs.write(data.getBytes());
            fs.close();
            
            
        } catch (IOException e) {
            System.out.println(e);
        }
	}

}
