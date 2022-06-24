package gildedrose.driver;

import java.util.ArrayList;
import java.util.List;

import gildedrose.item.ItemUtility;
import gildedrose.product.AgedBrie;
import gildedrose.product.Backstage;
import gildedrose.product.Conjured;
import gildedrose.product.Sulfuras;
import gildedrose.terminal.ItemUpdate;
import gildedrose.utility.GildedRoseKataUtility;

public class DriverProgram {

	public static void main(String args[]) {

		GildedRoseKataUtility gildedRoseKataUty = new GildedRoseKataUtility();

		List<ItemUpdate> items = new ArrayList<ItemUpdate>();
		items.add((ItemUpdate) new ItemUtility("+5 Dexterity Vest", 10, 20));
		items.add((ItemUpdate) new AgedBrie("Aged Brie", 2, 0));
		items.add((ItemUpdate) new ItemUtility("Elixir of the Mongoose", 5, 7));
		items.add((ItemUpdate) new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80));
		items.add((ItemUpdate) new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80));
		items.add((ItemUpdate) new Backstage("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		items.add((ItemUpdate) new Backstage("Backstage passes to a TAFKAL80ETC concert", 10, 49));
		items.add((ItemUpdate) new Backstage("Backstage passes to a TAFKAL80ETC concert", 5, 49));

		for (ItemUpdate item : items) {
			gildedRoseKataUty.addItem(item);
		}

		System.out.println("\t ----  DAY 1 ----");
		System.out.println(gildedRoseKataUty.toString());

		gildedRoseKataUty.updateQuality();
		System.out.println("\t ----  DAY 2 ----");
		System.out.println(gildedRoseKataUty.toString());

		gildedRoseKataUty.addItem(new Conjured("Conjured Mana Cake", 3, 6));
		System.out.println("\t ----  New item conjured added ----");
		System.out.println(gildedRoseKataUty.toString());
	}
}
