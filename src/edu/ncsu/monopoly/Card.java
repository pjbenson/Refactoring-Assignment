package edu.ncsu.monopoly;

public abstract class Card implements IOwnableCard {

    public static int TYPE_CHANCE = 1;
    public static int TYPE_CC = 2;

    /* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnableCard#getLabel()
	 */
    @Override
	public abstract String getLabel();
    /* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnableCard#applyAction()
	 */
    @Override
	public abstract void applyAction();
    /* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnableCard#getCardType()
	 */
    @Override
	public abstract int getCardType();
}
