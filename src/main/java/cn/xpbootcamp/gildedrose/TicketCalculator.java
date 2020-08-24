package cn.xpbootcamp.gildedrose;

public class TicketCalculator {

    public static final int MAX_QUALITY = 50;
    public static final int MIN_QUALITY = 0;

    public static final int LESS_5_EVERY_DAY_ADD = 3;
    public static final int LESS_10_EVERY_DAY_ADD = 2;
    public static final int COMMON_EVERY_DAY_ADD = 1;

    public int calculateBackstagePassQuality(int sellIn, int quality, int updatedSellIn) {
        int updatedQuality = 0;
        int days = sellIn - updatedSellIn;
        if (sellIn <= 0) {
            //初始天数为负的情况,无法计算其他值
            return 0;
        } else if (sellIn <= 5) {
            //当前天数在5以内的时候
            if (days <= 5) {

                updatedQuality = quality + days * LESS_5_EVERY_DAY_ADD;
            } else if (days <= 10) {
//                updatedQuality = quality - 5 *
            }
        } else if (sellIn <= 10) {

        }
        return Math.min(Math.max(MIN_QUALITY, updatedQuality), MAX_QUALITY);
    }
}
