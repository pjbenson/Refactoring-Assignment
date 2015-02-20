package edu.ncsu.monopoly;


public class GameBoardCCJail extends GameBoardCC {
    
    public GameBoardCCJail() {
		super();
        
        Card ccCard1 = new JailCard(Card.TYPE_CC);
        Card chanceCard1 = new JailCard(Card.TYPE_CHANCE);
		
        addCard(chanceCard1);
		addCard(ccCard1);
		
		addCell(cc1);
		addCell(blue1);
		addCell(jail);
		addCell(blue2);
		addCell(chance1);
		
    }
}
