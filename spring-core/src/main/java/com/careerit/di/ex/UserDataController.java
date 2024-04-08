package com.careerit.di.ex;

public class UserDataController {


    private UserDataService userDataService;

    public String dbVersion(){
        return userDataService.dbVersion();
    }

    public UserDataService getUserDataService() {
        return userDataService;
    }

    public void setUserDataService(UserDataService userDataService) {
        this.userDataService = userDataService;
    }
}
