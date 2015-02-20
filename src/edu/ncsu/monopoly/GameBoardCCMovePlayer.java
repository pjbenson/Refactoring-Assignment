package edu.ncsu.monopoly;


public class GameBoardCCMovePlayer extends GameBoardCC {
    public GameBoardCCMovePlayer() {
		super();
        
        IOwnableCard ccCard1 = new MovePlayerCard("Blue 1" , Card.TYPE_CC);
        IOwnableCard ccCard2 = new MovePlayerCard("Blue 2", Card.TYPE_CC);
		
		addCard(ccCard1);
		addCard(ccCard2);
		
		addCell(blue1);
		addCell(cc1);
		addCell(jail);
		addCell(blue2);
		addCell(chance1);
		
    }
}
