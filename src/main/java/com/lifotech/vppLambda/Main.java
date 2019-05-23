package com.lifotech.vppLambda;



public class Main {

	public static void main(String[] args) {
		ExamManager examManager = new ExamManager();
		System.out.println ("The average score is " + examManager.customCalculation(new AverageCalculator()));
		System.out.println ("The highest score is " + examManager.customCalculation(new HighestScoreCalculator()));
	}

}
