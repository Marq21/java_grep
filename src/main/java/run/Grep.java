package run;

import utils.Command;
import utils.GrepSeeker;
import utils.GrepSeekerInitializer;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grep {
    private String inputCommand;
    private Scanner sc;
    private GrepSeeker grepSeeker;
    private Command command;
    private List<String> list;
    public static final String HELP_MESSAGE = "grep navigation:\n"
            + "\t- grep \"search option\" \"file path\" \"file name\" \"key word\" - for searching;\n"
            + "use symbols \"args\" for input arguments;\n"
            + "search options:\n "
            + "\t- \"-i\" - for regExp search;\n"
            + "\t- \"-w\" - for ignoreCase search;\n"
            + "tap \"grep stop\" - for stopping app;\n"
            + "tap \"grep help\" - for show this message again;";

    public void runGrep() {

        System.out.println(HELP_MESSAGE);
        sc = new Scanner(System.in);
        inputCommand = sc.nextLine();
        command = Command.JAVA_GREP_START;


        if(inputCommand.equals(Command.HELP_COMMAND.getCommand())) {
            System.out.println(HELP_MESSAGE);
        }

        if (inputCommand.equals(command.getCommand())) {
            while (!command.equals(Command.JAVA_GREP_STOP)) {
                try {
                    list = Stream.of(sc.nextLine().split("\\s"))
                            .map(s -> s.replaceAll("\"", ""))
                            .collect(Collectors.toList());
                    if(list.size() < 2) {
                        System.out.println("Not enough information, try to input command 'grep help' to see all commands");
                    }
                    grepSeeker = GrepSeekerInitializer.initialize(list);
                    System.out.println(grepSeeker.find());
                    command = Command.JAVA_GREP_STOP;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("incorrect command, try to input 'grep help' to see all commands");
                }
            }
        } else {
            System.out.println("incorrect command, try to input 'grep help' to see all commands");
        }

    }
}
