import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxServicesTest {
    @Test
    public void shouldFindMaxB() {
        MaxServices services = new MaxServices();
        int a = 0;
        int b = 1;
         int exp = b;
         int act = services.max(a, b);
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void shouldFindMaxA() {
        MaxServices services = new MaxServices();
        int a = 1;
        int b = 0;
        int exp = a;
        int act = services.max(a, b);
        Assertions.assertEquals(exp, act);
    }

}
