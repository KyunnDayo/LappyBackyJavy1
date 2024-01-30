import java.util.Scanner; //import scanner library


public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Philippine Peso Amount: "); //ask for input
        double OriginalVal = myObj.nextDouble();  // Read user input


        System.out.printf("Philippine peso Value: " + OriginalVal + "%n");  // Output user input
        System.out.println(" ");
        System.out.println("The Amount is Equivalent to: ");
        System.out.println("US Dollar: " + OriginalVal * 0.017);
        System.out.println("Euro: " + OriginalVal * 0.018);
        System.out.println("Chinese Yuan: " + OriginalVal * 0.12);
        System.out.println("Czech Koruna: " + OriginalVal * 0.43);
        System.out.println("Norwegian Krone: " + OriginalVal * 0.18);
        System.out.println("Israeli New Shekel: " + OriginalVal * 0.059);
        System.out.println("Kuwaiti Dinar: " + OriginalVal * 0.0053);
    }

}