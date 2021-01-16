package com.kisiEkleDuzenle.dao;

import com.kisiEkleDuzenle.entity.Person;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDAO {
    public int save(Person p);

    public int update(Person p);

    public int delete(int TheId);

    public Person getPersonById(int id);

    public List<Person> getPersons();
}
