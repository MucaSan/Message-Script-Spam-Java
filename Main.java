/**
 * 
 */
package br.com.treinaweb.main;
import java.util.Scanner;
/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* this program will take a message from the user, and he'll be able to run a script
		// this script will have the option to send a message only in an horizontal line, or perhaps,
		// in a vertical line, breaking the line;
		*/
		boolean hasContinuation = true;
		do {
			System.out.println("This program gets a message from the user, and repeats it, in two types of configuration:");
			System.out.println("1. The message will be sent breaking the line;");
			System.out.println("2. The message will be sent not breaking the line;");
			System.out.println("And after that, the user will be capable to choose a given number of messages to be looped or run infinitely");
			System.out.println("And such, he'd have the possibility to run the program again!");
			
			Scanner Objmessage_option = new Scanner(System.in);
			Scanner Objmessage_repetitive_option = new Scanner(System.in);
			String message_choice = Objmessage_option.nextLine();
			System.out.print("Insert the message to be repeated: ");
			String text_to_be_spammed = Objmessage_repetitive_option.nextLine();
			switch(message_choice) {
				case	"1":
					message_breaking_line(text_to_be_spammed);
					System.out.println("Would you like to restart the program? (Y/N)");
					Scanner ObjtConditionBreak = new Scanner(System.in);
					String replayConditionBreak = ObjtConditionBreak.nextLine();
					if (replayConditionBreak.toUpperCase().equals("Y")) {
						continue;
					}
					else {
							hasContinuation = false;
					}
					break;
				case "2":
					message_without_breaking_line(text_to_be_spammed);
					break;
				default:
					System.out.println("You inserted a wrong choice! Would you like to restart the program? (Y/N)");
					Scanner ObjtCondition = new Scanner(System.in);
					String replayCondition = ObjtCondition.nextLine();
					if (replayCondition.toUpperCase().equals("Y")) {
						continue;
					}
					else {
							hasContinuation = false;
					}
					
			}
		}while(hasContinuation);
		
		

	}
	public static void message_without_breaking_line(String msg) {
		Scanner Objtnum = new Scanner(System.in);
		System.out.println("Insert 1. if the loop will be endless or 2. if it'll have a certain range!");
		Scanner ObjtHasinfinite = new Scanner (System.in);
		String hasInfinite = ObjtHasinfinite.nextLine();
		switch(hasInfinite) {
		case	"1":
			boolean condition = true;
			do {
				System.out.print(msg);
			}while(condition);
			
			break;
		case "2":
			System.out.println("Insert how many messages you wanna send!");
			int i = Objtnum.nextInt();
			int count = 0;
			while(count <= i) {
				System.out.print(msg);
				count++;
			}
			break;
		default:
			System.out.println("You inserted a wrong choice! Try again later!");
	}
		
	}
	public static void message_breaking_line(String msg) {
		Scanner Objtnum = new Scanner(System.in);
		System.out.println("Insert 1. if the loop will be endless or 2. if it'll have a certain range!");
		Scanner ObjtHasinfinite = new Scanner (System.in);
		String hasInfinite = ObjtHasinfinite.nextLine();
		switch(hasInfinite) {
		case	"1":
			boolean condition = true;
			do {
				System.out.println(msg);
			}while(condition);
			
			break;
		case "2":
			int i = Objtnum.nextInt();
			int count = 0;
			while(count <= i) {
				System.out.println(msg);
				count++;
			}
			break;
		default:
			System.out.println("You inserted a wrong choice! Try again later!");
		}
	}
}
