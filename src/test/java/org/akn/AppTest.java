package org.akn;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{

    @Test
    public void testAppUpperCase(){
        App app = new App();
        System.out.println(app.nameUpperCase("Askhan Hassan"));
        Assert.assertEquals(app.nameUpperCase("Askhan Hassan"),"ASKHAN HASSAN");

    }
}
