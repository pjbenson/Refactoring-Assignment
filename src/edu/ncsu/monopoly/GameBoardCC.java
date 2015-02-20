package edu.ncsu.monopoly;

public class GameBoardCC extends GameBoard {
	protected PropertyCell blue1 = new PropertyCell();
	protected PropertyCell blue2 = new PropertyCell();
	protected IOwnableCell cc1;
	protected JailCell jail;
	protected IOwnableCell chance1;
	
	public GameBoardCC() {
		super();
		blue1 = new PropertyCell();
		blue2 = new PropertyCell();
		cc1 = new CardCell(Card.TYPE_CC, "Community Chest 1");
        jail = new JailCell();
        chance1 = new CardCell(Card.TYPE_CHANCE, "Chance 1");
        
        blue1.setName("Blue 1");
		blue2.setName("Blue 2");
		
		blue1.setColorGroup("blue");
		blue2.setColorGroup("blue");
		
		blue1.setPrice(100);
		blue2.setPrice(100);
		
		blue1.setRent(10);
		blue2.setRent(10);
		
		blue1.setHousePrice(50);
		blue2.setHousePrice(50);
		
		
	}

}