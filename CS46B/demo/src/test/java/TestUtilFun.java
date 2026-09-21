import com.example.UtilFun;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class TestUtilFun {
        UtilFun utf;

        public TestUtilFun() {
            utf = new UtilFun();
        }

        @Test
        public void testAdd() {
            assertEquals(5, utf.add(2, 3));
        }

        @Test
        public void testPower2() {
            assertEquals(32, utf.power2(5));
            assertEquals(512, utf.power2(9));
        }
    }
