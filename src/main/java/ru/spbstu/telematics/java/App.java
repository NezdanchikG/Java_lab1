package ru.spbstu.telematics.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class App {
    public static void main(String[] args) {
        readFile().forEach(System.out::println);
    }

    public static List<String> readFile() {
        URL resource = App.class.getResource("/input.txt");
        try (BufferedReader reader = Files.newBufferedReader(Path.of(resource.toURI()))) {
            return reader.lines().toList();
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }


}


