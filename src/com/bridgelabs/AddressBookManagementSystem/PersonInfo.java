package com.bridgelabs.AddressBookManagementSystem;

import javax.swing.*;

class PersonInfo {
		
		private String fname;
		private String lname;
		private String address;
		private String city;
		private String state;
		private String phoneNumber;
		private String email;
		
		//setters && getters
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public PersonInfo(String fname, String lname, String address, String city, String state, String phoneNumber,
				String email) {
			this.fname = fname;
			this.lname = lname;
			this.address = address;
			this.city = city;
			this.state = state;
			this.phoneNumber = phoneNumber;
			this.email = email;
		}
		
		public void print() {
			JOptionPane.showMessageDialog(null, "fname: " + fname + "lname: " + lname + "address: " + address + "city: " + city + "state: " + state +"phoneNumber: " + phoneNumber +"email: " + email );
		}
}


