package com.hiberus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ThirdWeek {
    public String[] readStringsFromFile(String path) {
        try {
            List<String> strings = Files.readAllLines(Paths.get(path));
            return strings.toArray(new String[strings.size()]);
        } catch (IOException e) {
            return null;
        }
    }

    public int[] readIntsFromFile(String path) {
        try {
            int[] ints = Files.lines(Paths.get(path))
                    .mapToInt(Integer::parseInt).toArray();

            return ints;
        } catch (IOException e) {
            return null;
        }
    }
}
