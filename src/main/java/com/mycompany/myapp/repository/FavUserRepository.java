package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.FavUser;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the FavUser entity.
 */
@SuppressWarnings("unused")
public interface FavUserRepository extends JpaRepository<FavUser, Long> {

    //  @Query("select favUser from FavUser favUser where favUser.user.login = ?#{principal.username}")
    // List<FavUser> findByUserIsCurrentUser();


    //Ejercicio 1
    @Query("select favUser.player, count(favUser) from FavUser favUser " +

        "group by favUser.player order by count(favUser) desc ")
    List<Object[]> findTopPlayers();
    //Ejercicio 2

    @Query("select favUser.player, count(favUser) from FavUser favUser " +
        "GROUP BY favUser.player order by count(favUser) desc")

    List<Object[]> findFiveFavoritePlayers(Pageable pageable);

    //Ejercicio 3

   // @Query ("select favUser.player, ")
}
