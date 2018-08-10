import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CalculatorSqrtTest {

    @Parameterized.Parameters
    public  static Iterable<Object[]> getData()
    {
        Double initial =9875.0;
       return Stream.iterate(initial, x->x+1.0).limit(100).map(x -> new Object[] {x,Math.sqrt(x)} ).collect(Collectors.toList());

    }

    Double argument;
    Double expeted;
    public CalculatorSqrtTest(Double argument, Double expeted)

    {
        this.argument = argument;
        this.expeted=expeted;

    }

    Calculator calc;
    @Before
    public void setUp() throws Exception {
        calc= new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        calc=null;
    }

    @Test
    public void sqr() {


        assertEquals( this.expeted ,this.calc.sqr(this.argument) );
    }
}