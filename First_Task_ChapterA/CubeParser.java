package by.epam.task1chpta.parser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class CubeParser {
    public static final int QUANTITY_OF_NUMBERS = 25;
    public static void parsing(Stream<String> s) {
        String fileName = "C://info.txt";
        List<String> lines = new ArrayList<>();
        String[] cubeArray = new String[QUANTITY_OF_NUMBERS];
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(lines :: add);
            for(String line : lines){
                cubeArray = line.split(" ");
            }
        } catch (IOException e) {

        }
    }
}
