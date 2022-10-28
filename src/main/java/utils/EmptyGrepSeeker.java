package utils;

import static run.Grep.HELP_MESSAGE;

public class EmptyGrepSeeker extends AbstractGrepSeeker implements GrepSeeker{


    public EmptyGrepSeeker(String filePath, String keyWord) {
        super(filePath, keyWord);
    }

    @Override
    public String find() {
        return "Incorrect arguments!\n" + HELP_MESSAGE;
    }
}
