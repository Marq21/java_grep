package utils;

import java.util.ArrayList;
import java.util.List;

public class GrepSeekerInitializer {
    public static GrepSeeker initialize(List<String> args) {

        List<String> argsList = new ArrayList<>(args);
        if (argsList.size() == 4) {
            if (argsList.contains(Command.WITHOUT_REGISTER_SEARCH.getCommand())) {
                return new RegisterOffSeeker(argsList.get(1), argsList.get(2), argsList.get(3));
            } else if(argsList.contains(Command.REGEXP_SEARCH.getCommand())){
                return new RegExpSeeker(argsList.get(1), argsList.get(2), argsList.get(3));
            }
        } else {
            return new SimpleSeeker(argsList.get(1), argsList.get(2));
        }
        return new EmptyGrepSeeker("", "");
    }
}
