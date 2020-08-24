package cn.xpbootcamp.gildedrose;

public class ProductCalculator {
    public static int calculateCommonProductQuality(int sellIn, int quality, int updatedSellIn) {
        int updatedQuality = 0;
        int n;
        if (sellIn > 0) {
            n = sellIn - updatedSellIn;
            if (n > 0) {
                updatedQuality = quality - (n);
            } else {
                updatedQuality = quality - Math.abs(n * 2);
            }
        } else {
            n = sellIn - updatedSellIn;
            if (n > 0) {
                updatedQuality = quality - 2 * n;
            } else {
                updatedQuality = quality - Math.abs(n * 2);
            }
        }
        return Math.min(Math.max(0, updatedQuality), 50);
    }

    public static int calculateBackstagePassQuality(int sellIn, int quality, int updatedSellIn) {
        int updatedQuality = 0;
        return updatedQuality;
    }

}
