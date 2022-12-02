package pl.kniewiadomski.aoc2022.day2;


public class WeaponTuple {
    private Weapon foePick;
    private Weapon myPick;

    public WeaponTuple(char foePick, char myPick) {
        this.foePick = Weapon.translate(foePick);
        this.myPick = Weapon.translate(myPick);
    }

    public WeaponTuple(Weapon foeWeapon, Weapon myWeapon) {
        this.foePick = foeWeapon;
        this.myPick = myWeapon;
    }

    public Long getTotalScore() {
        return myPick.getValue() + getScore();
    }

    private Long getScore() {
        if (foePick == myPick) {
            return 3L;
        }
        if (foePick.getValue() - myPick.getValue() % 3 == 1) {
            return 0L;
        } else {
            return 6L;
        }
    }


}
