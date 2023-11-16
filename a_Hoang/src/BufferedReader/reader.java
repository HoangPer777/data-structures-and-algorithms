package BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class reader {
	public static ArrayList<String> text(String text) throws IOException{
		ArrayList<String> words = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader(text));
		String line = null;
		while(true) {
			line = reader.readLine();
			if(line == null) {
				break;
			}
			StringTokenizer tokens = new StringTokenizer(line, "\n");
			while(true) {
				if(tokens.nextToken() == null) {
					break;
				}
					words.add(tokens.nextToken());
				
			}
			words.add(line);
		}
		reader.close();
		return words;
		
	}
	public static void main(String[] args) throws IOException {
		String filePath = "D:\\aaa\\WorkSpace_21\\a_Hoang\\src\\BufferedReader\\fit.txt";
		ArrayList<String> context = reader.text(filePath);
		System.out.println(context);
	}
	
//	public static void main(String[] args) {
//		try {
//			String filePath = "D:\\aaa\\WorkSpace_21\\a_Hoang\\src\\BufferedReader\\fit.txt";
//			ArrayList<String> context = reader.text(filePath);
//			System.out.println(context);
//		} catch (Exception iOException) {
//			iOException.printStackTrace();
//		}
//	}
}
