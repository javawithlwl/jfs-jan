package com.careerit.jfs.iplstats;

import java.util.List;

public interface IplStatsService {

        List<Player> getPlayersByTeam(String team);
        List<Player> getPlayersByTeamAndRole(String teamName,String role);
        List<Player> getMaxPaidPlayerOf(String team);
        List<Player> getMaxPaidPlayers();

        List<TeamStats> getTeamStats();
}
