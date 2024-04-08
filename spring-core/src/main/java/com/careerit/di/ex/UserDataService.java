package com.careerit.di.ex;

public class UserDataService {


    private UserDataDao userDataDao;

    public String dbVersion() {
        return userDataDao.getDbVersion();
    }

    public UserDataDao getUserDataDao() {
        return userDataDao;
    }

    public void setUserDataDao(UserDataDao userDataDao) {
        this.userDataDao = userDataDao;
    }
}
