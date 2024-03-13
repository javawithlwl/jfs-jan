package com.careerit.jfs.factory;

import java.util.List;

public class StatementParserService {


        public void parseStatement(BankName name,String fileName){
            StatementParser parser = ParserFactory.getParser(name);
            List<String> txnList = parser.parse(fileName);
            // write txnList to the file/DB
        }
}
