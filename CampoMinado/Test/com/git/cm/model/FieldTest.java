package com.git.cm.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.git.cm.exception.ExplosionException;

class FieldTest {

	private Field field;
	
	@BeforeEach
	void startField () {
		field = new Field(3,3);
	}
	
	@Test
	void testIfIsANeighbor1() {
		Field neighbor = new Field(3, 2);
		boolean result = field.addANeighbor(neighbor);
		
		assertTrue(result);
	}
	
	@Test
	void testIfIsANeighbor2() {
		Field neighbor = new Field(2, 2);
		boolean result = field.addANeighbor(neighbor);
		
		assertTrue(result);
	}
	
	@Test
	void testIfIsANeighbor3() {
		Field neighbor = new Field(5, 3);
		boolean result = field.addANeighbor(neighbor);
		
		assertFalse(result);
	}

	@Test
	void testFunctionChangeMarkedDefault () {
		assertFalse(field.isMarked());
	}
	
	@Test
	void testFunctionChangeMarkedTrue () {
		field.changeMarked();
		assertTrue(field.isMarked());
	}
	@Test
	void testFunctionChangeMarkedTwice() {
		field.changeMarked();
		field.changeMarked();
		assertFalse(field.isMarked());
	}
	
	@Test
	void testOpenNotMarkedNotMined () {
		assertTrue(field.open());	
	}
	
	@Test
	void testOpenMarkedNotMined () {
		field.changeMarked();
		assertFalse(field.open());	
	}
	
	@Test
	void testOpenMarkedMined () {
		field.changeMarked();
		field.changeMined();
		assertFalse(field.open());	
	}
	
	@Test
	void testOpenNotMarkedMined () {
		field.changeMined();
		assertThrows(ExplosionException.class, () -> {
			field.open();
			});
	}
	
	@Test
	void testOpenNeighbors() {
		
		Field neighbor00 = new Field(0, 0);
		Field neighbor01 = new Field(0, 1);
		neighbor01.changeMined();
		Field neighbor11 = new Field(1, 1);
		Field neighbor22 = new Field(2, 2);
		Field neighbor99 = new Field(9, 9);
		
		field.addANeighbor(neighbor22);
		neighbor22.addANeighbor(neighbor11);
		neighbor11.addANeighbor(neighbor00);
		neighbor11.addANeighbor(neighbor01);
		neighbor00.addANeighbor(neighbor01);
		neighbor00.addANeighbor(neighbor11);
	
		
		field.open();
		
		assertTrue(field.isOpened() && neighbor22.isOpened()&&neighbor11.isOpened()&&!neighbor01.isOpened()
				&&!neighbor00.isOpened());
		
	}
}
