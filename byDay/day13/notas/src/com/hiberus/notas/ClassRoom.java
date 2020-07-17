package com.hiberus.notas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ClassRoom {
    private String[] students;
    private int[] notes;

    public ClassRoom() {
        students = readStringsFromFile("data/nombres.txt");
        notes = readIntsFromFile("notas.txt");
    }

    public void passed() {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] > 5) {
                System.out.println(students[i] + " " + notes[i]);
            }
        }
    }

    public void avg() {
        int total = 0;
        for (int i = 0; i < notes.length; i++) {
            total += notes[i];
        }

        System.out.println("Nota media: " + (total / notes.length));
    }

    public void maxMin() {

    }

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
