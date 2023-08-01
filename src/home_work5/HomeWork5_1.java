package home_work5;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class HomeWork5_1 {
    public static void main(String[] args) throws IOException {
        Files.createDirectory(Path.of("./backup"));

        DirectoryStream<Path> dir = Files.newDirectoryStream(Path.of("."));
        for (Path file : dir) {
            if (Files.isDirectory(file)) continue;
            Files.copy(file, Path.of("./backup/" + file.toString()));
            }
    }
}
