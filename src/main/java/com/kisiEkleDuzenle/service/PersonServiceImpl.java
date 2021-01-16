package com.kisiEkleDuzenle.service;

import java.util.List;

import com.kisiEkleDuzenle.dao.PersonDAO;
import com.kisiEkleDuzenle.entity.Person;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PersonServiceImpl implements PersonService {

    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    @Transactional
    public int save(Person p) {
        return this.personDAO.save(p);
    }

    @Override
    @Transactional
    public int update(Person p) {
        return this.personDAO.update(p);
    }

    @Override
    @Transactional
    public List<Person> getPersons() {
        return this.personDAO.getPersons();
    }

    @Override
    @Transactional
    public Person getPersonById(int theId) {
        return this.personDAO.getPersonById(theId);
    }

    @Override
    @Transactional
    public int delete(int id) {
        return this.personDAO.delete(id);
    }

}