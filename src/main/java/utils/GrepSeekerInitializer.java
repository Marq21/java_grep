package utils;

import java.util.ArrayList;
import java.util.List;

public class GrepSeekerInitializer {
    public static GrepSeeker initialize(List<String> args) {
        if (args.size() < 2) {
            System.out.println("Not enough information, try to input command 'grep help' to see all commands");
        }

        List<String> argsList = new ArrayList<>(args);
        if (argsList.size() == 3) {
            if (argsList.contains(Command.WITHOUT_REGISTER_SEARCH.getCommand())) {
                return new RegisterOffSeeker(argsList.get(1), argsList.get(2));
            } else {
                return new RegExpSeeker(argsList.get(1), argsList.get(2));
            }
        } else {
            return new SimpleSeeker(argsList.get(1));
        }
    }
}
