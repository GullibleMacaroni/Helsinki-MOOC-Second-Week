import java.util.Scanner;

import tools.PersonalPhoneBook;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		start();
	}

	private static void start() {
		System.out.println("Program Start");
		System.out.println("available operations: " + "\n1 add a number\r\n" + " 2 search for a number\r\n"
				+ " 3 search for a person by phone number\r\n" + " 4 add an address\r\n"
				+ " 5 search for personal information\r\n" + " 6 delete personal information\r\n"
				+ " 7 filtered listing\r\n" + " x quit ");
		PersonalPhoneBook newPersonalPhoneBook = new PersonalPhoneBook();
		while (true) {
			System.out.println("Command?");
			Scanner reader = new Scanner(System.in);
			String command = reader.nextLine();
			options(command, reader, newPersonalPhoneBook);
		}
	}

	private static void options(String command, Scanner reader, PersonalPhoneBook pb) {
		if (command.equals("1")) {
			System.out.println("Add number");
			System.out.println("enter name");
			String name = reader.next();
			System.out.println("enter number");
			String number = reader.next();
			pb.addPhoneNumber(name, number);
		}

		if (command.equals("2")) {
			System.out.println("search for a number");
			System.out.println("enter name");
			String name = reader.next();
			System.out.println(pb.searchByPerson(name));
		}
		if (command.equals("3")) {
			System.out.println("Search by number");
			System.out.println("enter number");
			String number = reader.next();

			System.out.println(pb.searchByNumber(number));
		}
		if (command.equals("4")) {
			System.out.println("Add an address");
			System.out.println("enter name");
			String name = reader.next();
			System.out.println("enter address");
			String address = reader.next();

			pb.addAddress(name, address);
		}
		if (command.equals("5")) {
			System.out.println("Search for Information");
			System.out.println("enter name");
			String name = reader.next();

			System.out.println(pb.information(name));
		}
		if (command.equals("6")) {
			System.out.println("Delete information");
			System.out.println("enter name");
			String name = reader.next();
			System.out.println("enter number");
			pb.removeInformation(name);
		}
		if (command.equals("x")) {
			reader.close();
			System.exit(0);
		}

	}
}
