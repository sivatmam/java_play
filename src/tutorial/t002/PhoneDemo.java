package tutorial.t002;

public class PhoneDemo {

    public static void main(String args[]){
        Phone ph1 = new Phone();

        System.out.println("Battery: "+ ph1.checkBattery());
        ph1.setBrand("Samsung Galaxy S 10");
        ph1.printStatus();
    }
}