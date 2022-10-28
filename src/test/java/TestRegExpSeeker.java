import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.GrepSeeker;
import utils.RegisterOffSeeker;
import java.io.File;

public class TestRegExpSeeker {
    GrepSeeker seeker = new RegisterOffSeeker("-i","D:\\INTELLIJprojects\\java_grep\\src\\test\\java\\testFile\\alotoftext.txt", "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?");
    File testFile = new File("D:\\INTELLIJprojects\\java_grep\\src\\test\\java\\testFile\\emails.txt");

    @Test
    public void shouldReturnProperlyStringLines(){
        String result = seeker.find();
        String assertString = new RegisterOffSeeker("-i", "D:\\INTELLIJprojects\\java_grep\\src\\test\\java\\testFile\\emails.txt", "^[A-Z0-9+_.-]+@[A-Z0-9.-]+$")
                .find();
        Assertions.assertEquals(result, assertString);
    }

}
