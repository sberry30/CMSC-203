/*Class: CMSC203
 * Instructor: Prof. G. Grinberg
 * Description: This program troubleshoots WiFi connectivity 
 * step by step with the user
 * Due: 6/19/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment
 * independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Simon Berry
 */
import java.util.Scanner;//Import the Scanner class
public class WifiDiagnosis {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("If you have a problem with internet connectivity, this Wifi Diagnosis might work.");
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect to the internet? (yes or no)");//The first diagnostic question
		String answer = sc.nextLine();
		if (answer.equals("yes"))
		{
		System.out.println("Rebooting your computer seemed to work.\n");//The close out statement
		System.exit(0);
		}
		else if (answer.equals("no")){//The user needs more help, move on to the second step
		System.out.print("Second step: reboot your router\n");//The second diagnostic question
		System.out.print("Now are you able to connect with the internet? (yes or no)\n");
		}
		else //The user did not read the input options
		{
			System.out.println("Please input a valid answer (yes or no)");
			System.exit(0);
		}
			String answer1 = sc.nextLine();
			if (answer1.equals("yes"))
			{
			System.out.println("Rebooting your router seemed to work.\n");//The close out statement
			System.exit(0);
			}
			else if (answer1.equals("no"))
			{
			System.out.print("Third step: make sure the cables to your router are plugged in firmly and your router is getting power.\n");	
			System.out.print("Now are you able to connect with the internet? (yes or no)\n");
			}
			else //The user did not read the input options
			{
				System.out.println("Please input a valid answer (yes or no)");
				System.exit(0);
			}
				String answer2 = sc.nextLine();
				if (answer2.equals("yes"))
				{
				System.out.print("Making sure the cables are plugged in and the router is getting power seemed to work.\n");//The close out statement
				System.exit(0);
				}
				else if (answer2.equals("no"))
				{
				System.out.println("Move the computer closer to the router and try to connect.");
				System.out.println("Now are you able to connect with the internet? (yes or no)");
				}
				else //The user did not read the input options
				{
					System.out.println("Please input a valid answer (yes or no)");
					System.exit(0);
				}
					String answer3 = sc.nextLine();
					if (answer3.equals("yes"))
					{
						System.out.print("Making sure the cables are plugged in and the router is getting power seemed to work.\n");//The close out statement
						System.exit(0);
					}
					else if (answer3.equals("no"))
						{
							System.out.println("You should contact your ISP");
						}
							else //The user did not read the input options
							{
								System.out.println("Please input a valid answer (yes or no)");
								System.exit(0);
							}
							System.out.println("Programmer: Simon Berry");
							System.exit(0);
	}
	}

