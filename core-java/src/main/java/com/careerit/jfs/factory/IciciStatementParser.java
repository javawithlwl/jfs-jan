package com.careerit.jfs.factory;

import java.util.List;

public class IciciStatementParser implements StatementParser {
    @Override
    public List<String> parse(String fileName) {
        System.out.println("Icici statement parser");
        return null;
    }
}
