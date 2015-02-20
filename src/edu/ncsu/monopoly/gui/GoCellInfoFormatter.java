package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.IOwnableCell;

public class GoCellInfoFormatter implements CellInfoFormatter {
    
    public static final String GO_CELL_LABEL = "<html><b>Go</b></html>";
    
    public String format(IOwnableCell cell) {
        return GO_CELL_LABEL;
    }
}
