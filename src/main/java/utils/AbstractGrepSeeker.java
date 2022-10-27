package utils;


abstract public class AbstractGrepSeeker {

    private Command utilCommand;
    private final String pathFile;

    public AbstractGrepSeeker(String filePath) {
        this.pathFile = filePath;
    }

    public String getPathFile() {
        return pathFile;
    }

    public AbstractGrepSeeker(String consoleCommand, String filePath) {
        this.pathFile = filePath;
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

