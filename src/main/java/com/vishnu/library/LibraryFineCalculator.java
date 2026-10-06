package com.vishnu.library;

public class LibraryFineCalculator {

    public int calculateDaysLate(int dueDate, int returnDate) {
        return Math.max(0, returnDate - dueDate);
    }

    public double calculateFine(int daysLate) {
        return daysLate * 2.0;
    }

    public double applyMemberDiscount(double fine, boolean isMember) {
        if (isMember) {
            return fine * 0.90;
        }
        return fine;
    }

    public String getFineCategory(double fine) {
        if (fine == 0) {
            return "No Fine";
        } else if (fine <= 20) {
            return "Low";
        } else if (fine <= 50) {
            return "Medium";
        } else {
            return "High";
        }
    }
}