package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CommonProductCalculatorTest {

    private CommonProductCalculator commonProductCalculator;

    @Before
    public void init() {
        commonProductCalculator = new CommonProductCalculator();
    }

    @Test
    public void testCalculateCommonProductQuality1() {
        Assert.assertEquals(19, commonProductCalculator.calculateCommonProductQuality(10, 20, 9));
    }

    @Test
    public void testCalculateCommonProductQuality2() {
        Assert.assertEquals(0, commonProductCalculator.calculateCommonProductQuality(2, 0, 1));
    }

    @Test
    public void testCalculateCommonProductQuality3() {
        Assert.assertEquals(5, commonProductCalculator.calculateCommonProductQuality(3, 6, 2));
    }

    @Test
    public void testCalculateCommonProductQuality4() {
        Assert.assertEquals(4, commonProductCalculator.calculateCommonProductQuality(0, 6, -1));
    }

    @Test
    public void testCalculateCommonProductQuality5() {
        Assert.assertEquals(4, commonProductCalculator.calculateCommonProductQuality(-1, 6, -2));
    }

}
