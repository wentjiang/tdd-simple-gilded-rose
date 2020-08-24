package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductCalculatorTest {

    private ProductCalculator productCalculator;

    @Before
    public void init() {
        productCalculator = new ProductCalculator();
    }

    @Test
    public void testCalculateCommonProductQuality1() {
        Assert.assertEquals(19, productCalculator.calculateCommonProductQuality(10, 20, 9));
    }

    @Test
    public void testCalculateCommonProductQuality2() {
        Assert.assertEquals(0, productCalculator.calculateCommonProductQuality(2, 0, 1));
    }

    @Test
    public void testCalculateCommonProductQuality3() {
        Assert.assertEquals(5, productCalculator.calculateCommonProductQuality(3, 6, 2));
    }

    @Test
    public void testCalculateCommonProductQuality4() {
        Assert.assertEquals(4, productCalculator.calculateCommonProductQuality(0, 6, -1));
    }

    @Test
    public void testCalculateCommonProductQuality5() {
        Assert.assertEquals(4, productCalculator.calculateCommonProductQuality(-1, 6, -2));
    }

//    @Test
    public void testCalculateBackstagePassQuality() {
        Assert.assertEquals(21, productCalculator.calculateBackstagePassQuality(15, 20, 14));
        Assert.assertEquals(47, productCalculator.calculateBackstagePassQuality(10, 45, 9));
        Assert.assertEquals(47, productCalculator.calculateBackstagePassQuality(9, 45, 8));
        Assert.assertEquals(50, productCalculator.calculateBackstagePassQuality(10, 49, 9));
        Assert.assertEquals(50, productCalculator.calculateBackstagePassQuality(10, 50, 9));
        Assert.assertEquals(50, productCalculator.calculateBackstagePassQuality(5, 49, 4));
        Assert.assertEquals(48, productCalculator.calculateBackstagePassQuality(5, 45, 4));
        Assert.assertEquals(23, productCalculator.calculateBackstagePassQuality(1, 20, 0));
        Assert.assertEquals(0, productCalculator.calculateBackstagePassQuality(0, 20, -1));
    }
}
