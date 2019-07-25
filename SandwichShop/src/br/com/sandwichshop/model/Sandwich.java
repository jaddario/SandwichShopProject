package br.com.sandwichshop.model;

import br.com.sandwichshop.enums.Spicyness;
import br.com.sandwichshop.interfaces.PurchasedItem;

public class Sandwich implements PurchasedItem{

	public static double costOfCondiment;
	public static double pricePerCondiment;
	private String customerName;
	private double materialCost;
	private double salesPrices;
	private int deliveryTime;
	private Spicyness spiceLevel;
	private int numCondiments;
	
	public Sandwich(String customerName, double materialCost, double salesPrices) {
		this.customerName = customerName;
		this.materialCost = materialCost;
		this.salesPrices = salesPrices;
	}

	public Sandwich(String customerName, double materialCost, double salesPrices, int deliveryTime,
			Spicyness spiceLevel, int numCondiments) {
		this.customerName = customerName;
		this.materialCost = materialCost;
		this.salesPrices = salesPrices;
		this.deliveryTime = deliveryTime;
		this.spiceLevel = spiceLevel;
		this.numCondiments = numCondiments;
	}

	public Sandwich(String customerName, double materialCost) {
		this.customerName = customerName;
		this.materialCost = materialCost;
	}

	@Override
	public boolean isDelivery() {
		return false;
	}

	@Override
	public String getCustomerName() {
		return customerName;
	}

	@Override
	public int getDeliveryTime() {
		return deliveryTime;
	}

	@Override
	public void setDeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
		
	}

	@Override
	public double getMaterialCost() {
		return materialCost;
	}

	@Override
	public double getSalePrice() {
		return salesPrices;
	}

	public Spicyness getSpiceLevel() {
		return spiceLevel;
	}

	public void setSpiceLevel(Spicyness spiceLevel) {
		this.spiceLevel = spiceLevel;
	}

	public int getNumCondiments() {
		return numCondiments;
	}

	public void setNumCondiments(int numCondiments) {
		this.numCondiments = numCondiments;
	}
}
