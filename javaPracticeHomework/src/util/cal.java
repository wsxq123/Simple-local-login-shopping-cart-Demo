package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class cal {
	
	//寫入
	public static void addFile(String file,Object writeObject)
	{
		ObjectOutputStream oos=null;
	
		try {
			FileOutputStream fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			oos.writeObject(writeObject);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//讀取
	public static ObjectInputStream readFile(String file)
	{
		ObjectInputStream ois=null;
		try {
			FileInputStream fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return ois;
	}
	
	//刪除
	public static void deleteFile(String file)
	{		
		File myObj = new File(file); 
	    if (myObj.delete()) { 
	      System.out.println("Deleted the file: " + myObj.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
	}
	
}
