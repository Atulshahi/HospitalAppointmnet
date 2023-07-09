package com.example.in.repository;

import org.springframework.stereotype.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

//import com.example.in.model.Doctor;
import com.example.in.model.user;


@Repository
public interface userrepository extends JpaRepository<user, String> {

	Optional<user> findById(String email);

	user findByEmailid(String email);

}
 
//public interface userrepository extends JpaRepository<user, String>{
//	user findbyEmailid(String email);
//}