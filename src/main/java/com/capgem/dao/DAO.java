package com.capgem.dao;

import com.capgem.database.*;

import java.util.ArrayList;
import java.util.List;

import com.capgem.bean.RawMaterialOrder;

public class DAO {
	public static List getRawMaterialList(){
		return new ArrayList<>();
	}
	public static List getWarehouseList(){
		return new ArrayList<>();
	}
	public static List getSupplierList(){
		return new ArrayList<>();
	}
	public static List getPricePerUnitList(){
		return new ArrayList<>();
	}
	public static void save(RawMaterialOrder a) {
		DataBase.list.add(a);
	}
}
