import java.util.ArrayList;
import java.util.*;

public class Athlete {
    private String name;
    private ArrayList <RunningEvent> athleteEvents;

    public Athlete (String n, ArrayList <RunningEvent> listEvents){
        name = n;
        athleteEvents = (ArrayList)listEvents.clone();
    }

    public String printEvents(){
        String out = "";
        if (athleteEvents.size() == 1)
            out += athleteEvents.get(0);
        else{
            for (int i=0; i<athleteEvents.size()-1;i++){
                out += athleteEvents.get(i) +", ";
            }
            out+= "and "+athleteEvents.get(athleteEvents.size()-1);
        }
        return out;
    }
}
