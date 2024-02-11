package ru.spbstu.telematics.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("input.txt"))) {
            reader.lines().forEach(System.out::println);
        }
    }
}
