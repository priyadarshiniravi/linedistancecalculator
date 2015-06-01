import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by priyara on 01/06/15.
 */
public class LineTest {
    @Test
    public void lengthCalculatorLine()
    {   Line testLine=new Line(0,0,0,4);
        Assert.assertEquals(4.0,testLine.length(),0.0d);

    }

}