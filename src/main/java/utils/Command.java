package utils;

public enum Commands {

    MAIN_COMMAND("grep "),
    REGEXP_SEARCH("grep -i"),
    WITHOUT_REGISTER_SEARCH("grep -w");

    final String command;

    Commands(String command){
        this.command = command;
    }

}
