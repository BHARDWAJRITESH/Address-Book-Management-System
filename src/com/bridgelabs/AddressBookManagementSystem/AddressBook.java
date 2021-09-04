package com.bridgelabs.AddressBookManagementSystem;

import java.util.*;
import javax.swing.JOptionPane;

class AddressBook {
		ArrayList<PersonInfo> persons;
		
		//constructor
		public AddressBook () {
			persons = new ArrayList<PersonInfo>();
		} 
		public void addPerson() {
			String fname = JOptionPane.showInputDialog("enter fname");
			String lname = JOptionPane.showInputDialog("enter lname");
			String address = JOptionPane.showInputDialog("enter address");
			String city = JOptionPane.showInputDialog("enter city");
			String state = JOptionPane.showInputDialog("enter state");
			String phoneNumber = JOptionPane.showInputDialog("enter phone number");
			String email = JOptionPane.showInputDialog("enter email");
			
			PersonInfo p = new PersonInfo(fname, lname, address, city, state, phoneNumber,  email);
			persons.add(p);
		}
		
			public void searchPerson (String n) {
				for (int i =0; i<persons.size(); i++) {
					PersonInfo p = (PersonInfo)persons.get(i);
					if ( n.equals(p.getFname())) {
						p.print();
			        }	
				}
			}	
			
			
		public void deletePerson (String n) {
			for (int i=0; i<persons.size(); i++) {
				PersonInfo p = (PersonInfo)persons.get(i);
				if ( n.equals(p.getFname())) {
					p.print();
					persons.remove(i);
				}
			}
	   }
	   
		public void editPerson (String n) {
		      String fname = JOptionPane.showInputDialog("enter fname");
		      String lname = JOptionPane.showInputDialog("enter lname");
		      String address = JOptionPane.showInputDialog("enter address");
		      String city = JOptionPane.showInputDialog("enter city");
		      String state = JOptionPane.showInputDialog("enter state");
		      String phoneNumber = JOptionPane.showInputDialog("enter phone number");
		      String email = JOptionPane.showInputDialog("enter email");
		
		      
		      PersonInfo p = new PersonInfo(fname, lname, address, city, state, phoneNumber,  email);
		      persons.add(p);
	   }
}



