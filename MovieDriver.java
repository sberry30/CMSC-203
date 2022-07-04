import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
String movie, rating, choice;
int tickets;
System.out.println("Please enter the title of a movie");
movie = kb.next();
System.out.println("Please enter this movies rating");
rating = kb.next();
System.out.println("How many tickets were sold at your local theater?");
tickets = kb.nextInt();
System.out.println("Do you want to enter another? (y or n)");
choice = kb.next();
if (choice.equals("y")) {
	System.out.println("Please enter the title of a movie");
	movie = kb.next();
	System.out.println("Please enter this movies rating");
	rating = kb.next();
	System.out.println("How many tickets were sold at your local theater?");
	tickets = kb.nextInt();
	System.out.println("Do you want to enter another? (y or n)");
	choice = kb.next();
	}
	else
	System.out.println("Goodbye");
}
	
	}

