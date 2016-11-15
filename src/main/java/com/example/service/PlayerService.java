package com.example.service;

import com.example.domain.Player;
import com.example.domain.Team;
import com.example.repository.PlayerRepository;
import com.example.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private TeamRepository teamRepository;


    public void testPlayers() {
        //Gryffindor
        Player player11 = new Player("Harry", (LocalDate.of(1980, 1, 1)), 43, 22, 28, "buscador");
        Team Gryf = teamRepository.findOne(1L);
        player11.setOwner(Gryf);
        playerRepository.save(player11);
        Player player12 = new Player("Ron", (LocalDate.of(1980, 10, 2)), 22, 33, 44, "capitan");
        player12.setOwner(Gryf);
        playerRepository.save(player12);
        Player player13 = new Player("Percival", (LocalDate.of(1899, 2, 8)), 34, 11, 12, "golpeador");
        player13.setOwner(Gryf);
        playerRepository.save(player13);
        Player player14 = new Player("Hermione", (LocalDate.of(1980, 8, 2)), 22, 35, 47, "guardián");
        player14.setOwner(Gryf);
        playerRepository.save(player14);
        Player player15 = new Player("Minerva", (LocalDate.of(1910, 2, 4)), 43, 64, 22, "golpeador");
        player15.setOwner(Gryf);
        playerRepository.save(player15);
        //Slytherin
        Player player21 = new Player("Draco", (LocalDate.of(1980, 2, 1)), 22, 13, 17, "capitan");
        Team Sly = teamRepository.findOne(2L);
        player21.setOwner(Sly);
        playerRepository.save(player21);
        Player player22 = new Player("Lucius", (LocalDate.of(1950, 5, 3)), 11, 12, 13, "buscador");
        player22.setOwner(Sly);
        playerRepository.save(player22);
        Player player23 = new Player("Grabe", (LocalDate.of(1980, 2, 3)), 15, 16, 17, "guardián");
        player23.setOwner(Sly);
        playerRepository.save(player23);
        Player player24 = new Player("Goyle", (LocalDate.of(1980, 4, 4)), 2, 2, 3, "golpeador");
        player24.setOwner(Sly);
        playerRepository.save(player24);
        Player player25 = new Player("Grabe", (LocalDate.of(1980, 6, 3)), 10, 12, 9, "golpeador");
        player25.setOwner(Sly);
        playerRepository.save(player25);
        //Ravenclaw
        Player player31 = new Player("Luna", (LocalDate.of(1980, 11, 14)), 22, 13, 17, "capitan");
        Team Rave = teamRepository.findOne(3L);
        player31.setOwner(Rave);
        playerRepository.save(player31);
        Player player32 = new Player("Cho", (LocalDate.of(1980, 12, 15)), 22, 15, 57, "guardián");
        player32.setOwner(Rave);
        playerRepository.save(player32);
        Player player33 = new Player("Filius", (LocalDate.of(1979, 12, 11)), 13, 14, 57, "golpeador");
        player33.setOwner(Rave);
        playerRepository.save(player33);
        Player player34 = new Player("Quirinus", (LocalDate.of(1978, 11, 14)), 15, 33, 57, "buscador");
        player34.setOwner(Rave);
        playerRepository.save(player34);
        Player player35 = new Player("Duncan", (LocalDate.of(1980, 11, 12)), 15, 23, 12, "golpeador");
        player35.setOwner(Rave);
        playerRepository.save(player35);
        //Hufflepuff
        Player player41 = new Player("Cedric", (LocalDate.of(1978, 03, 12)), 22, 21, 17, "capitan");
        Team Huff = teamRepository.findOne(4L);
        player41.setOwner(Huff);
        playerRepository.save(player41);
        Player player42 = new Player("Nymphadora", (LocalDate.of(1950, 03, 30)), 22, 57, 15, "guardián");
        player42.setOwner(Huff);
        playerRepository.save(player42);
        Player player43 = new Player("Justin", (LocalDate.of(1980, 02, 03)), 22, 17, 13, "golpeador");
        player43.setOwner(Huff);
        playerRepository.save(player43);
        Player player44 = new Player("Ernnei", (LocalDate.of(1978, 03, 15)), 13, 14, 27, "golpeador");
        player44.setOwner(Huff);
        playerRepository.save(player44);
        Player player45 = new Player("Hannah", (LocalDate.of(1980, 04, 18)), 15, 22, 33, "buscador");
        player45.setOwner(Huff);
        playerRepository.save(player45);
        //Merodeadores
        Player player51 = new Player("Cornamenta", (LocalDate.of(1950, 03, 10)), 77, 77, 77, "capitan");
        Team Mer = teamRepository.findOne(5L);
        player51.setOwner(Mer);
        playerRepository.save(player51);
        Player player52 = new Player("Canuto", (LocalDate.of(1950, 06, 15)), 22, 33, 55, "guardián");
        player52.setOwner(Mer);
        playerRepository.save(player52);
        Player player53 = new Player("Licántropo", (LocalDate.of(1950, 01, 12)), 11, 43, 19, "golpeador");
        player53.setOwner(Mer);
        playerRepository.save(player53);
        Player player54 = new Player("Colagusano", (LocalDate.of(1950, 01, 17)), 1, 1, 1, "golpeador");
        player54.setOwner(Mer);
        playerRepository.save(player54);
        Player player55 = new Player("Patronus", (LocalDate.of(1000, 01, 01)), 100, 100, 100, "buscador");
        player55.setOwner(Mer);
        playerRepository.save(player55);

        //Secuencias SQL
        System.out.println("Jugadores por nombre incompleto: ");
        System.out.println(playerRepository.findByNombreInacabado("Canuto"));
        System.out.println("Buscar jugadores que hayan conseguido un número mayor o igual a un número de canastas especificado como parámetro.");
        System.out.println(playerRepository.findByNumcanastasGreaterThanEqual(10));
        System.out.println("Buscar jugadores que hayan efectuado un número de asistencias dentro de un rango especificado como parámetro");
        System.out.println(playerRepository.findByNumasistenciasBetween(10,30));
        System.out.println("Buscar jugadores que pertenezcan a una posición específica, por ejemplo: golpeador");
        System.out.println(playerRepository.findByPosicion("golpeador"));
        System.out.println("Buscar jugadores que hayan nacido en una fecha anterior a una fecha especificada como parámetro");
        System.out.println(playerRepository.findByFechaBefore(LocalDate.of(1994, 05, 15)));
        System.out.println("Agrupar los jugadores por la posición del campo y devolver para cada grupo la siguiente información: la media de canastas, asistencias y rebotes.");
        List<Object[]> playerList = playerRepository.agruparPosicion();
        for (Object[] player1 : playerList)
        {
            System.out.println("Posición: "+ player1[0]);
            System.out.println("Media: "+player1[1]);
            System.out.println("Mínimo: "+player1[2]);
            System.out.println("Máximo: "+player1[3] + System.lineSeparator());
        }
        System.out.println("Media, máximo y mínimo número de canastas, rebotes y asistencias");
        List<Object[]> playerList2 = playerRepository.informacionTotal();
        for (Object[] player1 : playerList2)
        {
            System.out.println("Posicion: " + player1[0]);
            System.out.println("Puntos: ");
            System.out.println("Media " + player1[1]);
            System.out.println("Mínimo: " + player1[2]);
            System.out.println("Máximo:  "+ player1[3]);
            System.out.println("Asistencias: ");
            System.out.println("Media: " + player1[4]);
            System.out.println("Mínimo: " + player1[5]);
            System.out.println("Máximo: " + player1[6]);
            System.out.println("Rebotes: ");
            System.out.println("Media: " + player1[7]);
            System.out.println("Mínimo: " + player1[8]);
            System.out.println("Máximo: " + player1[9]+System.lineSeparator());
        }
        System.out.println("Devuelve todos los jugadores de un equipo, a partir del nombre de su equipo");
        System.out.println(playerRepository.findByOwner("Gryffindor"));
        System.out.println("Devuelve todos los jugadores de un equipo, que además jueguen en la misma posición (parámetro adicional de la consulta), por ejemplo, alero.");
        System.out.println(playerRepository.findByOwnerAndPosicion("Gryffindor","buscador"));
        System.out.println("Devuelve todos los jugadores de un equipo, que además jueguen en la misma posición (parámetro adicional de la consulta), por ejemplo, alero.");
        System.out.println(playerRepository.nombreJugador("Merodeador",new PageRequest(0,1)));



    }
}




