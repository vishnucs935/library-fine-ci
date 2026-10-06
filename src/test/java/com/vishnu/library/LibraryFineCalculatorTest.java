package com.vishnu.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryFineCalculatorTest {

    @Test
    void testCalculateDaysLate() {
        LibraryFineCalculator calculator = new LibraryFineCalculator();

        assertEquals(5, calculator.calculateDaysLate(10, 15));
    }

    @Test
    void testCalculateFine() {
        LibraryFineCalculator calculator = new LibraryFineCalculator();

        assertEquals(10.0, calculator.calculateFine(5));
    }

    @Test
    void testMemberDiscount() {
        LibraryFineCalculator calculator = new LibraryFineCalculator();

        assertEquals(9.0, calculator.applyMemberDiscount(10.0, true));
    }

    @Test
    void testFineCategory() {
        LibraryFineCalculator calculator = new LibraryFineCalculator();

        assertEquals("Medium", calculator.getFineCategory(30.0));
    }
}