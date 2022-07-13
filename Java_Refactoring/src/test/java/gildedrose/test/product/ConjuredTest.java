package gildedrose.test.product;

import static org.junit.Assert.*;
import org.junit.Test;

import gildedrose.product.Conjured;

public class ConjuredTest {

    @Test
    public void crearConjured() {

        Conjured conjured = new Conjured("Conjured Mana Cake", 3, 6);
        assertEquals("Conjured Mana Cake", conjured.getName());
        assertEquals(3, conjured.getSell_in(), 0);
        assertEquals(6, conjured.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
        Conjured conjured = new Conjured("Conjured Mana Cake", 3, 6);
        System.out.println("toString() Conjured test:");
        System.out.println(conjured.toString());
    }

    @Test
    public void updateQualityConjured() {

        Conjured conjured = new Conjured("Conjured Mana Cake", 3, 6);
        conjured.updateQuality();
        assertEquals(2, conjured.getSell_in(), 0);
        assertEquals(4, conjured.getQuality(), 0);
    }

    @Test
    public void updateQualityConjuredJustExpired() {

        Conjured conjured = new Conjured("Conjured Mana Cake", 0, 6);
        conjured.updateQuality();
        assertEquals(-1, conjured.getSell_in(), 0);
        assertEquals(2, conjured.getQuality(), 0);    
    }

    @Test
    public void updateQualityConjuredExpired() {

        Conjured conjured = new Conjured("Conjured Mana Cake", -1, 6);
        conjured.updateQuality();
        assertEquals(-2, conjured.getSell_in(), 0);
        assertEquals(2, conjured.getQuality(), 0);
    }

    @Test
    public void the_quality_of_an_item_is_never_less_than_50() {

        Conjured brie = new Conjured("Conjured Mana Cake", 1, 1);
        brie.updateQuality();
        assertEquals(0, brie.getSell_in(), 0);
        assertEquals(0, brie.getQuality(), 0);

        brie = new Conjured("Conjured Mana Cake", -1, 0);
        brie.updateQuality();
        assertEquals(-2, brie.getSell_in(), 0);
        assertEquals(0, brie.getQuality(), 0);
    }
}
