package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.IOwnableCell;

public class CCCellInfoFormatter implements CellInfoFormatter {
    public String format(IOwnableCell cell) {
        return "<html><font color='white'><b>" + cell.getName() + "</b></font></html>";
    }
}
