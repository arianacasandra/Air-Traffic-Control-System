package isp.AirTrafficControlSystem.exercise1;
import java.util.ArrayList;
import java.util.List;
public class ATC {
    List<Aircraft> aircraftList = new ArrayList();

    void addAircraft(String id){
        //TODO
    }

    public void sendCommand(String aircraftID, AtcCommand cmd){
        aircraftList.forEach((a) ->{

            if(a.id.equals(aircraftID)){
                a.reciveAtcCommand(cmd);
                synchronized (a) {
                    a.notify();
                }
            }
        });
    }
}