package ch.hslu.oop.sw11;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
	private static final String OUTPUT_STREAM = "C:\\Users\\nizam\\Desktop\\test1.csv";
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String text = "Hello";
		byte[] byteArray = text.getBytes();
		
		try (OutputStream out = new FileOutputStream(OUTPUT_STREAM)) {
			out.write(byteArray);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try (FileInputStream fis = new FileInputStream("C:\\Users\\nizam\\Desktop\\test2.txt")) {
			final DataInputStream dis = new DataInputStream(fis);
			
			String s = dis.readLine();
			String[] stringArray = s.split(";"); 
			for(String n:stringArray) {
				System.out.println(n);
			}
			/**
			while(dis.available() > 0) {
				System.out.println(dis.readLine());
			}
			**/
			
			dis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}
}
