package com.selfproject.demo.dto;

import java.util.Date;

public class MemberDTO {
	private Integer memberId;
	private String firstName;
	private String lastName;
	private Date dob;
	private AddressDTO address;

	public MemberDTO() {
		super();
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public MemberDTO(Integer memberId, String firstName, String lastName, Date dob, AddressDTO address) {
		super();
		this.memberId = memberId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.address = address;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberId=" + memberId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob="
				+ dob + ", address=" + address + "]";
	}

}
