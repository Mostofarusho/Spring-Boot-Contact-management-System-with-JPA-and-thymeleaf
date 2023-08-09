package net.codejava;

import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {
		
	public List<Contact> getContactList()
	{
		List<Contact> listContact=new ArrayList<>();
		listContact.add(new Contact("Mostofa Rusho", "mostofacse14@gamil.com", "USA"));
		listContact.add(new Contact("Sanjit Majumdher", "sam@gmail.com", "Canada"));
		listContact.add(new Contact("Ariful Islam", "arif@gmail.com", "Qatar"));
		listContact.add(new Contact("Shakil Sheikh", "shakil@gmail.com", "Germany"));
		
		return listContact;
	}
}
