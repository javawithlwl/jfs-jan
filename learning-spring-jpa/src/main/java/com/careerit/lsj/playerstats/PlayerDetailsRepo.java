package com.careerit.lsj.playerstats;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface PlayerDetailsRepo extends JpaRepository<PlayerDetails, UUID>{

    @Query("select p from PlayerDetails p where p.team = :team")
    List<PlayerDetails> findPlayerDetailsByTeam(@Param("team") String team);

    @Query("select distinct(p.team) from PlayerDetails p")
    List<String> findTeamNames();

    List<PlayerDetails> findByTeamAndRole(String team, String role);

    List<PlayerDetailsDto> findByAmountEquals(double basePrice);

    @Query("select new com.careerit.lsj.playerstats.TeamCountTotalAmountRecord(p.team,count(p),sum(p.amount)) from PlayerDetails p group by p.team order by sum(p.amount) desc")
    List<TeamCountTotalAmountRecord> findTeamCountTotalAmount();

    @Query(value = """
            select id,name,role,amount,team,country from(
                select id,name,role,amount,team,country, dense_rank()
                over(partition by team order by amount desc) rnk from player_details) tmp
                where tmp.rnk=1;
            """,nativeQuery = true)
    List<PlayerDetails> getTopPaidPlayersOfEachTeam();
}
