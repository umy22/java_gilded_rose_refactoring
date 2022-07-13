package gildedrose.test.product;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import gildedrose.product.AgedBrie;

// Created JUnit test cases under Single Responsibility Principle
public class AgedBrieTest {

    @Test 
    public void the_case_of_aged_brie_whose_quality_increases_as_older_it_gets() {

        AgedBrie cheese = new AgedBrie("Aged Brie", 2, 0);
        assertEquals("Aged Brie", cheese.getName());
        assertEquals(2, cheese.getSell_in(), 0);
        assertEquals(0, cheese.getQuality(), 0);
    }
    
    @Test
    public void toStringTest() {
        AgedBrie cheese = new AgedBrie("Aged Brie", 2, 0);
        System.out.println("toString() Aged Brie test:");
        System.out.println(cheese.toString());
    }

    @Test
    public void updateQualityBrie() {

        AgedBrie cheese = new AgedBrie("Aged Brie", 2, 0);
        cheese.updateQuality();
        assertEquals(1, cheese.getSell_in(), 0);
        assertEquals(1, cheese.getQuality(), 0);
    }

    @Test
    public void updateQualityBrieExpired() {

        AgedBrie cheese = new AgedBrie("Aged Brie", 0, 0);
        cheese.updateQuality();
        assertEquals(-1, cheese.getSell_in(), 0);
        assertEquals(2, cheese.getQuality(), 0);    
    }

    @Test
    public void the_quality_of_an_item_is_never_more_than_50() {

        AgedBrie brie = new AgedBrie("Aged Brie", -1, 50);
        brie.updateQuality();
        assertEquals(-2, brie.getSell_in(), 0);
        assertEquals(50, brie.getQuality(), 0);

        brie = new AgedBrie("Aged Brie", -1, 49);
        brie.updateQuality();
        assertEquals(-2, brie.getSell_in(), 0);
        assertEquals(50, brie.getQuality(), 0);
    }
}
