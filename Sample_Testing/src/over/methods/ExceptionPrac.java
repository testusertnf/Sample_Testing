package over.methods;

import java.io.File;
import java.io.IOException;

public class ExceptionPrac {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int j = 10;

		int k[] = new int[2];
		
		File f = new File("abc.txt");
		
		try {
			f.createNewFile();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		try {

			k[0] = 10;
			k[1] = 20;
			k[2] = 30;
			
			for (int i = 5; i >= 0; i--) {
				System.out.println("j/i=====>" + j / i);
			}

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("===== Finally block =====");
		}

		System.out.println(" End of the Program ");
	}
}
