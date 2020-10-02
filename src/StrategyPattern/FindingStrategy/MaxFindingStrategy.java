package StrategyPattern.FindingStrategy;

import java.util.Arrays;

public class MaxFindingStrategy implements FindingStrategy {
    public int getResult(int[] numbers) {
        return Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
    }
}
