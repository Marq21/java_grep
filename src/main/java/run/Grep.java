package run;

import utils.Command;
import utils.GrepSeeker;
import utils.GrepSeekerInitializer;

import java.util.List;
import java.util.Scanner;

public class Grep {

    private String inputCommand;
    private Scanner sc;
    private GrepSeeker grepSeeker;
    private Command command;
    private List<String> list;
    public final String helpMessage = "grep navigation:\n"
            + "\t- grep [search option][file path] [file name] [key word] - for simple search;\n"
            + "search options:\n "
            + "\t- '-i' - for regExp search;\n"
            + "\t- '-w' - for ignoreCase search;\n"
            + "tap 'grep stop' - for stopping app;\n"
            + "tap 'grep help' - for show this message again";

    public void runGrep() {

        sc = new Scanner(System.in);
        inputCommand = sc.nextLine();
        command = Command.JAVA_GREP_START;
        System.out.println(helpMessage);

        if (inputCommand.equals(command.getCommand())) {
            while (!command.equals(Command.JAVA_GREP_STOP)) {
                try {
                    list = List.of(sc.next().split("\\s"));
                    String key = list.get(list.size()-1);
                    grepSeeker = GrepSeekerInitializer.initialize(list);
                    grepSeeker.find(key);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("incorrect command, try to input 'grep help' to see all commands");
                }
            }
        } else {
            System.out.println("incorrect command, try to input 'grep help' to see all commands");
        }

    }
}
