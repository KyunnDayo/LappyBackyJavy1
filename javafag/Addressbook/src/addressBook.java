import java.util.ArrayList;



public class addressBook {
	private addressBookEntry bookEntryDetails = new addressBookEntry();
	 private ArrayList <ArrayList<String>> information = new ArrayList<ArrayList<String>>();

 public void addEntry(){

	 ArrayList<String> inf  = new ArrayList<String>();
	 inf.add(bookEntryDetails.getName());

	 
	 inf.add(bookEntryDetails.getAddress());
	
	 inf.add(bookEntryDetails.getTelephoneNumber());
	
	 inf.add(bookEntryDetails.getEmail());
	 
	information.add(inf);
	
	
 }
 public void deleteEntry(int row){

	information.remove(row);
	
	
 }
 public void updateEntry(int row,int column,String Element) {
 
 information.get(row).set(column, Element);
 }
 public void viewAll() {
	 for(int i= 0 ; i < information.size() ; i++) {
		 System.out.println(information.get(i));
	}
 }
 
public ArrayList<ArrayList<String>> getInformation() {
	return information;
}
public void setInformation(ArrayList<ArrayList<String>> information) {
	this.information = information;
}
}

