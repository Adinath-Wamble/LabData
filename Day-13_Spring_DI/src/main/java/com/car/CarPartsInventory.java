package com.car;

import java.util.List;

public interface CarPartsInventory {
	public void addNewCarPart(CarPart carParts);
	public List<CarPart> getAvalibleParts();
}
