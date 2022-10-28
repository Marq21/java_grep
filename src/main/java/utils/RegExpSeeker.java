package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RegExpSeeker extends AbstractGrepSeeker implements GrepSeeker {

    public RegExpSeeker(String consoleCommand, String filePath, String keyWord) {
        super(consoleCommand, filePath, keyWord);
    }

    @Override
    public String find() {
        File file = new File(getPathFile());
        List<String> list;
        String result;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            list = new ArrayList<>();
            while ((result = reader.readLine()) != null){
                if(result.matches(getKeyWord())) {
                    list.add(result);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return String.join("\n", list);
    }
}
