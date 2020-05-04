import java.util.Random;

public class U1 extends Rocket{

    public U1() {
        this.rocketCost = 100;
        this.rocketWeight = 9071.85f;
        this.maxWeigth = 16329.3f;
        this.currentWeight = this.rocketWeight;
    }

    @Override
    public boolean launch() {
        this.launchExplosionChance = 0.05f * (this.currentWeight / this.maxWeigth);
        boolean explosion = new Random().nextFloat()<this.launchExplosionChance;
        if (explosion) {System.out.println("U1 explosion "+this.launchExplosionChance);}
        return explosion;
    }

    @Override
    public boolean land() {
        this.landingCrashChance = 0.01f * this.currentWeight / this.maxWeigth;
        boolean crash = new Random().nextFloat()<this.landingCrashChance;
        if (crash) {System.out.println("U1 crash "+this.landingCrashChance);}
        return crash;
    }
}
