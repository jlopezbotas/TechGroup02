import java.util.Random;

public class U2 extends Rocket{

    public U2() {
        this.rocketCost = 120;
        this.rocketWeight = 16329.3f;

    }

    @Override
    public boolean launch() {
        this.launchExplosionChance = 0.04f * (this.currentWeight / this.maxWeigth);
        return new Random().nextFloat()<this.launchExplosionChance;
    }

    @Override
    public boolean land() {
        this.landingCrashChance = 0.08f * (this.currentWeight / this.maxWeigth);
        return new Random().nextFloat()<this.landingCrashChance;
    }
}
