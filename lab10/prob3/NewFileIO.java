package lab10.prob3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NewFileIO {
	public final static String FILE_LOCATION = "src/lab10/prob3/word_test.txt";
	void readText(String filename) throws IOException {
		File f = new File(filename);
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		
		String line = null;
		reader.lines().forEach(e -> System.out.println(e));
		reader.close();
	}
	
	public static void main(String[] args) {
		NewFileIO n = new NewFileIO();
		String filename = FILE_LOCATION;
		try {
			n.readText(filename);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
