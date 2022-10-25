package utils;

public class RegisterOffSeeker extends AbstractGrepSeeker implements GrepSeeker {

    public RegisterOffSeeker(String command, String pathFile) {
        super(command, pathFile);
    }
    @Override
    public String find(String key) {
        return null;
    }
}
