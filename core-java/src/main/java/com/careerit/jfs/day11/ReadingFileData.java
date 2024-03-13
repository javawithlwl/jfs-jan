package com.careerit.jfs.day11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadingFileData {

    public static void main(String[] args) throws IOException {

        List<String> names = Files.readAllLines(Path.of(ReadingFileData.class.getResource("/names.txt").getPath()));
        StringBuffer data = new StringBuffer();
        for (String name : names) {
            data.append(name).append(",");
        }
        System.out.println(data.subSequence(0, data.length() - 1));
    }
}
