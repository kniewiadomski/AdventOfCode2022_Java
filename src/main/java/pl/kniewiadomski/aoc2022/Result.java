package pl.kniewiadomski.aoc2022;

import pl.kniewiadomski.aoc2022.day1.Day1;
import pl.kniewiadomski.aoc2022.day2.Day2;

public class Result {
    public static void main(String[] args) {
        System.out.println("----------DAY 1----------");
        Day1 day1 = new Day1();
        System.out.println(day1.part1());
        System.out.println(day1.part2());
        System.out.println("----------DAY 2----------");
        Day2 day2 = new Day2();
        System.out.println(day2.part1());
        System.out.println(day2.part2());
    }
}
