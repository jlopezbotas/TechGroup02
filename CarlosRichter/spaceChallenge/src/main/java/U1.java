public class U1 extends Rocket {
    public U1() {
        rocketCost = 100;
        rocketWeight = 10;
        maxWeightWithCargo = 18;
    }

    public void setChanceOfLaunchExplosion(int cargoCarried) {
        this.chanceOfLaunchExplosion = 0.05*(cargoCarried/maxWeightWithCargo);
    }

    public void setChanceOfLandingCrash(int cargoCarried) {
        this.chanceOfLandingCrash = 0.01*(cargoCarried/maxWeightWithCargo);
    }
}
