package com.git.cm.model;

import java.util.ArrayList;
import java.util.List;

import com.git.cm.exception.ExplosionException;

public class Field {

	private final int row;
	private final int column;
	
	private boolean opened = false;
	private boolean marked = false;
	private boolean mined = false;
	
	private List<Field> neighbors = new ArrayList<>();
		
	Field (int row, int column){
		this.row = row;
		this.column = column;
	}
	
	boolean addANeighbor(Field neighbor) {
		boolean isDiagonal = false;
		
		if ((neighbor.row != row)&&(neighbor.column != column)){
			isDiagonal = true;
		}
		
		if ((Math.abs(column-neighbor.column)+Math.abs(row-neighbor.row)==1)&&!isDiagonal) {
			neighbors.add(neighbor);
			return true;
		}else if ((Math.abs(column-neighbor.column)+Math.abs(row-neighbor.row)==2)&& isDiagonal) {
			neighbors.add(neighbor);
			return true;
			
		}else {
			return false;
 			
		}
		
	}
	
	void changeMarked () {
		if (!opened) {
			marked = !marked;
					
		}
	}
	
	void changeMined() {
		mined = !mined;
	}
	
	boolean open () {
		if (!opened && !marked) {
			opened = true;
			
			if (mined) {
				throw new ExplosionException();
			}
			
			if (safeNeighborhood()) {
				neighbors.forEach(v -> v.open());
			}
			
			return true;
		} else {
			return false;
		}
	}
	
	boolean safeNeighborhood () {
		return neighbors.stream().noneMatch(v -> v.mined);
	}
	
	public boolean isMined() {
		return mined;
	}
	
	public boolean isMarked () {
		return marked;
	}
	
	public boolean isOpened() {
		return opened;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
	
	long minesInTheNeighborhood() {
		return neighbors.stream().filter(v -> v.mined).count();
	}
	
	boolean goalReached() {
		boolean fieldDiscovered = opened && !mined;
		boolean fieldWithBomb = marked && mined;
		return fieldDiscovered || fieldWithBomb;
	}
	
	void restart() {
		opened = false;
		marked = false;
		mined = false;
	}
	
	public String toString() {
		if (marked) {
			return "x";
		} else if (opened && mined) {
			return "*";
		} else if(opened&&minesInTheNeighborhood()>0) {
			return Long.toString(minesInTheNeighborhood());
		} else if (opened) {
			return " ";
		} else {
			return "?";
		}
	}
}
