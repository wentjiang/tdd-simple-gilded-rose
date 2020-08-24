package cn.xpbootcamp.gildedrose;

/**
 * @author wentao.jiang
 */
public class TicketCalculator {

    public static final int MAX_QUALITY = 50;
    public static final int MIN_QUALITY = 0;

    public static final int LESS_5_EVERY_DAY_ADD = 3;
    public static final int LESS_10_EVERY_DAY_ADD = 2;
    public static final int MORE_10_EVERY_DAY_ADD = 1;

    public static final int DAY_SPLIT_0 = 0;
    public static final int DAY_SPLIT_5 = 5;
    public static final int DAY_SPLIT_10 = 10;

    public int calculateBackstagePassQuality(int sellIn, int quality, int updatedSellIn) {

        int updatedQuality = 0;
        int afterDays = sellIn - updatedSellIn;
        //更新后的时间具体过期的天数
        int afterUpdateSellIn = sellIn - afterDays;
        if (sellIn <= DAY_SPLIT_0 || afterUpdateSellIn < DAY_SPLIT_0) {
            //初始天数为负的情况,无法计算其他值
            updatedQuality = MIN_QUALITY;
        } else if (sellIn <= DAY_SPLIT_5) {
            //当前天数在5以内的时候
            if (afterUpdateSellIn <= DAY_SPLIT_5) {
                int needIncreaseQuality = afterDays * LESS_5_EVERY_DAY_ADD;
                updatedQuality = quality + needIncreaseQuality;
            }
        } else if (sellIn <= DAY_SPLIT_10) {
            //当前天数在5以内的时候
            if (afterUpdateSellIn <= DAY_SPLIT_5) {
                int needIncreaseQuality = (DAY_SPLIT_5 - updatedSellIn) * LESS_5_EVERY_DAY_ADD + (sellIn - DAY_SPLIT_5) * LESS_10_EVERY_DAY_ADD;
                updatedQuality = quality + needIncreaseQuality;
            } else if (afterUpdateSellIn <= DAY_SPLIT_10) {
                int needIncreaseQuality = (sellIn - updatedSellIn) * LESS_10_EVERY_DAY_ADD;
                updatedQuality = quality + needIncreaseQuality;
            }
        } else {
            //当前天数在5以内的时候
            if (afterUpdateSellIn <= DAY_SPLIT_5) {
                int needIncreaseQuality = (sellIn - updatedSellIn) * MORE_10_EVERY_DAY_ADD
                        + (DAY_SPLIT_10 - DAY_SPLIT_5) * LESS_10_EVERY_DAY_ADD + (DAY_SPLIT_5 - afterUpdateSellIn) * LESS_5_EVERY_DAY_ADD;
                updatedQuality = quality + needIncreaseQuality;
            } else if (afterUpdateSellIn <= DAY_SPLIT_10) {
                int needIncreaseQuality = (sellIn - updatedSellIn) * MORE_10_EVERY_DAY_ADD + (DAY_SPLIT_10 - afterUpdateSellIn) * LESS_10_EVERY_DAY_ADD;
                updatedQuality = quality + needIncreaseQuality;
            } else {
                int needIncreaseQuality = (sellIn - afterUpdateSellIn) * MORE_10_EVERY_DAY_ADD;
                updatedQuality = quality + needIncreaseQuality;
            }
        }
        return Math.min(Math.max(MIN_QUALITY, updatedQuality), MAX_QUALITY);
    }
}
