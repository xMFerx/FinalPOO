package model;
/**
 * Clase de los productos 
 * 	 
 */

public class Products {
	private int id;
	private String name;
	private float price;
	private int QtStored;
	private int QtSold;
	private float profit;
	private int discount;
	
	public Products() {
		QtStored = 0;
		QtSold = 0;
		profit = 0;
		discount = 0;
	}

    /**
     *
     * @return
     */
    public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQtStored() {
		return QtStored;
	}

	public void setQtStored(int qtStored) {
		QtStored = qtStored;
	}

	public int getQtSold() {
		return QtSold;
	}

	public void setQtSold(int qtSold) {
		QtSold = qtSold;
	}

    /**
     *
     * @return
     */
    public float getProfit() {
		return profit;
	}

	public void setProfit(float profit) {
		this.profit = profit;
	}
	
}
