package com.selfproject.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selfproject.demo.dto.MemberDTO;
import com.selfproject.demo.dto.response.CommonResponse;
import com.selfproject.demo.service.MemberService;

@RestController
@RequestMapping("/members")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	
	@PostMapping("/enrollMember")
	public ResponseEntity<CommonResponse> enrollMember(@RequestBody MemberDTO member) throws Exception {
		HttpStatus httpStatus = null;
		String message = memberService.enrollMember(member);
		
		CommonResponse commonResponse = new CommonResponse();
		commonResponse.setCode(((Integer)HttpStatus.OK.value()).toString());
		commonResponse.setMessage(message);
		
		return new ResponseEntity<>(commonResponse,httpStatus.OK);
		
		
	}
}
