package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SimpleSeeker extends AbstractGrepSeeker implements GrepSeeker {

    public SimpleSeeker(String pathFile, String keyWord) {
        super(pathFile, keyWord);
    }

    @Override
    public String find() {
        File file = new File(getPathFile());

        if (!file.isFile()) {
            System.out.println("object is not a file!");
        }
        List<String> list;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            list = new ArrayList<>();
            StringBuilder fw = new StringBuilder();

            while (reader.ready()) {
                fw.append(reader.readLine());
                if (fw.toString().contains(getKeyWord())) {
                    list.add(fw.toString());
                }
                fw.setLength(0);
            }

        } catch (IOException e) {
            return e.getMessage();
        }
        return String.join("\n", list);
    }
}
