package pl.kniewiadomski.aoc2022.day2;

public enum Weapon {
    ROCK(1L),
    PAPER(2L),
    SCISSORS(3L);

    private Long value;

    Weapon(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    public static Weapon translate(char Char){
        switch(Char){
            case 'A', 'X':
                return ROCK;
            case 'B', 'Y':
                return PAPER;
            case 'C', 'Z':
                return SCISSORS;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static Weapon getRecommendedWeapon(Weapon foeWeapon, char recommendation) {

        switch (recommendation) {
            case 'X':
                return Weapon.values()[(foeWeapon.getValue().intValue() + 1) % 3];
            case 'Y':
                return foeWeapon;
            case 'Z':
                return Weapon.values()[foeWeapon.getValue().intValue() % 3];
            default:
                throw new IllegalArgumentException();
        }
    }
}
