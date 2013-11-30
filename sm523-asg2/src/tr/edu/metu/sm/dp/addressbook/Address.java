package tr.edu.metu.sm.dp.addressbook;

import java.util.List;

public class Address {

	private boolean group;

	private String firstname;
	private String lastname;
	private String company;
	private String email;
	private String phone;

	private String groupName;
	private String groupPurpose;
	private List<Address> groupMembers;

	public void display() {
		StringBuilder sb = new StringBuilder();
		if(group) {
			sb.append("Name of group: "+groupName);
			sb.append("Purpose of group: "+groupPurpose);
			sb.append(System.getProperty("line.separator"));
			
			if(groupMembers != null && !groupMembers.isEmpty()) {
				int row = 1;
				for (Address groupMember : groupMembers) {
					sb.append(row);
					sb.append(". member: ");
					sb.append(groupMember.firstname);
					sb.append(" ");
					sb.append(groupMember.lastname);
					sb.append(" ");
					sb.append(groupMember.email);
					sb.append(System.getProperty("line.separator"));
					row++;
				}
			}
		} else {
			sb.append(firstname);
			sb.append(" ");
			sb.append(lastname);
			sb.append(" ");
			sb.append(company);
			sb.append(" ");
			sb.append(email);
			sb.append(" ");
			sb.append(phone);
		}
		
		System.out.println(sb.toString());
	}

	public boolean isGroup() {
		return group;
	}

	public void setGroup(boolean group) {
		this.group = group;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupPurpose() {
		return groupPurpose;
	}

	public void setGroupPurpose(String groupPurpose) {
		this.groupPurpose = groupPurpose;
	}

	public List<Address> getGroupMembers() {
		return groupMembers;
	}

	public void setGroupMembers(List<Address> groupMembers) {
		this.groupMembers = groupMembers;
	}


	

}
