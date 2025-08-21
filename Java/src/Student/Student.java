package Student;

import java.util.Scanner;

public class Student {

	Scanner sc = new Scanner(System.in);

	String Name;
	double NoteOne;
	double NoteTwo;
	double NoteThree;
	double Notes;

	public void FinalNote() {

		System.out.print("ENTER how your name: ");
		Name = sc.nextLine();

		System.out.print("ENTER NOTE ONE: ");
		NoteOne = sc.nextDouble();
		System.out.print("ENTER NOTE TWO: ");
		NoteTwo = sc.nextDouble();
		System.out.print("ENTER NOTE THREE: ");
		NoteThree = sc.nextDouble();

		if (NoteOne > 30 || NoteTwo > 35 || NoteThree > 35 || NoteOne < 0 || NoteTwo < 0 || NoteThree < 0) {
			System.out.println("\nYOU ENTER HOW NOTES INCORRET");
		}

		else {

			double TotalNote = NoteOne + NoteTwo + NoteThree;
			Notes = TotalNote;

			System.out.println("\nFINAL GRADE = " + String.format("%.2f", Notes));
		}

	}

	public void PassOrFalid() {

		double passingNote = 60.00;

		System.out.println("\nStudent Name: " + Name);

		if (Notes >= passingNote && Notes <= 100) {

			System.out.println("PASS");

		}

		else {

			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", passingNote - Notes) + " POINTS");

		}

	}

}
