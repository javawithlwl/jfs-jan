package com.careerit.iplstats.dao;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.TeamStats;

import java.util.List;

public interface IplStatsDao {


        List<String> getTeamNames();
        List<Player> getMaxPaidPlayersOfEachRole();
        List<Player> getMaxPaidPlayersOfEachRoleOfEachTeam();
        List<TeamStats> getTestStats();
        List<TeamStats> getMaxTopAmountSpentTeams();
        List<Player> getNthHighestPaidPlayers(int n);


}
