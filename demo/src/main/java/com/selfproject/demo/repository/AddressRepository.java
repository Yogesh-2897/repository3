package com.selfproject.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.selfproject.demo.Entity.Address;

public interface AddressRepository extends CrudRepository<Address,Integer>{

}
