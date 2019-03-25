public class WaterBottle {
    private int volume;


    public WaterBottle(int volume) {
        this.volume = volume;
    }


    public int startVolume() {
        return this.volume;
    }

    public int fillBottle(int increment) {
        return this.volume + increment;
    }

    public int takeDrink(int sip) {
        if (this.volume != 0){
            return this.volume - sip;
        }
        return this.volume;
    }

    public int bottleEmpty(){
        return this.volume =0;
    }

}


