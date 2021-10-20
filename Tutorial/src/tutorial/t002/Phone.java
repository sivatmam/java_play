package tutorial.t002;

public class Phone implements PhoneMaker{
    String brand = "";
    int signal = 4;
    int battery = 100;

    public int checkBattery(){
        battery = battery - 2;
        return battery;
    }

    public int checkSignal(){
        signal++;
        if (signal == 5) { signal = 1; }
        return signal;
    }

    public void setBrand(String newValue){
        brand = newValue;
    }

    public void printStatus(){
        System.out.println("Brand: "+brand+
            " Signal: "+signal+
            " Battery: "+battery);
    }

}