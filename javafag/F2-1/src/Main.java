import java.util.Scanner; //import scanner library

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        //JustineRomero-AN21-092822

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Philippine Peso Amount: "); //ask for input
        double php = myObj.nextDouble();  // Read user input


        System.out.printf("Philippine peso Value: " + php + "%n");  // Output user input
        System.out.println(" ");
        System.out.println("The Amount is Equivalent to: ");
    //print computed results
        System.out.println("US Dollar:             "            +String.format("%.4f",php * 0.017));
        System.out.println("Euro:                  "                 +String.format("%.4f",php * 0.018));
        System.out.println("Chinese Yuan:          "         +String.format("%.4f",php * 0.018));
        System.out.println("Czech Koruna:          "         +String.format("%.4f",php * 0.43));
        System.out.println("Norwegian Krone:       "      +String.format("%.4f",php * 0.18));
        System.out.println("Israeli New Shekel:    "   +String.format("%.4f",php * 0.059));
        System.out.println("Kuwaiti Dinar:         "        +String.format("%.4f",php * 0.0053));
    }

}