package com.capgem.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.capgem.bean.RawMaterialOrder;
import com.capgem.controller.ControllerImpl;
import com.capgem.dao.DAO;

public class ServiceClass {
	static RawMaterialOrder r = new RawMaterialOrder();
	static Date date=new Date();
	static double quant = 1;
	static String str;
	
	List rawList=ControllerImpl.fetchListOfRawMaterials();
	List supplierList=ControllerImpl.fetchSupplierid();
	List warehouseList=ControllerImpl.fetchWarehouseMaterials();
	List PricePerUnitList=ControllerImpl.fetchPricePerUnit();
	
	public static void placeRawMaterialOrder(RawMaterialOrder r) {
		DAO.save(r);
	}
	
	public static RawMaterialOrder click() {
		System.out.println("enter the choice");
		System.out.println("1	Raw Material Name");
		System.out.println("1.1 milk");
		System.out.println("1.2 choclate");
		System.out.println("1.3 coffee");
		System.out.println("2	Supplier ID");
		System.out.println("123");
		System.out.println("456");
		System.out.println("3	Warehouse ID");
		System.out.println("865");
		System.out.println("875");
		System.out.println("4	Quantity value and unit");
		System.out.println("5	Price per Unit");
		System.out.println("5.1	Price per Unit milk = 20/unit");
		System.out.println("5.2	Price per Unit choclate = 30/unit");
		System.out.println("5.3	Price per Unit of coofee = 40/unit");
		System.out.println("6	Expected Date of delivery");
		Scanner s = new Scanner(System.in);
		Integer choice = 1;
		String Supplier, warehouse;
		System.out.println("enter the raw material number");
		choice = s.nextInt();
		System.out.println("enter supp ID");
		Supplier = s.next();
		System.out.println("enter warehouse ID");
		warehouse = s.next();
		System.out.println("enter quantity of raw material");
		str = choice.toString();
		quant = s.nextDouble();
		//r = new RawMaterialOrder(str,Supplier,quant,date,warehouse);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR, 2);
		Date dt = cal.getTime();
		r.setDateOfDelivery(dt);
		r.setName(str);
		r.setSupplierId(Supplier);
		r.setQuantityValue(quant);
		r.setDateOfOrder(date);
		r.setWarehouseId(warehouse);
		
		if(choice == 1) {
			r.setPricePerUnit(20);
		}
		if(choice == 2) {
			r.setPricePerUnit(30);
		}
		if(choice == 3) {
			r.setPricePerUnit(40);
		}
		return r;
	}
	
	
	public static void SetPrice(RawMaterialOrder ra) {
		double num = 0;
		num = ra.getQuantityValue()*ra.getPricePerUnit();
		r.setTotalPrice(num);
		
	}
	
	
	public static double GetPrice(RawMaterialOrder ra) {
		return ra.getTotalPrice();
	}
	
	
	public static Boolean isOrderPlaced(RawMaterialOrder r) {
		if(r.getName() == null || r.getSupplierId() == null || r.getWarehouseId() == null || r.getPricePerUnit() == 0 || r.getQuantityValue() == 0) {
			return false;
		}
		return true;
	}
}
