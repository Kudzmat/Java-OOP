/* This program is a project management system which will create specifications for a
structural engineering firm.
The program will create classes and objects for the project specifications, architect, contractor and customer.
Methods will be used to accept data and create objects seamlessly
*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProjectManager {

    // This method will collect inputs for the architect's details and create an object using the Architect class
    // The same principles will be applied for other classes

    public static Object architect() {  // we want to get back an object

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the architect's name: ");
        String name = input.next();
        name += input.nextLine();

        System.out.println("Enter the architect's phone number: ");
        int telephone = input.nextInt();

        System.out.println("Enter the architect's email: ");
        String email = input.next();

        System.out.println("Enter the architect's address: ");
        String address = input.next();
        address += input.nextLine();  // for strings with a space

        Architect architect1 = new Architect(name, telephone, email, address);  // creating object

        return architect1;

    }

    // customer method
    public static Object customer() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the customer's name: ");
        String name = input.next();
        name += input.nextLine();

        System.out.println("Enter the customer's phone number: ");
        int telephone = input.nextInt();

        System.out.println("Enter the customer's email: ");
        String email = input.next();

        System.out.println("Enter the customer's address: ");
        String address = input.next();
        address += input.nextLine();  // for strings with a space

        Customer client = new Customer(name, telephone, email, address);
        return client;

    }

    // Contractor method
    public static Object contractor() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the contractor's name: ");
        String name = input.next();
        name += input.nextLine();

        System.out.println("Enter the contractor's phone number: ");
        int telephone = input.nextInt();

        System.out.println("Enter the contractor's email: ");
        String email = input.next();

        System.out.println("Enter the contractor's address: ");
        String address = input.next();
        address += input.nextLine();  // for strings with a space

        Contractor contract = new Contractor(name, telephone, email, address);

        return contract;

    }

    // // project method
    public static Object project() throws ParseException {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the project name: ");
        String name = input.next();
        name += input.nextLine();

        System.out.println("Enter the project number: ");
        int number = input.nextInt();

        System.out.println("Enter the building type: ");
        String building = input.next();
        building += input.nextLine();

        System.out.println("Enter the project address: ");
        String address = input.next();
        address += input.nextLine();

        System.out.println("Enter the project ERF number: ");
        int erf = input.nextInt();

        System.out.println("Enter the project fee: ");
        int fee = input.nextInt();

        System.out.println("Enter the amount paid so far: ");
        int paid = input.nextInt();

        // Getting the deadline date
       System.out.println("Enter the project deadline (YYYY-MM-DD: ");
       String date1 = input.next();
       date1 += input.nextLine();
       Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(date1);
       String deadline = new SimpleDateFormat("yyyy-MM-dd").format(date2);

        Projects proj = new Projects(name, number, building, address, erf, fee, paid, deadline);
        return proj;
    }

    // Main
    public static void main(String args[]) throws ParseException {

        // Running methods to get the details for the project
        Object proj1 = project();
        System.out.println("");  // space for presentation
        Object arch1 = architect();
        System.out.println("");
        Object contractor1 = contractor();
        System.out.println("");
        Object client1 = customer();

        // outputs
        System.out.println(proj1);
        System.out.println(arch1);
        System.out.println(contractor1);
        System.out.println(client1);

    }
}
