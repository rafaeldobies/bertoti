package com.git.cm.model;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private int rows;
	private int columns;
	private int mines;
	
	private final List <Field> fields = new ArrayList<>();
	
	public Board(int rows, int columns, int mines) {
		this.rows = rows;
		this.columns = columns;
		this.mines = mines;
		
		createFields();
		matchNeighbor();
		sortMines();
	}

	private void createFields() {
	
		for (int i=0; i < rows; i++) {
			for (int j=0; j<=columns; j++) {
				fields.add(new Field(i, j));
			}
		}
	}
	
	private void matchNeighbor() {
		for (Field c1: fields) {
			for ( Field c2: fields) {
				c1.addANeighbor(c2);
			}
		}
		
	}
	
	private void sortMines() { 
		long armedMines = 0;
		do {
			armedMines = fields.stream().filter(c -> c.isMined()).count();
			int random = (int)  (Math.random()*fields.size());
			fields.get(random).changeMined();
			
		} while (armedMines<mines);
	}
	
	public boolean goalReached () {
		return fields.stream().allMatch(c -> c.goalReached());
	}
	
	public void restart () {
		fields.stream().forEach(c -> c.restart());
		sortMines();
	}
	
	public void printBoard() {
		for (Field f: fields) {
			System.out.println(f.toString());
		}
		
	}
	
}
