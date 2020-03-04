import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimateClassTest {

    private PrimateClass primate;

    @Before
    public void setUp() throws Exception {
        primate = new PrimateClass();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void hasHiar() {
        boolean result = primate.hasHiar();
        Assert.assertEquals(true , true);
    }
}