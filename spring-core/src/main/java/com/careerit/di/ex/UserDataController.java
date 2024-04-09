package com.careerit.di.ex;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserDataController {

    private final UserDataService userDataService;

    public String dbVersion() {
        return userDataService.dbVersion();
    }

}
