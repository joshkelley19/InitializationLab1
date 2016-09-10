package InitializationLab1Test;

import org.junit.Assert;
import org.junit.Test;
import InitializationLab1.*;

/**
 * Created by joshuakelley on 9/10/16.
 */
public class InitializationLab1 {
    @Test
    public void getColorTest(){
        ColorfulThing test = new ColorfulThing(ColorfulThing.ColorEnum.BLUE);
        Assert.assertSame("Should return true", ColorfulThing.ColorEnum.BLUE, test.getColor());
    }
}
