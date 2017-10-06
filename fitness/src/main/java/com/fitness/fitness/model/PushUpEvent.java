package com.fitness.fitness.model;

public class PushUpEvent {
	private int targetCycles;
	private int completedCycles;
	
	public PushUpEvent(int targetCycles) {
		this.targetCycles = targetCycles;
		this.completedCycles= 0;
		
	}
	public int getTargetCycles() {
		return targetCycles;
	}
	public void setTargetCycles(int targetCycles) {
		this.targetCycles = targetCycles;
	}
	public int getCompletedCycles() {
		return completedCycles;
	}
	public void setCompletedCycles(int completedCycles) {
		this.completedCycles = completedCycles;
	}

	
	
}
