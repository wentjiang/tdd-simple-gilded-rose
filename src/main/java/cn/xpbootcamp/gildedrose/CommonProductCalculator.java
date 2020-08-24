package cn.xpbootcamp.gildedrose;

public class CommonProductCalculator {
    public static final int MAX_QUALITY = 50;
    public static final int MIN_QUALITY = 0;

    public static final int COMMON_PRODUCT_REDUCE_EVERY_DAY = 1;
    public static final int COMMON_PRODUCT_DOUBLE_REDUCE_EVERY_DAY = COMMON_PRODUCT_REDUCE_EVERY_DAY * 2;

    public int calculateCommonProductQuality(int sellIn, int quality, int updatedSellIn) {
        int commonQuality = getProductSellInQuality(sellIn, quality);
        int updatedQuality;
        int after_days = sellIn - updatedSellIn;
        int afterUpdateSellIn = sellIn - after_days;
        if (afterUpdateSellIn > 0) {
            updatedQuality = commonQuality + afterUpdateSellIn * COMMON_PRODUCT_REDUCE_EVERY_DAY;
        } else {
            updatedQuality = commonQuality + afterUpdateSellIn * COMMON_PRODUCT_DOUBLE_REDUCE_EVERY_DAY;
        }
        return Math.min(Math.max(MIN_QUALITY, updatedQuality), MAX_QUALITY);
    }

    /**
     * 获取商品到保质期的quality
     *
     * @return 到保质期的quality
     */
    public int getProductSellInQuality(int sellIn, int quality) {
        if (sellIn > 0) {
            return quality - (sellIn * COMMON_PRODUCT_REDUCE_EVERY_DAY);
        } else {
            return quality + Math.abs(sellIn) * COMMON_PRODUCT_REDUCE_EVERY_DAY * 2;
        }
    }

}
