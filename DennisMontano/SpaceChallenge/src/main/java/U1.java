import java.util.Random;

public class U1 extends Rocket{

    public U1() {
        this.rocketCost = 100;
        this.rocketWeight = 9071.85f;

    }

    @Override
    public boolean launch() {
        this.launchExplosionChance = 0.05f * (this.currentWeight / this.maxWeigth);
        return new Random().nextFloat()<this.launchExplosionChance;
    }

    @Override
    public boolean land() {
        this.landingCrashChance = 0.01f * this.currentWeight / this.maxWeigth;
        return new Random().nextFloat()<this.landingCrashChance;
    }
}
