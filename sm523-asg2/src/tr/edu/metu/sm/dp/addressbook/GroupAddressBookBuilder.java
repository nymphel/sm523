package tr.edu.metu.sm.dp.addressbook;

import java.util.ArrayList;
import java.util.List;

public class GroupAddressBookBuilder extends AddressBookBuilder {
	
	private Address address;

	@Override
	public void buildAddressBook() {
		address = findGroupFromCache(getId());
	}


	@Override
	public Address getAddressResult() {
		return address;
	}
	
	private Address findGroupFromCache(String id) {
		
		System.out.println("Retrieving group form cache with id: "+id);
		
		// dummy generated
		Address address = new Address();
		address.setGroup(true);
		address.setGroupName("Beatles");
		address.setGroupPurpose("Music");
		
		List<Address> groupMembers = new ArrayList<>();
		address.setGroupMembers(groupMembers);
		
		Address groupMember = new Address();
		groupMember.setFirstname("John");
		groupMember.setLastname("Lennon");
		groupMember.setEmail("john_lennon@gmail.com");
		groupMembers.add(groupMember);
		
		groupMember = new Address();
		groupMember.setFirstname("Paul");
		groupMember.setLastname("McCartney");
		groupMember.setEmail("paul_mccartney@gmail.com");
		groupMembers.add(groupMember);
		
		groupMember = new Address();
		groupMember.setFirstname("George");
		groupMember.setLastname("Harrison");
		groupMember.setEmail("george_harrison@gmail.com");
		groupMembers.add(groupMember);
		
		groupMember = new Address();
		groupMember.setFirstname("Ringo");
		groupMember.setLastname("Starr");
		groupMember.setEmail("ringo_starr@gmail.com");
		groupMembers.add(groupMember);
		
		return address;
	}

}
