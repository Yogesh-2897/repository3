package com.selfproject.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.selfproject.demo.Entity.Member;

public interface MemberRepository extends CrudRepository<Member,Integer>{

}
