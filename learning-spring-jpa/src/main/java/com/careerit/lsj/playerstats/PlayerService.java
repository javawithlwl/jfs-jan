package com.careerit.lsj.playerstats;

import java.util.List;

public interface PlayerService {

        List<PlayerDetailsDto> getPlayersOf(String team);
        List<String> getTeams();
        List<PlayerDetailsDto> getPlayersByRole(String team, String role);
        List<PlayerDetailsDto> getPlayersByCountry(String country);
        List<PlayerDetailsDto> getBasePricePlayers(); // base price is less than 20,00,000

        List<CountryCountRecord> getPlayerCountByCountry();
        List<TeamAmountRecord> getTeamAmount();
        List<TeamCountTotalAmountRecord> getTeamCountTotalAmount();
        List<PlayerDetailsDto> getTopNPlayers(int n);

        List<PlayerDetailsDto> getTopPaidPlayersOfEachTeam();
        List<PlayerDetailsDto> getTopPaidPlayersOfEachCountry();
}
