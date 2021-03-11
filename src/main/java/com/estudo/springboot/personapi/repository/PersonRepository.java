package com.estudo.springboot.personapi.repository;

import com.estudo.springboot.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
