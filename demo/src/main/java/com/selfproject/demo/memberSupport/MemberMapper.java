package com.selfproject.demo.memberSupport;

import com.selfproject.demo.Entity.Address;
import com.selfproject.demo.Entity.Member;
import com.selfproject.demo.dto.AddressDTO;
import com.selfproject.demo.dto.MemberDTO;

public class MemberMapper {
	public static Member convertMemberDtoToMember(MemberDTO memberDto) {
		if (memberDto != null) {
			Member member = new Member();
			member.setDob(memberDto.getDob());
			member.setFirstName(memberDto.getFirstName());
			member.setLastName(memberDto.getLastName());
			Address address = convertAddressDtoToAddress(memberDto.getAddress());
			member.setAddress(address);
			return member;
		}
		return new Member();
	}

	public static Address convertAddressDtoToAddress(AddressDTO addressDTO) {
		if (addressDTO != null) {
			Address address = new Address();
			address.setAddressLine1(addressDTO.getAddressLine1());
			address.setAddressLine2(addressDTO.getAddressLine2());
			address.setAddressLine3(addressDTO.getAddressLine3());
			address.setCity(addressDTO.getCity());
			address.setCountry(addressDTO.getCountry());
			address.setState(addressDTO.getState());
			return address;
		}
		return new Address();

	}

}
