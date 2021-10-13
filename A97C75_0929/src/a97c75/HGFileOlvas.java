package a97c75;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HGFileOlvas {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("vezeteknev.txt");
		Scanner sc = new Scanner(file);
		int sum = 0;
		int temp = 0;
		while(sc.hasNextInt())
		{
			System.out.println("Adatok száma = " + sc.nextInt());
			System.out.println(temp + ".adat = " + sc.nextInt());
			sum += sc.nextInt();
			temp++;
		}
		System.out.println("Összeg: " + sum);
		sc.close();
	}

}
