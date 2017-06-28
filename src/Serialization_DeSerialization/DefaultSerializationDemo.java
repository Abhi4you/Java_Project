package Serialization_DeSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String studentName = "Abhishek";
	transient String password = "abc123@";
}
public class DefaultSerializationDemo {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Student s = new Student();
		
		System.out.println("****** Before Serialization ******");
		System.out.println("Student Name : "+s.studentName+"\nPassword : "+s.password);
		
		String filePath = "C:/Users/IBM_ADMIN/DesktopSerializationDemoFile.txt";
		
		/*
		 * The process of writing state of object into file called serialization.
		 * Strictly speaking In serialization we are converting Object from java supported format to File supported or Network
		 * supported format so that Object can transfer through file or network.
		 * 
		 * */
		
		FileOutputStream fileOutputStream = new FileOutputStream(filePath);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(s);
		
		System.out.println("###### Serialization is done successfully ...! ######");
		
		/*
		 * The process of reading state of object from a file called de-serialization.
		 * Strictly speaking In de-serialization object are converting from file supported format or network supported format to 
		 * java supported format.
		 * 
		 * */
		
		
		FileInputStream fileInputStream = new FileInputStream(filePath);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Student s1 = (Student) objectInputStream.readObject();
		
		System.out.println("\n\n****** After Serialization ******");
		System.out.println("Student Name : "+s1.studentName+"\nPassword : "+s1.password);
		System.out.println("###### De-Serialization is done successfully ...! ######");
	}
}
