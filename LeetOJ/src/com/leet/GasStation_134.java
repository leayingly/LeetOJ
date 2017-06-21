package com.leet;

public class GasStation_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    	int total = 0, idx = 0, tank = 0;
    	
    	if (gas.length == 0) return -1;
    	
    	for (int i = 0; i < gas.length; i++) {
    		total += (gas[i] - cost[i]);
    		tank += (gas[i] - cost[i]);
    		
    		
    		if (tank < 0) {
    			tank = 0;
    			idx = (i + 1) % gas.length;
    		}
    	}
    	
    	if (total >= 0) {
    		return idx;
    	} else {
    		return -1;
    	}
    }
}
