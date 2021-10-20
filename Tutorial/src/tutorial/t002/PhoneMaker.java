package tutorial.t002;

interface PhoneMaker {
    
    int checkBattery();

    int checkSignal();

    void setBrand(String newValue);

    void printStatus();
}