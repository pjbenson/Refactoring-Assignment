package edu.ncsu.monopoly;

public interface IOwnableGameBoard {

	public abstract void addCard(IOwnableCard card);

	public abstract void addCell(IOwnableCell cell);

	public abstract void addCell(PropertyCell cell);

	public abstract IOwnableCard drawCCCard();

	public abstract IOwnableCard drawChanceCard();

	public abstract IOwnableCell getCell(int newIndex);

	public abstract int getCellNumber();

	public abstract PropertyCell[] getPropertiesInMonopoly(String color);

	public abstract int getPropertyNumberForColor(String name);

	public abstract IOwnableCell queryCell(String string);

	public abstract int queryCellIndex(String string);

	public abstract void removeCards();

}