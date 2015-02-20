package edu.ncsu.monopoly;

import java.util.ArrayList;
import java.util.Hashtable;

public class GameBoard implements IOwnableGameBoard {

	private ArrayList cells = new ArrayList();
    private ArrayList chanceCards = new ArrayList();
	//the key of colorGroups is the name of the color group.
	private Hashtable colorGroups = new Hashtable();
	private ArrayList communityChestCards = new ArrayList();
	private GameMaster gameMaster;
	
	public GameBoard() {
		IOwnableCell go = new GoCell();
		addCell(go);
	}

    /* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IGameBoard#addCard(edu.ncsu.monopoly.Card)
	 */
    @Override
	public void addCard(IOwnableCard card) {
        if(card.getCardType() == Card.TYPE_CC) {
            communityChestCards.add(card);
        } else {
            chanceCards.add(card);
        }
    }
	
	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IGameBoard#addCell(edu.ncsu.monopoly.IOwnable)
	 */
	@Override
	public void addCell(IOwnableCell cell) {
		cells.add(cell);
	}
	
	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IGameBoard#addCell(edu.ncsu.monopoly.PropertyCell)
	 */
	@Override
	public void addCell(PropertyCell cell) {
		String colorGroup = cell.getColorGroup();
		int propertyNumber = getPropertyNumberForColor(colorGroup);
		colorGroups.put(colorGroup, new Integer(propertyNumber + 1));
        cells.add(cell);
	}

    /* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IGameBoard#drawCCCard()
	 */
    @Override
	public IOwnableCard drawCCCard() {
        IOwnableCard card = (IOwnableCard)communityChestCards.get(0);
        communityChestCards.remove(0);
        addCard(card);
        return card;
    }

    /* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IGameBoard#drawChanceCard()
	 */
    @Override
	public IOwnableCard drawChanceCard() {
        IOwnableCard card = (IOwnableCard)chanceCards.get(0);
        chanceCards.remove(0);
        addCard(card);
        return card;
    }

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IGameBoard#getCell(int)
	 */
	@Override
	public IOwnableCell getCell(int newIndex) {
		return (IOwnableCell)cells.get(newIndex);
	}
	
	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IGameBoard#getCellNumber()
	 */
	@Override
	public int getCellNumber() {
		return cells.size();
	}
	
	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IGameBoard#getPropertiesInMonopoly(java.lang.String)
	 */
	@Override
	public PropertyCell[] getPropertiesInMonopoly(String color) {
		PropertyCell[] monopolyCells = new PropertyCell[getPropertyNumberForColor(color)];
		int counter = 0;
		for (int i = 0; i < getCellNumber(); i++) {
			IOwnableCell c = getCell(i);
			if(c instanceof PropertyCell) {
				PropertyCell pc = (PropertyCell)c;
				if(pc.getColorGroup().equals(color)) {
					monopolyCells[counter] = pc;
					counter++;
				}
			}
		}
		return monopolyCells;
	}
	
	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IGameBoard#getPropertyNumberForColor(java.lang.String)
	 */
	@Override
	public int getPropertyNumberForColor(String name) {
		Integer number = (Integer)colorGroups.get(name);
		if(number != null) {
			return number.intValue();
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IGameBoard#queryCell(java.lang.String)
	 */
	@Override
	public IOwnableCell queryCell(String string) {
		for(int i = 0; i < cells.size(); i++){
			IOwnableCell temp = (IOwnableCell)cells.get(i); 
			if(temp.getName().equals(string)) {
				return temp;
			}
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IGameBoard#queryCellIndex(java.lang.String)
	 */
	@Override
	public int queryCellIndex(String string){
		for(int i = 0; i < cells.size(); i++){
			IOwnableCell temp = (IOwnableCell)cells.get(i); 
			if(temp.getName().equals(string)) {
				return i;
			}
		}
		return -1;
	}

    /* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IGameBoard#removeCards()
	 */
    @Override
	public void removeCards() {
        communityChestCards.clear();
    }
}
