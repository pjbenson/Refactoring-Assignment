package edu.ncsu.monopoly;

public abstract class Cell implements IOwnableCell {
	private String name;
	protected Player owner;
	private boolean available = true;

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#getOwner()
	 */
	@Override
	public Player getOwner() {
		return owner;
	}
	
	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#getPrice()
	 */
	@Override
	public int getPrice() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#isAvailable()
	 */
	@Override
	public boolean isAvailable() {
		return available;
	}
	
	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#playAction()
	 */
	@Override
	public abstract void playAction();

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#setAvailable(boolean)
	 */
	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#setOwner(edu.ncsu.monopoly.Player)
	 */
	@Override
	public void setOwner(Player owner) {
		this.owner = owner;
	}
    
    /* (non-Javadoc)
	 * @see edu.ncsu.monopoly.IOwnable#toString()
	 */
    @Override
	public String toString() {
        return name;
    }
}
