import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.GrepSeeker;
import utils.SimpleSeeker;

public class TestSimpleSeeker {
    GrepSeeker seeker = new SimpleSeeker("D:\\INTELLIJprojects\\java_grep\\src\\test\\java\\testFile\\testSimpleSeekerTextFile.txt", "класс");
    String testLine = "тестовый класс — класс, содержащий код модульных тестов, наследник любой из реализаций PHPUnit::TestCase;\n" +
            "тестируемый класс — класс, который необходимо протестировать.\n" +
            "Так как подпункт для начинающих, то для начала будет рассмотрена процедура модульного тестирования обычных классов PHP, а потом описаны отличия при тестировании кода, взаимодействующего с БД.\n" +
            "Тестирование обычных классов PHP";

    @Test
    public void shouldReturnProperlyStringLines(){
        String result = seeker.find();
        Assertions.assertTrue(result.contains("класс"));
    }

    @Test
    public void shouldAllResults() {
        String result = seeker.find();
        Assertions.assertEquals(result, testLine);
    }
}
