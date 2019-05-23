package com.lifotech.vppLambda;

import java.util.List;

public class AverageCalculator implements CalculationFunctionInterface {


	public Double execute(List<Double> scores) {
		Double sum = 0d;
		
		for (Double nextScore : scores) {
			sum += nextScore;
		}
		return sum / scores.size();
	}

}
