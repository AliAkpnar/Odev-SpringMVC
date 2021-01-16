package com.kisiEkleDuzenle.service;

import com.kisiEkleDuzenle.entity.Person;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface PersonService {
	public int save(Person p);

	public int update(Person p);

	public int delete(int id);

	public Person getPersonById(int id);

	public List<Person> getPersons();
	
}