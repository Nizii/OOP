package ch.hslu.oop.sw11;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

class InputTest {

	@Test
	void test() throws FileNotFoundException {
		File f = new File("C:\\Users\\nizam\\Desktop\\test2.txt");
		assertTrue(f.exists());
	}

}
