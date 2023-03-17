package model;

import java.nio.file.Path;
import java.nio.file.Paths;

//public class FileDB {
//    private static final String NEW_LINE = System.lineSeparator();
//    Path path = Paths.get("src/main/resources/UserList");
//
//    private static void writeFile(Path path, String content) throws IOException {
//
//        Files.write(path, content.getBytes(StandardCharsets.UTF_8));
//
//        // Append mode
//        // if the file exists, append string to the end of file.
//        // Files.write(path, content.getBytes(StandardCharsets.UTF_8),
//        //	StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//
//        // if file does not exist, throws NoSuchFileException
//        // if the file exists, append it
//        // Files.write(path, content.getBytes(StandardCharsets.UTF_8),
//        //	StandardOpenOption.APPEND);
//    }
//
//        // If the file doesn't exists, create and write to it
//        // If the file exists, truncate (remove all content) and write to it
//
////        try (FileWriter writer = new FileWriter("app.log");
////             BufferedWriter bw = new BufferedWriter(writer)) {
////
////            bw.write(content);
////
////        } catch (IOException e) {
////            System.err.format("IOException: %s%n", e);
////        }
//
//
//}