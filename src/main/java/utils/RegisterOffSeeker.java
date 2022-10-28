package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RegisterOffSeeker extends AbstractGrepSeeker implements GrepSeeker {

    public RegisterOffSeeker(String command, String pathFile, String keyWord) {
        super(command, pathFile, keyWord);
    }

    @Override
    public String find() {
        File file = new File(getPathFile());
        String keyWordInLowerCase = getKeyWord().toLowerCase();
        if (!file.isFile()) {
            System.out.println("object is not a file!");
        }
        List<String> list;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            list = new ArrayList<>();
            StringBuilder fw = new StringBuilder();
            StringBuilder sb = new StringBuilder();

            while (reader.ready()) {
                sb.append(reader.readLine());
                fw.append(sb.toString().toLowerCase());
                if (fw.toString().contains(keyWordInLowerCase)) {
                    list.add(sb.toString());
                }
                fw.setLength(0);
                sb.setLength(0);
            }

        } catch (IOException e) {
            return e.getMessage();
        }
        return String.join("\n", list);
    }
}

