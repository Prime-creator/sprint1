package com.capgem.controller;

import java.util.List;
import com.capgem.dao.*;

public class ControllerImpl {
	public static List fetchListOfRawMaterials() {
		return DAO.getRawMaterialList();
	}
	public static List fetchWarehouseMaterials() {
		return DAO.getRawMaterialList();
	}
	public static List fetchSupplierid() {
		return DAO.getRawMaterialList();
	}
	public static List fetchPricePerUnit() {
		return DAO.getRawMaterialList();
	}
}
