package com.serialize;
import java.io.Serializable;
import java.io.*;

public class CallDetails implements Serializable {

	public static void main(String[] args) {
		 try {
	            CallQuality callQuality = new CallQuality(111, 40, "Excellent", "sushmitha");
	            FileOutputStream fileOut = new FileOutputStream("callquality.txt");
	            ObjectOutputStream out = new ObjectOutputStream(fileOut);
	            out.writeObject(callQuality);
	            out.close();
	            fileOut.close();
	           
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        try {
	            FileInputStream fileIn = new FileInputStream("callquality.txt");
	            ObjectInputStream in = new ObjectInputStream(fileIn);
	            CallQuality deserializedCallQuality = (CallQuality) in.readObject();
	            in.close();
	            fileIn.close();
	            
	            System.out.println("Call ID: " + deserializedCallQuality.callid);
	            System.out.println("Call Duration: " + deserializedCallQuality.callDuration);
	            System.out.println("Call Quality Grade: " + deserializedCallQuality.callQualityGrade);
	            System.out.println("Customer Name: " + deserializedCallQuality.customerName);
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }

	}

}
