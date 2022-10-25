package utils;

import java.io.*;

public class SimpleSeeker extends AbstractGrepSeeker implements GrepSeeker{

    public SimpleSeeker(String pathFile) {
        super(pathFile);
    }

    @Override
    public String find(String key) {

        try(FileInputStream fis = new FileInputStream(new File(super.getPathFile()))){
            StringBuilder sb = new StringBuilder();

        } catch (IOException e) {
            return e.getMessage();
        }
        return "";
    }
}
