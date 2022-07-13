package gildedrose.item;

import gildedrose.terminal.ItemUpdate;

// Here java abstraction concept achieve
public class ItemUtility implements ItemUpdate{

	public Item item;

	public ItemUtility(String name, int sell_in, int quality) {
		this.item = new Item(name, sell_in, quality);
	}

	@Override
	public String toString() {
		return item.toString();
	}

	public Item getItem() {
		return this.item;
	}

	public String getName() {
		return item.getName();
	}

	public int getSell_in() {
		return item.getSell_in();
	}

	public void setSell_in() {
		item.setSell_in();
	}

	public int getQuality() {
		return item.getQuality();
	}

	@Override
	public void updateQuality() {

		if (getSell_in() > 0) {
			computeQuality(-1);
		} else {
			computeQuality(-2);
		}
		setSell_in();
	}

	public void computeQuality(int value) {

		if (getQuality() + value > 50) {
			item.setQuality(50);
		} else if (getQuality() + value >= 0) {
			item.setQuality(getQuality() + value);
		} else {
			item.setQuality(0);
		}
	}

}
