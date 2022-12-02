package pl.kniewiadomski.aoc2022.day2;

import pl.kniewiadomski.base.Day;

import java.util.Arrays;

public class Day2 extends Day {

    public Day2() {
        super();
    }
    @Override
    public Long part1() {
        return Arrays.stream(inputData.getContent().split("\r\n"))
                .map(tuple -> new WeaponTuple(tuple.charAt(0), tuple.charAt(2)))
                .mapToLong(WeaponTuple::getTotalScore)
                .sum();
    }

    @Override
    public Object part2() {
        return Arrays.stream(inputData.getContent().split("\r\n"))
                .map(tuple -> {
                    Weapon foeWeapon = Weapon.translate(tuple.charAt(0));
                    Weapon recommendedWeapon = Weapon.getRecommendedWeapon(foeWeapon, tuple.charAt(2));
                    return new WeaponTuple(foeWeapon, recommendedWeapon);
                })
                .mapToLong(WeaponTuple::getTotalScore)
                .sum();
    }
}
