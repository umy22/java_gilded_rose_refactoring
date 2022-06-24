package gildedrose.product;

import gildedrose.item.ItemUtility;

public class Conjured extends ItemUtility {

    public Conjured(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality() {

        if (getSell_in() > 0) {
            computeQuality(-2);
        } else {
            computeQuality(-4);
        }
        setSell_in();
    }
}