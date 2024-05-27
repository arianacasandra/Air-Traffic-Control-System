package isp.AirTrafficControlSystem.exercise1;

public class Exercise1 {

    public static void main(String[] args)  throws InterruptedException{

        Aircraft a1 = new Aircraft("air001");
        ATC atc = new ATC();
        atc.aircraftList.add(a1);

        new Thread(a1).start();

        Thread.sleep(15000);
        atc.sendCommand("air001",new TakeoffCommand(3000));
    }
}