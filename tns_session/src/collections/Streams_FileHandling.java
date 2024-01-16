package collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Streams_FileHandling {

	public static void main(String[] args)throws IOException,ClassNotFoundException {
		
	
		FileOutputStream fos=new FileOutputStream("file.txt");	//file.txt will be created at "../src" (dir where src exists) 
		ObjectOutputStream oStream =new ObjectOutputStream(fos);
		
		Student s=new Student(10, "xyz", 123.34f);
		
		oStream.writeObject(s);
		
		System.out.println("Success");
		
		fos.close();
		oStream.close();


		/*
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("file.txt"));
		Student ssStudent=(Student)ois.readObject();
		System.out.println(ssStudent);
		 */

	}

}


