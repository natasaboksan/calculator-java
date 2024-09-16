import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void TestIzraza(){
        Calculator calculator1 = new Calculator();
        assertEquals("29.0" , calculator1.Run("12+10/2+8*2-4"));
    }
}