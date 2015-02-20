package edu.ncsu.monopoly;


public class SimpleGameBoard extends GameBoard {
	public SimpleGameBoard() {
		super();
		PropertyCell blue1 = new PropertyCell();
		PropertyCell blue2 = new PropertyCell();
		PropertyCell blue3 = new PropertyCell();
		PropertyCell green1 = new PropertyCell();
		PropertyCell green2 = new PropertyCell();
		
		setNames(blue1, blue2, blue3, green1, green2);
		
		setColourGroups(blue1, blue2, blue3, green1, green2);
		
		setPrices(blue1, blue2, blue3, green1, green2);
		
		setRents(blue1, blue2, blue3, green1, green2);
		
		setHousePrices(blue1, blue2, blue3, green1, green2);
		
		addAllCells(blue1, blue2, blue3, green1, green2);
	}

	protected void addAllCells(PropertyCell blue1, PropertyCell blue2,
			PropertyCell blue3, PropertyCell green1, PropertyCell green2) {
		addCell(blue1);
		addCell(blue2);
		addCell(blue3);
		addCell(green1);
		addCell(green2);
	}

	protected void setHousePrices(PropertyCell blue1, PropertyCell blue2,
			PropertyCell blue3, PropertyCell green1, PropertyCell green2) {
		blue1.setHousePrice(50);
		blue2.setHousePrice(50);
		blue3.setHousePrice(50);
		green1.setHousePrice(70);
		green2.setHousePrice(70);
	}

	protected void setRents(PropertyCell blue1, PropertyCell blue2,
			PropertyCell blue3, PropertyCell green1, PropertyCell green2) {
		blue1.setRent(10);
		blue2.setRent(10);
		blue3.setRent(10);
		green1.setRent(1600);
		green2.setRent(20);
	}

	protected void setPrices(PropertyCell blue1, PropertyCell blue2,
			PropertyCell blue3, PropertyCell green1, PropertyCell green2) {
		blue1.setPrice(100);
		blue2.setPrice(100);
		blue3.setPrice(120);
		green1.setPrice(200);
		green2.setPrice(240);
	}

	protected void setColourGroups(PropertyCell blue1, PropertyCell blue2,
			PropertyCell blue3, PropertyCell green1, PropertyCell green2) {
		blue1.setColorGroup("blue");
		blue2.setColorGroup("blue");
		blue3.setColorGroup("blue");
		green1.setColorGroup("green");
		green2.setColorGroup("green");
	}

	protected void setNames(PropertyCell blue1, PropertyCell blue2,
			PropertyCell blue3, PropertyCell green1, PropertyCell green2) {
		blue1.setName("Blue 1");
		blue2.setName("Blue 2");
		blue3.setName("Blue 3");
		green1.setName("Green 1");
		green2.setName("Green 2");
	}
}
