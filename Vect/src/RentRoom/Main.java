package RentRoom;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student[] students = new Student[10];

		int n = 0;

		do {
			System.out.println("Enter the number of student: ");
			n = sc.nextInt();

			if (n < 1 || n > 10) {

				System.out.println("max number student is 10");
			}

		} while (n < 1 || n > 10);

		int cont = 0;

		while (cont < n) {

			sc.nextLine();
			System.out.println("Student: #" + (cont + 1) + "\n");
			System.out.println("Enter the Name of student: " + (cont + 1));
			String name = sc.nextLine();
			System.out.println("Enter the email of student: ");
			String email = sc.nextLine();
			System.out.println("Enter the number of room (0-" + (students.length - 1) + ")");
			int room = sc.nextInt();

			if (room >= 0 && room < students.length) {

				if (students[room] == null) {
					students[room] = new Student(name, email, room);
					System.out.println("WELCOME!\n");
					
					cont++;
				}
				else {
					System.out.println("room not available: ");
				}
			}
			else {
				System.out.println("Invalid room number!\n");
			}

		}

		System.out.println("Busy rooms:\n");
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.printf(i + ": " + students[i] + " ");
			}

		}

		sc.close();

	}

}
