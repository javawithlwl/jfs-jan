package com.careerit.di.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class DbConnection implements DisposableBean, InitializingBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("DbConnection is closed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("DbConnection is created");
    }
    public String getConnectionInfo(){
        return "DB Version 1.0";
    }
}
