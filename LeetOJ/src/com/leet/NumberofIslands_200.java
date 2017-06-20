package com.leet;

public class NumberofIslands_200 {
	public int numIslands(char[][] grid) {
		if (grid.length == 0) return 0;
    	int row = grid.length;
    	int col = grid[0].length;
    	int count = 0;
    	
    	for (int i = 0; i < row; i++) {
    		for (int j = 0; j < col; j++) {
    			if (grid[i][j] == '1') {
    				count++;
    				exploreRemaining(grid, i, j);
    			}
    		}
    	}
    	return count;
	}
	
	public void exploreRemaining(char[][] grid, int i, int j) {
		if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') return;
		grid[i][j] = '0';
		exploreRemaining(grid, i - 1, j);
		exploreRemaining(grid, i + 1, j);
		exploreRemaining(grid, i, j + 1);
		exploreRemaining(grid, i, j - 1);
		return;
	}
}
