package com.careerit.jfs.iplcorestats;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IplStatsServiceImpl implements IplStatsService {

    private List<Player> players;

    public IplStatsServiceImpl() {
        players = PlayerDataReaderUtil.loadPlayersData();
    }

    @Override
    public List<String> teamNames() {
        /*List<String> teamNames = new ArrayList<>();
        for (Player player : players) {
            if(!teamNames.contains(player.getTeam())) {
                teamNames.add(player.getTeam());
            }
        }
        return teamNames;*/

        return players.stream()
                .map(Player::getTeam)
                .distinct()
                .toList();
    }

    @Override
    public List<Player> playersByTeam(String teamName) {
        /*List<Player> teamPlayers = new ArrayList<>();
        for (Player player : players) {
            if(player.getTeam().equalsIgnoreCase(teamName)) {
                teamPlayers.add(player);
            }
        }
        return teamPlayers;*/
        return players.stream()
                .filter(player -> player.getTeam().equalsIgnoreCase(teamName))
                .toList();
    }

    @Override
    public List<TeamRoleCountRecord> roleCountByTeam(String teamName) {
        List<Player> teamPlayers = playersByTeam(teamName);
        Map<String,Integer> roleCountMap = new HashMap<>();
        for (Player player : teamPlayers) {
            String role = player.getRole();
            roleCountMap.put(role,roleCountMap.getOrDefault(role,0)+1);
        }
        return getTeamRoleCountRecords(teamName, roleCountMap);
    }

    @Override
    public List<TeamRoleAmountRecord> roleAmountByTeam(String teamName) {
        return null;
    }

    @Override
    public List<TeamAmountRecord> amountByTeam() {
        return null;
    }

    @Override
    public List<TeamCountRecord> playerCountOfEachTeam() {
        return null;
    }

    @Override
    public Map<String, List<Player>> getTopPaidPlayersOfEachTeam() {
        // Group the players by team
        Map<String,List<Player>> playerAndTeamMap = players.stream()
                .collect(Collectors.groupingBy(Player::getTeam));

        Map<String, List<Player>> topPaidPlayersMap = new HashMap<>();
        for (Map.Entry<String, List<Player>> entry : playerAndTeamMap.entrySet()) {
            List<Player> players = entry.getValue();
            double maxAmount = maxAmount(players);
            List<Player> topPaidPlayers = players.stream()
                    .filter(player -> player.getAmount() == maxAmount)
                    .toList();
            topPaidPlayersMap.put(entry.getKey(), topPaidPlayers);
        }
        return topPaidPlayersMap;
    }

    @Override
    public List<Player> getTopPaidPlayers() {
         double maxAmount = maxAmount(players);
         return players.stream()
                 .filter(player -> player.getAmount() == maxAmount)
                 .toList();
    }

    @Override
    public List<Player> getTopPaidPlayers(int n) {
        return null;
    }

    private static List<TeamRoleCountRecord> getTeamRoleCountRecords(String teamName, Map<String, Integer> roleCountMap) {
        List<TeamRoleCountRecord> teamRoleCountList =  new ArrayList<>();
        for (Map.Entry<String, Integer> entry : roleCountMap.entrySet()) {
            String roleName = entry.getKey();
            int count = entry.getValue();
            TeamRoleCountRecord teamRoleCountDto = new TeamRoleCountRecord(teamName, roleName, count);
            teamRoleCountList.add(teamRoleCountDto);
        }
        return teamRoleCountList;
    }

    private double maxAmount(List<Player> players) {
        return players.stream()
                .mapToDouble(Player::getAmount)
                .max()
                .orElse(0);
    }
}
