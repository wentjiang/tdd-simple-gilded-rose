package cn.xpbootcamp.gildedrose;

public class TicketCalculator {

    public static final int MAX_QUALITY = 50;
    public static final int MIN_QUALITY = 0;

    public static final int LESS_5_EVERY_DAY_ADD = 3;
    public static final int LESS_10_EVERY_DAY_ADD = 2;
    public static final int COMMON_EVERY_DAY_ADD = 1;

    public static final int DAY_SPLIT_0 = 0;
    public static final int DAY_SPLIT_5 = 5;
    public static final int DAY_SPLIT_10 = 10;

    public int calculateBackstagePassQuality(int sellIn, int quality, int updatedSellIn) {
        int updatedQuality = 0;
        int afterDays = sellIn - updatedSellIn;
        int afterUpdateSellIn = sellIn - afterDays;
        if (sellIn <= DAY_SPLIT_0) {
            //初始天数为负的情况,无法计算其他值

            updatedQuality = MIN_QUALITY;
        } else if (sellIn <= DAY_SPLIT_5) {
            //当前天数在5以内的时候
            if (afterUpdateSellIn <= DAY_SPLIT_0) {
                updatedQuality = MIN_QUALITY;
            } else if (afterUpdateSellIn <= DAY_SPLIT_5) {
                int needIncreaseQuality = afterDays * LESS_5_EVERY_DAY_ADD;
                updatedQuality = quality + needIncreaseQuality;
            } else if (afterUpdateSellIn <= DAY_SPLIT_10) {
                int needIncreaseQuality = -(DAY_SPLIT_5 - sellIn) * LESS_5_EVERY_DAY_ADD - (sellIn - updatedSellIn - DAY_SPLIT_5) * LESS_10_EVERY_DAY_ADD;
                updatedQuality = quality + needIncreaseQuality;
            } else {
                int needIncreaseQuality = -(DAY_SPLIT_5 - sellIn) * LESS_5_EVERY_DAY_ADD - (DAY_SPLIT_10 - DAY_SPLIT_5) * LESS_10_EVERY_DAY_ADD - (sellIn - updatedSellIn - DAY_SPLIT_10) * COMMON_EVERY_DAY_ADD;
                updatedQuality = quality + needIncreaseQuality;
            }
        } else if (sellIn <= 10) {

        }
        return Math.min(Math.max(MIN_QUALITY, updatedQuality), MAX_QUALITY);
    }
}
