package isp.AirTrafficControlSystem.exercise1;
public class AtcCommand {
}

class TakeoffCommand extends AtcCommand{

    public int altitude;
    public TakeoffCommand(int altitude){
        this.altitude=altitude;
    }
}
class LandCommand extends AtcCommand{}