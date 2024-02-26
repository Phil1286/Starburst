package com.example.Star.repository;

import com.example.Star.model.Ta_bookmanager;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface Ta_bookmanagerRepository extends CrudRepository<Ta_bookmanager, Integer> {

    @Query(
            value = "SELECT * FROM ta_bookmanager u WHERE u.subsectionshortname ='127A' ",
            nativeQuery = true)
    Collection<Ta_bookmanager> findAllActiveUsersNative();


}
