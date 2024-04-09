package com.careerit.di.rating;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.di.rating")
public class PlayerRatingManager {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(PlayerRatingManager.class);
        PlayerService playerService = context.getBean("playerService", PlayerService.class);
        playerService.getPlayersWithRating().forEach(System.out::println);

    }
}
