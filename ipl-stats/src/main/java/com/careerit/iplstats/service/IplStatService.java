package com.careerit.iplstats.service;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.TeamStats;

import java.util.List;
import java.util.Map;

public interface IplStatService {

    List<String> getTeamNames();
    Map<String,List<Player>> getMaxPaidPlayersOfEachRole();
    Map<String,Map<String,List<Player>>> getMaxPaidPlayersOfEachTeamAndRoleWise();
    List<TeamStats> getTestStats();
    List<TeamStats> getMaxTopAmountSpentTeams();
    List<Player> getNthHighestPaidPlayers(int n);
}
