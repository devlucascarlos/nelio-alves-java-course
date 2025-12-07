package oop_fundamentals.workshops.result.entities;

public class Student {

    public String name;
    public double scoreA;
    public double scoreB;
    public double scoreC;

    public double finalScore() {
        return scoreA + scoreB + scoreC;
    }
    public double missing() {
        return 60 - (scoreA + scoreB +scoreC);
    }
    public String toString() {
        if (finalScore() >= 60) {
            return "FINAL GRADE: " + String.format("%.2f", finalScore()) + "\nPASS";
        } else {
            return "FINAL GRADE: " + String.format("%.2f", finalScore()) + "\nFAILED" + "\nMISSING " + String.format("%.2f",missing()) + " POINTS";
        }
    }
}
