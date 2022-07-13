package gildedrose.product;

import gildedrose.item.ItemUtility;

// AgedBrie.java - Created as Single Responsibility Principle
public class AgedBrie extends ItemUtility {
// While extends ItemUtility we achieve Inheritance concept
    public AgedBrie(String name, int sell_in, int quality) {
        super(name, sell_in, quality);			// Here using - Liskov’s Substitution Principle
    }

    @Override
    public void updateQuality() {

        if (getSell_in() > 0) {
            computeQuality(1);
        } else {
            computeQuality(2);
        }
        setSell_in();
    }
}