public class U2 extends Rocket {
    public U2() {
        rocketCost = 120;
        rocketWeight = 18;
        maxWeightWithCargo = 29;
    }
    @Override
    public boolean launch() {
        if(Math.random()< 0.04*(rocketWeight/maxWeightWithCargo)){
            return false;
        }else{
            return true;}
    }
    @Override
    public boolean land() {
        if(Math.random()< 0.08*(rocketWeight/maxWeightWithCargo)){
            return false;
        }else{
            return true;}
    }


}
