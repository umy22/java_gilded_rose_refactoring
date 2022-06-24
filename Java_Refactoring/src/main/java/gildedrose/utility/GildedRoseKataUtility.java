package gildedrose.utility;

import java.util.ArrayList;
import java.util.List;

import gildedrose.terminal.ItemUpdate;


public class GildedRoseKataUtility {

	private List<ItemUpdate> itemLst = new ArrayList<ItemUpdate>();
	   
    public List<ItemUpdate> itemLst() {
        return this.itemLst;
    }

    public void addItem(ItemUpdate item) {
    	itemLst().add(item);
    }

    public void updateQuality() {
        for (ItemUpdate item : itemLst()) {
            item.updateQuality();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ItemUpdate item : itemLst()) {
            sb.append(item.toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
