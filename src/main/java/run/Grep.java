package utils;

import java.util.List;
import java.util.Scanner;

public class Grep {
    String inputCommand;
    Scanner sc;
    GrepSeeker grepSeeker;
    Command command;
    List<String> list;

    public void runGrep() {

        sc = new Scanner(System.in);
        inputCommand = sc.nextLine();
        command = Command.JAVA_GREP_START;

        if (inputCommand.equals(command.getCommand())) {
            while (!command.equals(Command.JAVA_GREP_STOP)) {
                list = List.of(sc.next().split("\\s"));
            }
        } else {
            System.out.println("incorrect command, try to input 'grep help' to see all commands");
        }

    }
}
