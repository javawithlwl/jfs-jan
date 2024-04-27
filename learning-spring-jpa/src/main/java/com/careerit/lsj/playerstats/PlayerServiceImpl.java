package com.careerit.lsj.playerstats;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService{

    private final PlayerDetailsRepo playerDetailsRepo;

    @Override
    public List<PlayerDetailsDto> getPlayersOf(String team) {
        List<PlayerDetails> playerDetails = playerDetailsRepo.findPlayerDetailsByTeam(team);
        List<PlayerDetailsDto> playerDetailsDto = ConvertorUtil.toDto(playerDetails);
        log.info("Total players found for team : {} is : {} ",team,playerDetailsDto.size());
        return playerDetailsDto;
    }

    @Override
    public List<String> getTeams() {
        return playerDetailsRepo.findTeamNames();
    }

    @Override
    public List<PlayerDetailsDto> getPlayersByRole(String team, String role) {
        List<PlayerDetails> playerDetails = playerDetailsRepo.findByTeamAndRole(team,role);
        log.info("Total players found for team : {} and role : {} is : {} ",team,role,playerDetails.size());
        return ConvertorUtil.toDto(playerDetails);
    }

    @Override
    public List<PlayerDetailsDto> getPlayersByCountry(String country) {
        return null;
    }

    @Override
    public List<PlayerDetailsDto> getBasePricePlayers() {
        double basePrice = 2000000;
        return playerDetailsRepo.findByAmountEquals(basePrice);
    }

    @Override
    public List<CountryCountRecord> getPlayerCountByCountry() {
        return null;
    }

    @Override
    public List<TeamAmountRecord> getTeamAmount() {
        return null;
    }

    @Override
    public List<TeamCountTotalAmountRecord> getTeamCountTotalAmount() {
        return playerDetailsRepo.findTeamCountTotalAmount();
    }

    @Override
    public List<PlayerDetailsDto> getTopNPlayers(int n) {
        return null;
    }

    @Override
    public List<PlayerDetailsDto> getTopPaidPlayersOfEachTeam() {
        List<PlayerDetails> playerDetails =  playerDetailsRepo.getTopPaidPlayersOfEachTeam();
        return ConvertorUtil.toDto(playerDetails);
    }

    @Override
    public List<PlayerDetailsDto> getTopPaidPlayersOfEachCountry() {
        return null;
    }
}
