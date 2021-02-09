package com.spring.Basics.RefTypes;

public class Scores {
	private double maths;
	private double physics;
	public double getMaths() {
		return maths;
	}
	public void setMaths(double maths) {
		this.maths = maths;
	}
	public double getPhysics() {
		return physics;
	}
	public void setPhysics(double physics) {
		this.physics = physics;
	}
	@Override
	public String toString() {
		return "Scores [maths=" + maths + ", physics=" + physics + "]";
	}
	
	

}
