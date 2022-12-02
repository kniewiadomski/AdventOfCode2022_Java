package pl.kniewiadomski.aoc2022.day1;

import pl.kniewiadomski.base.Day;

import java.util.*;


public class Day1 extends Day {

    public Day1() {
        super();
    }

    public Long part1() {
        List<Long> backpackCalories = getBackpacksCalories();

        return backpackCalories.stream().max(Long::compare).get();
    }

    public Long part2() {
        List<Long> backpackCalories = getBackpacksCalories().stream().sorted(Collections.reverseOrder()).toList();

        return backpackCalories.get(0) + backpackCalories.get(1) + backpackCalories.get(2);
    }

    private List<Long> getBackpacksCalories() {

        return Arrays.stream(inputData.getContent().split("\r\n\r\n"))
                .map(el ->
                        Arrays.stream(el.split("\r\n")).mapToLong(Long::parseLong).sum()
                )
                .toList();
    }

}
