package utils;

public enum Command {

    MAIN_COMMAND("grep "),
    REGEXP_SEARCH("grep -i"),
    WITHOUT_REGISTER_SEARCH("grep -w"),
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
