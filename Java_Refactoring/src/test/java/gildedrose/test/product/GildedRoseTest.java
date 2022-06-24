package gildedrose.test.product;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import gildedrose.item.ItemUtility;
import gildedrose.product.AgedBrie;
import gildedrose.utility.GildedRoseKataUtility;



public class GildedRoseTest {

    private GildedRoseKataUtility gildedRoseKataUty = null;
    private ItemUtility itemIUty = null;
    private AgedBrie brie = null;

    @Before
    public void setupInventario() {
       gildedRoseKataUty = new GildedRoseKataUtility();
       itemIUty = new ItemUtility("+5 Dexterity Vest", 10, 20);
       brie = new AgedBrie("Aged Brie", 2, 0);
    }

    @Test
    public void toStringTest() {
    	gildedRoseKataUty.addItem(brie);
        brie = new AgedBrie("Aged Brie", 10, 10);
        gildedRoseKataUty.addItem(brie);
        System.out.println("toString() GildedRose test:");
        System.out.println(gildedRoseKataUty.toString());
    }

    @Test
    public void addItemTest() {
    	gildedRoseKataUty.addItem(itemIUty);
    	gildedRoseKataUty.addItem(brie);
        assertEquals(2, gildedRoseKataUty.itemLst().size(), 0);
        List<ItemUtility> items = new ArrayList<ItemUtility>();  //List.of(itemIUty, brie);
        items.add(itemIUty);
        items.add(brie);
        Collections.unmodifiableList(items);
        assertArrayEquals(items.toArray(), gildedRoseKataUty.itemLst().toArray());

        System.out.println("GildedRose addItem test:");
        System.out.println(gildedRoseKataUty.toString());
    }

    @Test
    public void updateQuality() {
    	gildedRoseKataUty.addItem(itemIUty);
    	gildedRoseKataUty.addItem(brie);
        assertEquals(2, gildedRoseKataUty.itemLst().size(), 0);
        System.out.println("Dia 0:" + '\n' + gildedRoseKataUty.toString());
        gildedRoseKataUty.updateQuality();

        ItemUtility item = (ItemUtility) gildedRoseKataUty.itemLst().get(0);
        assertEquals(19, item.getQuality(), 0);
        assertEquals(1, ((ItemUtility) (gildedRoseKataUty.itemLst().get(1))).getQuality(), 0);
        System.out.println("Dia 1:" + '\n' + gildedRoseKataUty.toString());
    }
}
