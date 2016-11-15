package com.example.repository;

import com.example.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {

    List<Team> findByLocalidad(String localidad);


}
