import java.util.ArrayList;
import java.util.*;

public class RunningEvent{
    private String runnerName;

    private int time;
    private String eventname;
    boolean hurdles;

    public RunningEvent (String n, boolean h, int time, String name){
        this.eventname = n;
        this.hurdles = h;
        this.runnerName = name;

        int temp = (int)(Math.random()*2)+1;
        int doubletemp = 0;
        if (temp == 1){
           doubletemp+=(int)(Math.random()*4);
        }
        else if (temp == 2){
            doubletemp-=(int)(Math.random()*4);
        }
        this.time=time+doubletemp;
    }

    public String toString(){
        return eventname;
    }
    public String getEventName(){
        return eventname;
    }

    public int getTime(){
        return time;
    }

    public String getRunnerName(){
        return runnerName;
    }
}