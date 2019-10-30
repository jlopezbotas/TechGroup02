import java.util.Random;

public class U2 extends Rocket{

    public U2() {
        this.rocketCost = 120;
        this.rocketWeight = 16329.3f;
        this.maxWeigth = 26308.4f;
        this.currentWeight = this.rocketWeight;
    }

    @Override
    public boolean launch() {
        this.launchExplosionChance = 0.04f * (this.currentWeight / this.maxWeigth);
        boolean explosion = new Random().nextFloat()<this.launchExplosionChance;
        if (explosion) {System.out.println("U2 explosion "+this.launchExplosionChance);}
        return explosion;
    }

    @Override
    public boolean land() {
        this.landingCrashChance = 0.08f * (this.currentWeight / this.maxWeigth);
        boolean crash = new Random().nextFloat()<this.landingCrashChance;
        if (crash) {System.out.println("U2 crash "+this.landingCrashChance);}
        return crash;
    }
}
