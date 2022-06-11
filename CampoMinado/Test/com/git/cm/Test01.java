package com.git.cm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test01 {
		
		@Test
		void test() {
			
			int a=1+1;
			assertEquals(2, a);
			//fail("Not yet implemented");
		}
		
		@Test
		void test2() {
			
			int b = (10+5)*3;
			assertEquals(45, b);
			
		}

}
