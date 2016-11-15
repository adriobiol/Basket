package com.example.service;

import com.example.domain.Team;
import com.example.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    public void testTeams(){
        Team team1 = new Team("Gryffindor", "SC Gryffindor", (LocalDate.of(1499, 11, 3)));
        teamRepository.save(team1);
        Team team2 = new Team("Slytherin", "Mazmorras", (LocalDate.of(1500, 11, 5)));
        teamRepository.save(team1);
        Team team3 = new Team("Ravenclaw", "Biblioteca", (LocalDate.of(1502, 12, 12)));
        teamRepository.save(team1);
        Team team4 = new Team("Hufflepuff", "Acueducto", (LocalDate.of(1501, 1, 5)));
        teamRepository.save(team1);
        Team team5 = new Team("Merodeadores", "Bosque prohibido", (LocalDate.of(1970, 2, 3)));
        teamRepository.save(team1);

        System.out.println("Equipo por localidad");
        System.out.println(teamRepository.findByLocalidad("Mazmorras"));




    }
}
