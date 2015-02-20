package edu.ncsu.monopoly.gui;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import edu.ncsu.monopoly.IOwnableGameBoard;

public class GameBoardUtil {
    
	public static Dimension calculateDimension(int i) {
		i = i - 4;
		int shortSide = i / 4;
		int longSide = (i - (shortSide * 2)) / 2;
		return new Dimension(longSide, shortSide);
	}
	
	public static List getEastCells(IOwnableGameBoard board) {
		Dimension d = calculateDimension(board.getCellNumber());
		int longSide = d.width;
		int shortSide = d.height;
		List cells = new ArrayList();
		for(int i = board.getCellNumber() - shortSide; i <= board.getCellNumber() - 1; i++) {
			cells.add(board.getCell(i));
		}
		return cells;
	}
	
	public static List getNorthCells(IOwnableGameBoard board) {
		Dimension d = calculateDimension(board.getCellNumber());
		int longSide = d.width;
		int shortSide = d.height;
		List cells = new ArrayList();
		for(int i = longSide + 2 + shortSide; i <= longSide + 2 + shortSide + longSide + 1; i++) {
			cells.add(board.getCell(i));
		}
		return cells;
	}
	
	public static List getSouthCells(IOwnableGameBoard board) {
		Dimension d = calculateDimension(board.getCellNumber());
		int longSide = d.width;
		int shortSide = d.height;
		List cells = new ArrayList();
		for(int i = longSide + 1; i >= 0; i--) {
			cells.add(board.getCell(i));
		}
		return cells;
	}
	
	public static List getWestCells(IOwnableGameBoard board) {
		Dimension d = calculateDimension(board.getCellNumber());
		int longSide = d.width;
		int shortSide = d.height;
		List cells = new ArrayList();
		for(int i = longSide + 1 + shortSide; i > longSide + 1; i--) {
			cells.add(board.getCell(i));
		}
		return cells;
	}
}
