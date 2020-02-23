package com.capgem.bean;

import java.util.Date; 

public class RawMaterialOrder{
	String orderId;
	String name;
	String supplierId  = "123";
	private double quantityValue = 1;
	double quantityUnit = 1;  
	private Date date = new Date();  
	public Date dateOfOrder = date;
	Date dateOfDelivery;
	double pricePerUnit;
	double totalPrice;
	String deliveryStatus;
	String warehouseId;
	public RawMaterialOrder() {
		super();
	}
	public RawMaterialOrder(String name, String supplierId, double quantityValue, Date dateOfOrder,String warehouseId) {
		super();
		this.name = name;
		this.supplierId = supplierId;
		this.quantityValue = quantityValue;
		this.dateOfOrder = dateOfOrder;
		this.warehouseId = warehouseId;
	}

	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public double getQuantityValue() {
		return quantityValue;
	}
	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}
	public double getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(double quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public Date getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public Date getDateOfDelivery() {
		return dateOfDelivery;
	}
	public void setDateOfDelivery(Date dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public String getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}
}
