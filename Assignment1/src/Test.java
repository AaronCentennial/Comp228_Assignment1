/**
 * Created by Aaron Fernandes on 22/09/15.
 */
import java.util.Scanner;

public class Test {
	static Scanner scanner=new Scanner(System.in);
	public static void PatientTest(){
		Patient p=new Patient();

		askInfo: while (true) {
			//Ask fro patientID
			System.out.print("Enter Patient ID Number: ");
			p.set_patientId(Integer.parseInt(scanner.nextLine()));

			//Ask user for names
			System.out.print("Enter Patient First Name: ");
			p.set_firstName(scanner.nextLine());
			System.out.print("Enter Patient Last Name: ");
			p.set_lastName(scanner.nextLine());

			//Ask user for address
			System.out.print("Enter Patient Address: ");
			p.set_address(scanner.nextLine());

			//Ask user for city
			System.out.print("Enter Patient City: ");
			p.set_city(scanner.nextLine());

			//Ask user for city
			System.out.print("Enter Patient Province: ");
			p.set_province(scanner.nextLine());

			//Ask user for city
			System.out.print("Enter Patient Postal Code: ");
			p.set_postalCode(scanner.nextLine());

			System.out.println("Thank you for using the Patient application\nPlease verify if all information is correct\n");

			System.out.println(p.getPatientInfo());
			System.out.print("Is this information correct?(y/n): ");

			option:	while (true) {
				switch (scanner.nextLine()) {
					case "y":
					case "Y":
						System.out.println("Thanks for using the Patient Program...\nGood BYE!");
						break askInfo;
					case "n":
					case "N":
						System.out.println("OK, Lets try that again..");
						break option;
					default:
						System.out.print("Not a valid option, Try Again(y/n): ");
						break;
				}//switch
			}//option
		}//askinfo

	}

	public static void BankAccountTest(){
		BankAccount b;
		int accNum;
		String name;
		int balance;
		askinfo: while (true){
			System.out.print("Enter your Account Number: ");
			accNum=Integer.parseInt(scanner.nextLine());

			System.out.print("\nEnter your Full Name: ");
			name=scanner.nextLine();

			System.out.print("\nEnter your staring balance");
			balance=Integer.parseInt(scanner.nextLine());

			System.out.print("Is that correct?(y/n)");

			switch (scanner.nextLine()){
				case "y":
				case  "Y":
					System.out.println("Great! Thanks for using this program");
					break askinfo;
				case "n":
				case "N":
					System.out.println("OK Lets try this again!");
					break;
				default:
					System.out.println("Not a valid selection\nThanks anyway");
					break askinfo;
			}//switch
		}//askinfo
	}

	public static void main(String[] args){

		System.out.println("Hi Welcome to the Assignment tester!");
		loop: do {
			System.out.println("\n\nWhich Class would you like to test?");
			System.out.println("(P)atient class");
			System.out.println("(B)ankAccount class");
			System.out.print("Enter which class you'd like to use: ");

			switch (scanner.nextLine()){
				case "P":
				case "p":
					PatientTest();
					break loop;
				case "B":
				case "b":
					BankAccountTest();
					break loop;
				default:
					System.out.println("Not a valid option");

			}


		}while (true);

	}
}
