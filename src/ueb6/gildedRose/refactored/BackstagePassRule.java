package ueb6.gildedRose.refactored;

class BackstagePassRule extends ItemUpdateRule {
    @Override
    public void updateItem(Item item) {
        if (item.sellIn > 10) {
            updateQuality(item, 1);
        } else if (item.sellIn > 5) {
            updateQuality(item, 2);
        } else if (item.sellIn > 0) {
            updateQuality(item, 3);
        } else {
            item.quality = 0;
        }
        item.sellIn--;
    }
}
