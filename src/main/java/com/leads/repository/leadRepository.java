package com.leads.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leads.antites.leadgenerator;

public interface leadRepository extends JpaRepository<leadgenerator, Long> {

}
