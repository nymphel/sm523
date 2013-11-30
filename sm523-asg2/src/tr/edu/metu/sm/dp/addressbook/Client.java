package tr.edu.metu.sm.dp.addressbook;

public class Client {

	public static void main(String[] args) {
		AddressBookDirector director = new AddressBookDirector();

		AddressBookBuilder peopleAddressBookBuilder = new PeopleAddressBookBuilder();
		peopleAddressBookBuilder.setId("123");

		director.construct(peopleAddressBookBuilder);
		Address addressResult = peopleAddressBookBuilder.getAddressResult();

		if (addressResult != null) {
			addressResult.display();
		}

		AddressBookBuilder groupAddressBookBuilder = new GroupAddressBookBuilder();
		groupAddressBookBuilder.setId("456");

		director.construct(groupAddressBookBuilder);
		addressResult = groupAddressBookBuilder.getAddressResult();

		if (addressResult != null) {
			addressResult.display();
		}

	}

}
