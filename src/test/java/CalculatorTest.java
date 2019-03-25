import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;


@Before
public void before() {
    calculator = new Calculator(3, 5);
}

@Test
public void canAdd() {
    assertEquals(8, calculator.canAdd(), 0.1); }

@Test
    public void canSubtrack(){
    assertEquals(-2, calculator.canSubtrack(), 0.1);
}

@Test
    public void canMultiply(){
    assertEquals(15, calculator.canMultiply(), 0.1);
}

@Test
    public void canDivide(){
    assertEquals(0.6, calculator.canDivide(), 0.01);
}

}

