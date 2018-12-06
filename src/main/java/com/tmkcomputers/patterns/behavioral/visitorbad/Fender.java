package com.tmkcomputers.patterns.behavioral.visitorbad;

public class Fender implements AtvPart {
	@Override
	public double calculateShipping() {
		return 3;
	}
}
