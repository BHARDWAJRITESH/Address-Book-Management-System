package com.bridgelabs.AddressBookManagementSystem;

import javax.swing.JOptionPane;

class Textbook {
		public static void main (String[] args) {
			System.out.println("  Welcome to Address book Program  ");

			AddressBook ab = new AddressBook();
			String input, s;
			int cs;
			
			while (true) {
				input = JOptionPane.showInputDialog(" Enter 1 to add " + "\n Enter 2 to search \n Enter 3 to Delete \n Enter 4 to Edit " + "\n Enter 5 to Exit");
				cs = Integer.parseInt(input);
				
				switch (cs) {
				case 1:
					ab.addPerson();
					break;
				case 2:
					s = JOptionPane.showInputDialog("Enter name to search");
					ab.searchPerson(s);
					break;
				case 3:
					s=JOptionPane.showInputDialog("Enter name to delete");
					ab.deletePerson(s);
					break;
				case 4:
					s=JOptionPane.showInputDialog("Enter name to edit");
					ab.editPerson(s);
					break;	
				case 5: System.exit(0);
				}
			}
		}
}

