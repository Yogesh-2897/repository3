package com.selfproject.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selfproject.demo.Entity.Member;
import com.selfproject.demo.dto.MemberDTO;
import com.selfproject.demo.memberSupport.ApplicationConstants;
import com.selfproject.demo.memberSupport.MemberMapper;
import com.selfproject.demo.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberRepository memberRepo;
	@Override
	public String enrollMember(MemberDTO memberDto) throws Exception{
		Iterable<Member> memberList =  memberRepo.findAll();
		Member m = MemberMapper.convertMemberDtoToMember(memberDto);
		for(Member member:memberList) {
			if(member.equals(m)) {
				throw new Exception("Member already enrolled");
			}
		}
		Member newMember = memberRepo.save(m);
		
		return ApplicationConstants.REGISTRATION_SUCCESSFULL;
	}

}
