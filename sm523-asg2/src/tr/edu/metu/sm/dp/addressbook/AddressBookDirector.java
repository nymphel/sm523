package tr.edu.metu.sm.dp.addressbook;

public class AddressBookDirector {
	
	private AddressBookBuilder builder;
	
	public void construct(AddressBookBuilder builder) {
		this.builder = builder;
		this.builder.buildAddressBook();
	}

}
