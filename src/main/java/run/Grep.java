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

    public void runGrep() {

        sc = new Scanner(System.in);
        inputCommand = sc.nextLine();
        command = Command.JAVA_GREP_START;

        if (inputCommand.equals(command.getCommand())) {
            while (!command.equals(Command.JAVA_GREP_STOP)) {
                list = List.of(sc.next().split("\\s"));
                String key = list.get(list.size()-1);
                grepSeeker = GrepSeekerInitializer.initialize(list);
                grepSeeker.find(key);
            }
        } else {
            System.out.println("incorrect command, try to input 'grep help' to see all commands");
        }

    }
}
