package gildedrose.item;

public class Item {

	private final String name;
	private int sell_in = 0;
	private int quality = 0;

    String getName() {
        return this.name;
    }

    int getSell_in() {
        return this.sell_in;
    }

    void setSell_in() {
        this.sell_in = this.getSell_in() - 1;
    }

    int getQuality() {
        return this.quality;
    }

    public void setQuality(int value) {
        this.quality = value;
    }
    
	Item(String name, int sell_in, int quality) {
		this.name = name;
		this.sell_in = sell_in;
		this.quality = quality;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Item Name=" + getName());
		sb.append(", sell_in=" + getSell_in());
		sb.append(", quality=" + getQuality());
		return sb.toString();
	}

}
