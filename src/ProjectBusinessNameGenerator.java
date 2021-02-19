import java.util.Scanner;

public class ProjectBusinessNameGenerator {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Create a greeting for your program.
        System.out.println("Welcome to the business name generator\n");

        //Ask the user for his/her last name.
        //input
        System.out.println("What is your last name: ");
        String lastName = scan.nextLine();

        //Ask the user for the type of business.
        //input
        System.out.println("What is your type of business: ");
        String business = scan.nextLine();

        //Combine the type of business and the last name and show them their example business name.
        System.out.println("Your business name could be: " + business + " " + lastName);

    }
}
