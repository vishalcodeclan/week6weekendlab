import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        bedroom = new Bedroom(201, Type.SINGLE, 1);
    }

    @Test
    public void getType(){
        assertEquals(Type.SINGLE, bedroom.getType());
    }

    @Test
    public void getCapacity(){
        assertEquals(1, bedroom.getType().getCapacity());
    }

    @Test
    public void getValue(){
        assertEquals(100, bedroom.getType().getValue());
    }

}
