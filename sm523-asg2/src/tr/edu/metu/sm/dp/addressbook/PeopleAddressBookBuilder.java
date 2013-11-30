package tr.edu.metu.sm.dp.addressbook;

public class PeopleAddressBookBuilder extends AddressBookBuilder {
	
	private Address address;

	@Override
	public void buildAddressBook() {
		address = findPeopleFromCache(getId());
	}


	@Override
	public Address getAddressResult() {
		return address;
	}
	
	private Address findPeopleFromCache(String id) {
		
		System.out.println("Retrieving people form cache with id: "+id);
		
		// dummy generated
		Address address = new Address();
		address.setFirstname("Ruya");
		address.setLastname("Kalemci");
		address.setCompany("Abc Company");
		address.setEmail("ruyasabah@gmail.com");
		address.setPhone("3123335566");
		
		return address;
	}

}
