package ueb6.gildedRose.refactored;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GildedRose {
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String CONJURED = "Conjured";

    private final ItemUpdateRule defaultRule = new ItemUpdateRule();

    private List<Item> items;

    private final Map<String, ItemUpdateRule> specialRules;

    public GildedRose(List<Item> items) {
        this.items = items;

        specialRules = new HashMap<>();
        specialRules.put(AGED_BRIE, new ItemUpdateRule(1, 0, 0, 50));
        specialRules.put(SULFURAS, new ItemUpdateRule(0, 0, 80, 80));
        specialRules.put(BACKSTAGE_PASSES, new BackstagePassRule());
        specialRules.put(CONJURED, new ConjuredRule());
    }

    public void updateQuality() {
        for (Item item : items) {
            updateItem(item);
        }
    }

    private void updateItem(Item itemToUpdate) {
        ItemUpdateRule rule = specialRules.getOrDefault(itemToUpdate.name, defaultRule);
        rule.updateItem(itemToUpdate);
    }
}

