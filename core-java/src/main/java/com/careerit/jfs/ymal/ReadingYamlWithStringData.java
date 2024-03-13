package com.careerit.jfs.ymal;

import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;

import java.util.List;

public class ReadingYamlWithStringData {

    public static void main(String[] args) {
        LoaderOptions options = new LoaderOptions();
        Yaml yaml = new Yaml(options);
        String str = """
                - Manoj
                - Krish
                - Charan
                - Haadya
                """;

        List<String> list = yaml.load(str);
        list.forEach(ele -> System.out.println(ele.toUpperCase()));
    }
}
