package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpSeeker extends AbstractGrepSeeker implements GrepSeeker {
    Pattern pattern;
    Matcher matcher;

    public RegExpSeeker(String filePath) {
        super(filePath);
    }

    public RegExpSeeker(String consoleCommand, String filePath) {
        super(consoleCommand, filePath);
    }

    @Override
    public String find(String key) {
        return null;
    }
}
