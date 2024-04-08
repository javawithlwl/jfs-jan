package com.careerit.di.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    @Bean
    public UserDataService userDataService(){
        UserDataService userDataService = new UserDataService();
        userDataService.setUserDataDao(userDataDao());
        return userDataService;
    }
    @Bean
    public UserDataDao userDataDao(){
        UserDataDao userDataDao = new UserDataDao();
        userDataDao.setDbConfiguration(dbConfiguration());
        return userDataDao;
    }

    @Bean
    public DbConfiguration dbConfiguration(){
        return new DbConfiguration();
    }
    @Bean
    public UserDataController userDataController(){
        UserDataController userDataController = new UserDataController();
        userDataController.setUserDataService(userDataService());
        return userDataController;
    }
}
