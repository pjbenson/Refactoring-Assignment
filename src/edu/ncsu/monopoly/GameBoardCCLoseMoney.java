package edu.ncsu.monopoly;


public class GameBoardCCLoseMoney extends GameBoardCC {
    public GameBoardCCLoseMoney() {
		super();
        
        IOwnableCard ccCard1 = new MoneyCard("Pay $20", -20, Card.TYPE_CC);
		
		addCard(ccCard1);
		
		addCell(cc1);
		addCell(blue1);
		addCell(jail);
		addCell(blue2);
		addCell(chance1);
		
    }
}
