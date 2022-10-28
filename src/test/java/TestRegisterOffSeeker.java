import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.GrepSeeker;
import utils.RegisterOffSeeker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegisterOffSeeker {
    GrepSeeker seeker = new RegisterOffSeeker("-w","D:\\INTELLIJprojects\\java_grep\\src\\test\\java\\testFile\\emails.txt", "класс");
    String testLine = "тестовый класс — Класс, содержащий код модульных тестов, наследник любой из реализаций PHPUnit::TestCase;\n" +
            "тестируемый Класс — класс, который необходимо протестировать.\n" +
            "Так как подпункт для начинающих, то для начала будет рассмотрена процедура модульного тестирования обычных классов PHP, а потом описаны отличия при тестировании кода, взаимодействующего с БД.\n" +
            "Тестирование обычных классов PHP";

    @Test
    public void shouldReturnProperlyStringLines(){
        String result = seeker.find();
        Pattern pattern = Pattern.compile("класс", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(result);
        Assertions.assertTrue(matcher.find());
    }

    @Test
    public void shouldAllResults() {
        String result = seeker.find();
        Assertions.assertEquals(result, testLine);
    }
}