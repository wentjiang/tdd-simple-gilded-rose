package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TicketCalculatorTest {


    private TicketCalculator ticketCalculator;

    @Before
    public void init() {
        ticketCalculator = new TicketCalculator();
    }

    @Test
    public void testCalculateBackstagePassQuality1() {
        Assert.assertEquals(21, ticketCalculator.calculateBackstagePassQuality(15, 20, 14));
    }

    @Test
    public void testCalculateBackstagePassQuality2() {
        Assert.assertEquals(47, ticketCalculator.calculateBackstagePassQuality(10, 45, 9));
    }

    @Test
    public void testCalculateBackstagePassQuality4() {
        Assert.assertEquals(47, ticketCalculator.calculateBackstagePassQuality(9, 45, 8));
    }

    @Test
    public void testCalculateBackstagePassQuality5() {
        Assert.assertEquals(50, ticketCalculator.calculateBackstagePassQuality(10, 49, 9));
    }

    @Test
    public void testCalculateBackstagePassQuality6() {
        Assert.assertEquals(50, ticketCalculator.calculateBackstagePassQuality(10, 50, 9));
    }

    @Test
    public void testCalculateBackstagePassQuality7() {
        Assert.assertEquals(50, ticketCalculator.calculateBackstagePassQuality(5, 49, 4));
    }

    @Test
    public void testCalculateBackstagePassQuality8() {
        Assert.assertEquals(48, ticketCalculator.calculateBackstagePassQuality(5, 45, 4));
    }

    @Test
    public void testCalculateBackstagePassQuality9() {
        Assert.assertEquals(23, ticketCalculator.calculateBackstagePassQuality(1, 20, 0));
    }

    @Test
    public void testCalculateBackstagePassQuality10() {
        Assert.assertEquals(0, ticketCalculator.calculateBackstagePassQuality(0, 20, -1));
    }
}
