package com.careerit.di.ex;

public class UserDataDao {

       private DbConfiguration dbConfiguration;

        public String getDbVersion(){
            return dbConfiguration.getDbVersion();
        }

    public DbConfiguration getDbConfiguration() {
        return dbConfiguration;
    }

    public void setDbConfiguration(DbConfiguration dbConfiguration) {
        this.dbConfiguration = dbConfiguration;
    }
}
