
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyMockitoTest {
    IMyCircle circle = mock(IMyCircle.class);


    MyCircle mycircle = mock(MyCircle.class);

    @Before
    public  void setUp()
    {

    }


    @After
    public void tearDown() throws Exception {
        circle=null;
    }

    //Thinking only with interfaces
    @Test
    public  void makeCircle()
    {

        when(circle.area()).thenReturn((3.0*3.0)*Math.PI);

        Double result= circle.area();
        Double expeted=(3.0*3.0)*Math.PI;
        assertEquals(expeted,result);
        verify(circle).area();
    }

    @Test
    public  void makeCircleReal()
    {

        when(mycircle.area()).thenReturn((3.0*3.0)*Math.PI);

        Double result= mycircle.area();
        Double expeted=(3.0*3.0)*Math.PI;
        assertEquals(expeted,result);
        verify(mycircle).area();
    }

}
