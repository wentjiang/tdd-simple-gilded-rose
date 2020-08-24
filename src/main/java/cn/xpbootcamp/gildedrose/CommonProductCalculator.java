package cn.xpbootcamp.gildedrose;

public class CommonProductCalculator {
    public static final int MAX_QUALITY = 50;
    public static final int MIN_QUALITY = 0;

    public static final int COMMON_PRODUCT_REDUCE_EVERY_DAY = 1;
    public static final int COMMON_PRODUCT_DOUBLE_REDUCE_EVERY_DAY = COMMON_PRODUCT_REDUCE_EVERY_DAY * 2;

    public int calculateCommonProductQuality(int sellIn, int quality, int updatedSellIn) {
        int updatedQuality;
        int after_days = sellIn - updatedSellIn;
        if (sellIn > 0) {
            //当前保质期大于0的情况
            if (sellIn - after_days > 0) {
                int need_reduce_quality = after_days * COMMON_PRODUCT_REDUCE_EVERY_DAY;
                updatedQuality = quality - need_reduce_quality;
            } else {
                int need_reduce_quality = sellIn * COMMON_PRODUCT_REDUCE_EVERY_DAY + Math.abs(sellIn - after_days) * COMMON_PRODUCT_DOUBLE_REDUCE_EVERY_DAY;
                updatedQuality = quality - need_reduce_quality;
            }
        } else {
            //当前保质期小于0的情况
            if (sellIn - after_days > 0) {
                int need_reduce_quality = -sellIn * COMMON_PRODUCT_DOUBLE_REDUCE_EVERY_DAY - Math.abs(sellIn - after_days) * COMMON_PRODUCT_REDUCE_EVERY_DAY;
                updatedQuality = quality - need_reduce_quality;
            } else {
                int need_reduce_quality = after_days * COMMON_PRODUCT_DOUBLE_REDUCE_EVERY_DAY;
                updatedQuality = quality - need_reduce_quality;
            }
        }
        return Math.min(Math.max(MIN_QUALITY, updatedQuality), MAX_QUALITY);
    }



}
