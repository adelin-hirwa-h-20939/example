import org.junit.Test;

import static org.junit.Assert.*;

public class calcTest {

    @Test
    public void twoPlusTwoShouldEqualFour(){

      calc c=new calc();
     assertEquals(4,c.AddNum(2,2));
    // assertNotEquals(4,c.AddNum(2,2));

     /* boolean and others
     assertTrue();
     assertFalse();
     assertNull();
     assertNotNull();

     assertEquals(4,calculator.add(2,2));

      */
    }



}