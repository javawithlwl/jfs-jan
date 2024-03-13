package com.careerit.jfs.day11;

public class StringWithJSONData {

    public static void main(String[] args) {

            String empJson = """
                    {
                        "empno":1001,
                        "empname":"Krish",
                        "salary":100000
                    }
                    """;
            System.out.println(empJson);
    }

    public static String getHtmlText(){
        return """
                <html>
                    <head>
                        <title>Sample Page</title>
                    </head>
                    <body>
                        <h1>Welcome to the sample page</h1>
                    </body>
                </html>
               """;

    }
}
