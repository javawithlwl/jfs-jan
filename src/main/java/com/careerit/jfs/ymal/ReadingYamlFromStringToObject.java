package com.careerit.jfs.ymal;

import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class ReadingYamlFromStringToObject {

    public static void main(String[] args) {

            String document = """
                    name: Lenovo Thinkpad
                  """;
        LoaderOptions options = new LoaderOptions();
        Yaml yaml = new Yaml(options);
        Map<String,String> map = yaml.load(document);
        System.out.println(map);
    }
}
