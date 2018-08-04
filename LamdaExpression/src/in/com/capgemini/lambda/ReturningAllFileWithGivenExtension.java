/*Program which returns all files with a given extension*/
package in.com.capgemini.lambda;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReturningAllFileWithGivenExtension {

	public static void main(String[] args) {
		// Creating ArrayList
		List<File> list = new ArrayList<File>();
		File fileArray[] = new File[20]; // Creating filearray of size 20

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The path : ");
		// Taking input
		String path = scanner.nextLine();
		File file = new File(path);

		fileArray = file.listFiles();

		for (int i = 0; i < fileArray.length; i++) {
			list.add(fileArray[i]);
		}
		// only prints files with .txt extension
		list.stream().filter(i -> !i.isDirectory() && i.toString().endsWith("txt")).forEach(System.out::println);

	}

}
