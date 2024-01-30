


import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		addressBook ab = new addressBook();
		addressBookEntry entry = new addressBookEntry();
		for(int i = 0 ; i < 5 ; i++) {
	
		 System.out.println("Input Name ");
		String values = s.nextLine();
		entry.setName(values);
		 System.out.println("Input Address ");
		 values = s.nextLine();
		 entry.setAddress(values);
		 System.out.println("Input Number ");
		 values = s.nextLine();
		 entry.setTelephoneNumber(values);
		 System.out.println("Input Email ");
		 values = s.nextLine();
		 entry.setEmail(values);
		 ab.addEntry();
		
		}

	
		ab.viewAll();
	
	
	}
}

