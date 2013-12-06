package pl.gpost;

import org.junit.Assert;
import org.junit.Test;


public class AppTest {

    @Test
    public void testSum() {
        // given
        App app = new App(3, 6);

        // when
        int sum = app.calculateSum();

        // then
        Assert.assertEquals(9, sum);
    }

}
