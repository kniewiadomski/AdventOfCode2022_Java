package pl.kniewiadomski.base;

import pl.kniewiadomski.aoc2022.commons.Input;

public abstract class Day {

    private static final String BASE_BATH = "C:\\Projects\\AoC2022\\src\\main\\resources\\inputs\\";
    private static final String PATH_SUFFIX = ".txt";
    protected final Input inputData;

    public Day() {
        this.inputData = new Input(BASE_BATH + this.getClass().getSimpleName() + PATH_SUFFIX);
    }

    public abstract Object part1();

    public abstract Object part2();
}
