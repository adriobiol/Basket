package com.example.repository;

import com.example.domain.Player;
import com.example.domain.Team;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


public interface PlayerRepository extends JpaRepository<Player, Long> {
    //Corregir variables entre paréntesis
    List<Player> findByNombre(String nombre);

    List<Player> findByNumcanastasGreaterThanEqual(Integer numcanastas);

    List<Player> findByNumasistenciasBetween(Integer min, Integer max);

    List<Player> findByPosicion(String posicion);

    Player findByFechaBefore(LocalDate nacimiento);


    //JPQL Queries

    @Query("SELECT player1 from Player player1 where player1.nombre like :nombre")
    //Spring no admite el % para poder definir que es un nombre inacabado, así que cumple la misma función que el findByNombre
    Player findByNombreInacabado(@Param("nombre") String nombre);

    @Query("SELECT player1.posicion, AVG(player1.numcanastas), MIN(player1.numasistencias), MAX(player1.numrebotes)" +
            "FROM Player player1 " +
            "GROUP BY player1.posicion")
    List<Object[]> agruparPosicion();

    @Query("SELECT player1.posicion, AVG(player1.numcanastas), MIN(player1.numcanastas), MAX(player1.numcanastas), AVG(player1.numasistencias), MIN(player1.numasistencias), MAX(player1.numasistencias), AVG(player1.numrebotes), MIN(player1.numrebotes), MAX(player1.numrebotes)" +
            "FROM Player player1 " +
            "GROUP BY player1.posicion")
    List<Object[]> informacionTotal();

    List<Player> findByOwner(String nombre);

    List<Player> findByOwnerAndPosicion(String nombre,String posicion);

    @Query("SELECT player1 " + " FROM Player player1 " + "WHERE player1.owner.nombre = :EquipoNombre"+" ORDER BY player1.numcanastas desc")
    List<Player>nombreJugador(@Param("EquipoNombre") String nombre, Pageable pageable);


}


