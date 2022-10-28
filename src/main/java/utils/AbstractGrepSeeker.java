package utils;


abstract public class AbstractGrepSeeker {

    private final String keyWord;
    private Command utilCommand;
    private final String pathFile;

    public AbstractGrepSeeker(String filePath, String keyWord) {
        this.pathFile = filePath;
        this.keyWord = keyWord;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public String getPathFile() {
        return pathFile;
    }

    public AbstractGrepSeeker(String consoleCommand, String filePath, String keyWord) {
        this.pathFile = filePath;
        this.keyWord = keyWord;
        switch (consoleCommand) {
            case "-i":
                utilCommand = Command.REGEXP_SEARCH;
                break;
            case "-w":
                utilCommand = Command.WITHOUT_REGISTER_SEARCH;
                break;
            case "help":
                utilCommand = Command.HELP_COMMAND;
        }
    }
}

