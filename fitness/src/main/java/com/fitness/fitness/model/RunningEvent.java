package com.fitness.fitness.model;

public class RunningEvent extends Event {
	private double targetKms;
	private double completedKms;
	
	public double getTargetKms() {
		return targetKms;
	}
	public void setTargetKms(double targetKms) {
		this.targetKms = targetKms;
	}
	public double getCompletedKms() {
		return completedKms;
	}
	public void setCompletedKms(double completedKms) {
		this.completedKms = completedKms;
	}
	
	
}
