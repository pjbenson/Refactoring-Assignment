package edu.ncsu.monopoly;

public interface IOwnable {

	public abstract String getName();

	public abstract Player getOwner();

	public abstract int getPrice();

	public abstract boolean isAvailable();

	public abstract void playAction();

	public abstract void setAvailable(boolean available);

	public abstract void setOwner(Player owner);

	public abstract String toString();

}