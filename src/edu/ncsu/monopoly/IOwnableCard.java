package edu.ncsu.monopoly;

public interface IOwnableCard {

	public abstract String getLabel();

	public abstract void applyAction();

	public abstract int getCardType();

}