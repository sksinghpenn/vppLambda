package com.lifotech.vppMyLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;


public class ExamManager {

    private List<Double> myScores;

    public ExamManager() {
        myScores = new ArrayList<Double>();
        myScores.add(78.3);
        myScores.add(69.2);
        myScores.add(44.7);
        myScores.add(61.6);
        myScores.add(80.2);
        myScores.add(66.9);
        myScores.add(54.1);
    }

    public void printScores() {
        Collections.sort(myScores, new DesendingComparator());

        myScores.forEach(s -> System.out.println(s));
    }

    public void printSelectedStore(Predicate<Double> predicate) {

        Collections.sort(myScores, new DesendingComparator());
        myScores.forEach(myScore -> {
            if (predicate.test(myScore)) {
                System.out.println(myScore);
            }
        });
    }

    public static void main(String[] args) {
        ExamManager examManager = new ExamManager();
        examManager.printScores();
        //examManager.printSelectedStore(myScore -> myScore > 50);
    }
}
