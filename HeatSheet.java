import java.util.ArrayList;
import java.util.*;

public class HeatSheet {
    private ArrayList<RunningEvent> heatList;
    private String eventName;

    public HeatSheet (ArrayList<RunningEvent> runnersAndTimes, String e){
        heatList = (ArrayList)runnersAndTimes.clone();
        eventName = e;
    }

    public ArrayList<RunningEvent> getHeatList (){
        return heatList;
    }
    public static void organizeHeatSelectionSort(ArrayList<RunningEvent> h) {
        for (int i = 0; i < h.size(); i++) {
            int min = h.get(i).getTime();
            int minId = i;
            for (int j = i+1; j < h.size(); j++) {
                if (h.get(j).getTime() < min) {
                    min = h.get(j).getTime();
                    minId = j;
                }
            }
            RunningEvent temp = h.get(i);
            h.set(i, h.get(minId));
            h.set(minId, temp);
        }
    }
    public String printHeat(){
        String output = "--------"+eventName+"--------";
        for (int i = 0; i<heatList.size(); i++){
            int minutes = heatList.get(i).getTime()/60;
            int seconds = heatList.get(i).getTime()%60;
            output+="\n"+(i+1)+". "+heatList.get(i).getRunnerName()+"     "+minutes+":"+seconds;
        }
        return output;
    }
}
