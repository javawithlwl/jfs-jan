package com.careerit.jfs.factory;

public class ParserFactory {

    public static StatementParser getParser(BankName name) {
        return switch (name) {
            case JPMC -> new JpmcStatementParser();
            case ICICI -> new IciciStatementParser();
            case CITY -> new CityBankStatementParser();
        };
    }
}
