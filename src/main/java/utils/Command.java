package utils;

public enum Command {

    REGEXP_SEARCH("-i"),
    WITHOUT_REGISTER_SEARCH("-w"),
    JAVA_GREP_START("grep start"),
    JAVA_GREP_STOP("grep stop"),
    HELP_COMMAND("grep help");

    final String command;

    Command(String command){
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

}
