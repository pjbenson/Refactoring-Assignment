package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.IOwnableCell;

public class JailCellInfoFormatter implements CellInfoFormatter {

    public static final String JAIL_CELL_LABEL = "<html><b>Jail</b></html>";

    public String format(IOwnableCell cell) {
		return JAIL_CELL_LABEL;
	}

}
