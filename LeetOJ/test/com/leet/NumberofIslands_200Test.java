package com.leet;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberofIslands_200Test {

	@Test
	public void testNumIslands() {
		NumberofIslands_200 test = new NumberofIslands_200();

		assertEquals(2, test.numIslands(new char[][]{
			new char[]{'1','1','0','0','0'},
			new char[]{'1','1','0','1','0'},
			new char[]{'0','0','0','0','0'},
			new char[]{'0','0','0','0','0'}
		}));
		
		assertEquals(1, test.numIslands(new char[][]{
			new char[]{'1','1','1','1','0'},
			new char[]{'1','1','0','1','0'},
			new char[]{'1','1','0','0','0'},
			new char[]{'0','0','0','0','0'}
		}));
		
		assertEquals(3, test.numIslands(new char[][]{
			new char[]{'1','1','0','0','0'},
			new char[]{'1','1','0','0','0'},
			new char[]{'0','0','1','0','0'},
			new char[]{'0','0','0','1','1'}
		}));
		
		assertEquals(1, test.numIslands(new char[][]{
			new char[]{'0','0','0','0','0'},
			new char[]{'0','0','0','0','0'},
			new char[]{'0','0','0','0','0'},
			new char[]{'0','0','0','0','1'}
		}));
		
		assertEquals(5, test.numIslands(new char[][]{
			new char[]{'0','0','0','1','0'},
			new char[]{'0','0','1','0','0'},
			new char[]{'0','1','0','0','1'},
			new char[]{'1','0','0','1','1'}
		}));
	}

}
