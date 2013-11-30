package tr.edu.metu.sm.dp.addressbook;

public abstract class AddressBookBuilder {
	
	private String id;
	
	public abstract void buildAddressBook();
	public abstract Address getAddressResult();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
