package com.careerit.di.ex;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDataService {


    private final UserDataDao userDataDao;


    public String dbVersion() {
        return userDataDao.getDbVersion();
    }


}
