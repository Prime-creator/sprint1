package com.capgem.clientui;

import java.util.ArrayList;
import com.capgem.service.*;
import com.capgem.bean.RawMaterialOrder;

public class ClientInterface {
	
	public static void main(String[] args) {
		RawMaterialOrder rc=ServiceClass.click();
		ServiceClass.placeRawMaterialOrder(rc);
		System.out.println("details of order you just placed -> "+rc.getName()+" "+rc.getSupplierId()+" "+rc.getWarehouseId()+" "+rc.getDateOfOrder());
		System.out.println("expected date = "+rc.getDateOfDelivery());
		ServiceClass.SetPrice(rc);
		System.out.println("your order price = "+ServiceClass.GetPrice(rc));
		if(ServiceClass.isOrderPlaced(rc)) {
			System.out.println("Raw Material Order is placed successfully.");
		}		
		ArrayList<RawMaterialOrder> PlacedOrder = new ArrayList<RawMaterialOrder>();
		PlacedOrder.add(rc);
	}
	
	
}
