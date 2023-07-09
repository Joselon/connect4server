package com.labturing.utils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ClosedIntervalTest {

    private ClosedInterval closedInterval;
    private final int MIN = -10;
    private final int MAX = 10;

    @Test
    public void givenClosedIntervalWhenNewThenCreateObject() {
        this.closedInterval = new ClosedInterval(MIN, MAX);
        assertNotNull(this.closedInterval);
    }

    @Test
    public void givenClosedIntervalWhenNewWithMinGreaterThanMaxThenAssertError() {
        assertThrows(AssertionError.class, () -> {
            this.closedInterval = new ClosedInterval(MAX, MIN);
        });
    }

    @Test
    public void givenClosedIntervalWhenIntegerIsIncludedThenReturnTrue() {
        this.closedInterval = new ClosedInterval(MIN, MAX);
        assertTrue(this.closedInterval.isIncluded(MIN + 1));
        assertTrue(this.closedInterval.isIncluded(MAX - 1));
    }

    @Test
    public void givenClosedIntervalWhenIntegerIsNotIncludedThenReturnFalse() {
        this.closedInterval = new ClosedInterval(MIN, MAX);
        assertFalse(this.closedInterval.isIncluded(MIN - 1));
        assertFalse(this.closedInterval.isIncluded(MAX + 1));
    }

    @Test
    private void givenSameClosedIntervalWhenEqualsThenReturnTrue(){
        this.closedInterval = new ClosedInterval(MIN, MAX);
        ClosedInterval sameCosedInterval = new ClosedInterval(MIN, MAX);
        assertTrue(this.closedInterval.equals(sameCosedInterval));
    }

    @Test
    private void givenDiferentClosedIntervalWhenEqualsThenReturnTrue(){
        this.closedInterval = new ClosedInterval(MIN, MAX);
        ClosedInterval sameCosedInterval = new ClosedInterval(MIN - 1, MAX);
        assertFalse(this.closedInterval.equals(sameCosedInterval));
    }

}
