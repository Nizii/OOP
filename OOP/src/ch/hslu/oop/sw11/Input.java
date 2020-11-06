package ch.hslu.oop.sw11;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Input {
	public Input() {
		
	}
	
	public void startInput() {
		try (FileInputStream fis = new FileInputStream("C:\\Users\\nizam\\Desktop\\test2.txt")) {
			final DataInputStream dis = new DataInputStream(fis);
			
			while(dis.available() > 0) {
				System.out.println(dis.readLine());
			}
			
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
