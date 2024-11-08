package ueb6.gildedRose.refactored;

class ItemUpdateRule {
    private int qualityChangePerDay;
    private int sellInChangePerDay;
    private int minQuality;
    private int maxQuality;

    public ItemUpdateRule() {
        this(0, -1, 0, 50);
    }

    public ItemUpdateRule(int qualityChangePerDay, int sellInChangePerDay, int minQuality, int maxQuality) {
        this.qualityChangePerDay = qualityChangePerDay;
        this.sellInChangePerDay = sellInChangePerDay;
        this.minQuality = minQuality;
        this.maxQuality = maxQuality;
    }

    public void updateItem(Item item) {
        item.sellIn += sellInChangePerDay;
        updateQuality(item, qualityChangePerDay);
    }

    protected void updateQuality(Item item, int qualityChange) {
        item.quality = Math.max(minQuality, Math.min(maxQuality, item.quality + qualityChange));
    }
}
