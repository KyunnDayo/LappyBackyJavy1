
public class addressBookEntry {
	private static String name,  address, telephoneNumber,  Email;
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
 public String toString() {
	 return " Name: " + name + "\n Address: " + address + "\n Telephone number: "+ telephoneNumber + "\n Email: "+Email;
	 
 }
}
