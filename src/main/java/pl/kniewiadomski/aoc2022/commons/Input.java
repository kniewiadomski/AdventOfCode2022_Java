package pl.kniewiadomski.aoc2022.commons;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Input {

    private String content;
    public static final String DEFAULT_DELIMITER = "\n";

    public Input(String filePath) {
        this.content = getFileAsString(filePath);
    }

    public String getFileAsString(String filePath) {
        try {
            Path fileName = Path.of(filePath);
            return Files.readString(fileName);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public String getContent() {
        return content;
    }
}
