import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    public void sqrTest(int min, int max, int expected) {
        SQRService service = new SQRService();
        int result = service.sqrCount(min, max);
        Assertions.assertEquals(expected, result);
    }
}
