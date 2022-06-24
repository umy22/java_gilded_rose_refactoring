package gildedrose.product;

import gildedrose.item.ItemUtility;

public class Sulfuras extends ItemUtility {

    public Sulfuras(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality() {};
}