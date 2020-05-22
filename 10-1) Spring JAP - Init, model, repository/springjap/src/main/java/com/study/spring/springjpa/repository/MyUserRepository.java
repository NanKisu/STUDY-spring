package com.study.spring.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import com.study.spring.springjpa.model.MyUser;

public interface MyUserRepository extends JpaRepository<MyUser, Integer> {

}
