package com.careerit.jfs.collections.sort;

import java.util.*;


public class PlayerManager {


    public static void main(String[] args) {

        List<Player> players = loadPlayers();
        List<Player> sortedList = players.stream()
                .sorted(Comparator.comparing(Player::getAmount).reversed()
                        .thenComparing(Player::getCountry)
                        .thenComparing(Player::getTeam)
                ).toList();
       sortedList.forEach(System.out::println);

       // limit and skip

         List<Player> topPaidPlayers = sortedList.stream()
                 .skip(1)
                 .limit(3)
     		    .toList();
        System.out.println("Top paid players : "+topPaidPlayers);

        Map<String,List<Player>> map = new HashMap<>();

        for(Player player:players) {
            /*if(map.containsKey(player.getTeam())) {
                List<Player> list = map.get(player.getTeam());
                list.add(player);
                map.put(player.getTeam(), list);
            }else{
                List<Player> list = new ArrayList<>();
                list.add(player);
                map.put(player.getTeam(), list);
            }*/
            map.computeIfAbsent(player.getTeam(), k -> new ArrayList<>()).add(player);
        }
        System.out.println("-".repeat(50));
        System.out.println(map);


        String names = "Sachin,Dravid,Ganguly,Kohli,Dhoni,Sachin,Dravid,Ganguly,Kohli,Dhoni,Sachin,Dravid,Ganguly,Kohli,Dhoni";
        String[] arr = names.split(",");
        Map<String,Integer> nameCountMap = new HashMap<>();
        for(String name:arr) {
            /*if(nameCountMap.containsKey(name)) {
                int count = nameCountMap.get(name);
                nameCountMap.put(name, count + 1);
            }else {
                nameCountMap.put(name, 1);
            }*/
            /*nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);*/
           /* nameCountMap.merge(name, 1, Integer::sum);*/
           /* nameCountMap.compute(name, (k,v) -> v == null ? 1 : v + 1);*/
           /* nameCountMap.putIfAbsent(name, 0);
            nameCountMap.computeIfPresent(name, (k,v) -> v + 1);*/
            int val = nameCountMap.computeIfAbsent(name, k -> 0) + 1;
            nameCountMap.put(name, val);
        }
        System.out.println(nameCountMap);

        String str = "Sachin,Dravid,Ganguly,Kohli,Dhoni,Sachin,Dravid,Ganguly,Kohli,Dhoni,Sachin,Dravid,Ganguly,Kohli,Dhoni";
        String[] namesArr = str.split(",");
        List<String> namesList = Arrays.asList(namesArr);
        System.out.println(namesList);


    }

    public static List<Player> loadPlayers() {

        return List.of(
                new Player("Dhoni", "WK", "IND", "CSK", 1800000),
                new Player("Kohli", "Batsman", "IND", "RCB", 1800000),
                new Player("Rohit", "Batsman", "IND", "MI", 1800000),
                new Player("Warner", "Batsman", "AUS", "SRH", 1800000),
                new Player("Buttler", "WK", "ENG", "RR", 1400000),
                new Player("Smith", "Batsman", "AUS", "RR", 1300000),
                new Player("Williamson", "Batsman", "NZ", "SRH", 1800000),
                new Player("Rahul", "Batsman", "IND", "KXIP", 1100000),
                new Player("Pandya", "All-rounder", "IND", "MI", 1000000),
                new Player("Russell", "All-rounder", "WI", "KKR", 900000)
        );
    }

}
