package com.learning.microservices.limitsservice.bean;

public class LimitConfiguration {
private int maximum;
private int minimum;
public int getMinimum() {
	return minimum;
}

protected LimitConfiguration() {
	super();
	// TODO Auto-generated constructor stub
}

public int getMaximum() {
	return maximum;
}

public LimitConfiguration(int maximum, int minimum) {
	super();
	this.maximum = maximum;
	this.minimum = minimum;
}



}
