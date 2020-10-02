package StrategyPattern.FindingStrategy;

import java.util.Arrays;

public class MinFindingStrategy implements FindingStrategy{
    public int getResult(int[] numbers) {
        return Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
    }
}
