package com.EJaswanthReddy.ConstructionPriceEstimator;

public class CostCalculator {
	private double returnCost(String materialStandard, double areaOfHouse, boolean automated) {
		double cost=0;
		if(materialStandard.equals("Standard")) {
			cost = 1200 * areaOfHouse;
		}
		else if(materialStandard.equals("aboveStandard")) {
			cost = 1500 * areaOfHouse;
		}
		else if(automated && materialStandard.equals("highStandard")) {
			cost = 2500 * areaOfHouse;
		}
		else {
			cost = 1800 * areaOfHouse;
		}
		return cost;
	}
	public double getCost(String materialStandard, double areaOfHouse, boolean automated) {
		return returnCost(materialStandard,areaOfHouse,automated);
	}
}
