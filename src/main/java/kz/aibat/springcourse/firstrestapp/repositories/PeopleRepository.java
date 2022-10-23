package kz.aibat.springcourse.firstrestapp.repositories;

import kz.aibat.springcourse.firstrestapp.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
    List<Person> findByName(String name);

    List<Person> findByNameOrderByAge(String name);

    List<Person> findByEmail(String email);

    List<Person> findByNameStartingWith(String StartingWith);

    List<Person> findByNameOrEmail(String name, String email);
}
