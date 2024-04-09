package com.careerit.di.ex;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDataDao {

    private final DbConfiguration dbConfiguration;


    public String getDbVersion() {
        return dbConfiguration.getDbVersion();
    }


}
