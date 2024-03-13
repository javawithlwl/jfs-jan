package com.careerit.jfs.factory;

public class StatementParserManager {

    public static void main(String[] args) {

        StatementParserService service = new StatementParserService();
        service.parseStatement(BankName.JPMC, "jpmc.pdf");
        service.parseStatement(BankName.ICICI, "icici.pdf");
        service.parseStatement(BankName.CITY, "city.pdf");
    }
}
