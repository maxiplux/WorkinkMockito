import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        calc = null;
    }


    @Test
    public void suma() {
        this.calc = new Calculator();
        int expeted = calc.sum(5, 2);
        assertEquals(expeted, 7);
    }

    @Test
    public void div() {
        this.calc = new Calculator();
        int soultion = calc.div(5, 2);
        int expeted = 2;
        //assertEquals(soultion,4);
        assert (soultion == expeted) : String.format("fail on div solution(%s) expeted(%s)", soultion, expeted);
    }

    @Test
    public void divByZero() {
        this.calc = new Calculator();
        Integer soultion = calc.div(5, 0);
        Integer expeted = null;
        //assertEquals(soultion,4);
        assert (soultion == expeted) : String.format("fail on div solution(%s) expeted(%s)", soultion, expeted);
    }
}
