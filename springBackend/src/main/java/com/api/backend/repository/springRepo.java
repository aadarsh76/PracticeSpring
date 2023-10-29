package com.api.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.backend.model.Employee;

@Repository
public interface springRepo extends JpaRepository<Employee, Long> {

}
