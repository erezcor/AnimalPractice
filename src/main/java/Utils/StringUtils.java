package Utils;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import static java.nio.file.Files.readString;
import static java.nio.file.Path.of;

public class StringUtils {
    final private static String SPACE_CHAR_IN_STRING = " ";

    public static String getTextFileAsString(String filePath) throws IOException {
        return readString(of(filePath));
    }

    public static List<String> splitWordsOfString(String text) {
        return Arrays.asList(text.split(SPACE_CHAR_IN_STRING));
    }
}
