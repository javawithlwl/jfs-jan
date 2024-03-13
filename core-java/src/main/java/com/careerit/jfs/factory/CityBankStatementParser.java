package com.careerit.jfs.factory;

import java.util.List;

public class CityBankStatementParser implements StatementParser {
    @Override
    public List<String> parse(String fileName) {
        System.out.println("City bank statement parser");
        return null;
    }
}
