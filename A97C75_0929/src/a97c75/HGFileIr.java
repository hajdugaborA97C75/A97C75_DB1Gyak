package a97c75;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HGFileIr {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("vezeteknev.txt");
		Scanner sc = new Scanner(System.in);
		System.out.print("Adja meg a be�rni k�v�nt adatok sz�m�t: ");
		writer.write(sc.nextInt());
		System.out.println("Adja meg a be�rni k�v�nt adatokat sz�k�zzel elv�lasztva");
		String data = sc.nextLine();
		String[] dataArray = data.split(" ");
		
		

	}

}
