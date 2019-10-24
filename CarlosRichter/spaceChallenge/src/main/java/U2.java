public class U2 extends Rocket {
    public U2() {
        rocketCost = 120;
        rocketWeight = 18;
        maxWeightWithCargo = 29;
    }
    public void setChanceOfLaunchExplosion(int cargoCarried) {
        this.chanceOfLaunchExplosion = 0.04*(cargoCarried/maxWeightWithCargo);
    }

    public void setChanceOfLandingCrash(int cargoCarried) {
        this.chanceOfLandingCrash = 0.08*(cargoCarried/maxWeightWithCargo);
    }
}
