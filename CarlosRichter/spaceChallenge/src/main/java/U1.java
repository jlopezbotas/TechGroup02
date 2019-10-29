public class U1 extends Rocket {
    public U1() {
        rocketCost = 100;
        rocketWeight = 10;
        maxWeightWithCargo = 18;
    }

    @Override
    public boolean launch() {
        if(Math.random()< 0.05*(this.rocketWeight/this.maxWeightWithCargo)){
            return false;
        }else{
            return true;}
    }

    @Override
    public boolean land() {
        if(Math.random()< 0.01*(this.rocketWeight/this.maxWeightWithCargo)){
            return false;
        }else{
            return true;}
    }

}
