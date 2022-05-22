import java.util.ArrayList;
import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<RunningEvent> onehundredmetersHeats = new ArrayList<>();
        ArrayList<RunningEvent> twohundredmetersHeats = new ArrayList<>();
        ArrayList<RunningEvent> fourhundredmetersHeats = new ArrayList<>();
        ArrayList<RunningEvent> eighthundredmetersHeats = new ArrayList<>();
        ArrayList<RunningEvent> sixteenhundredmetersHeats = new ArrayList<>();
        ArrayList<RunningEvent> thirtytwohundredmetersHeats = new ArrayList<>();
        ArrayList<RunningEvent> onetenhurdlesHeats = new ArrayList<>();
        ArrayList<RunningEvent> threehundredhurdlesHeats = new ArrayList<>();
        ArrayList <Athlete> athleteList = new ArrayList<>();
        Scanner scan = new Scanner (System.in);
        System.out.println("Hello! Welcome to Build-A-Track-Meet. Here is the list of possible options:\n\n-Type \"New Athlete\" to create a new athlete\n-Type \"Running Events\" to see a list of potential running events\n-Type \"Simulate Meet\" to simulate a track meet\n-Type \"-1\" to stop\n");
        String userInput = scan.nextLine();
        while (!(userInput.equals("-1"))) {
            userInput = userInput.toLowerCase();
            if (userInput.equals("new athlete")){
                Athlete p;
                System.out.println("Please type a name.");
                String n = scan.nextLine();
                System.out.println("Please type the number of events the athlete will be running.");
                int e = scan.nextInt();
                ArrayList <RunningEvent> tempList = new ArrayList<RunningEvent>();
                System.out.println("Please type the distances of the events the runner will be competing in, one per line. Be sure to include the word meters. If there are hurdles, add an h with no spaces to the end.");
                String typeResult = scan.nextLine();
                for (int i=1; i<=e; i++){
                    System.out.println("Enter next event");
                    typeResult = scan.nextLine();
                    if (typeResult.equals("100 meters")){
                        System.out.println("Please type a time in seconds.");
                        int time = scan.nextInt();
                        RunningEvent r = new RunningEvent ("100 meters", false, time, n);
                        tempList.add(r);
                        onehundredmetersHeats.add(r);
                    }
                    else if (typeResult.equals("200 meters")){
                        System.out.println("Please type a time in seconds.");
                        int time = scan.nextInt();
                        RunningEvent r = new RunningEvent ("200 meters", false, time, n);
                        tempList.add(r);
                        twohundredmetersHeats.add(r);
                    }
                    else if (typeResult.equals("400 meters")){
                        System.out.println("Please type a time in seconds.");
                        int time = scan.nextInt();
                        RunningEvent r = new RunningEvent ("400 meters", false, time, n);
                        tempList.add(r);
                        fourhundredmetersHeats.add(r);
                    }
                    else if (typeResult.equals("800 meters")){
                        System.out.println("Please type a time in seconds.");
                        int time = scan.nextInt();
                        RunningEvent r = new RunningEvent ("800 meters", false, time, n);
                        tempList.add(r);
                        eighthundredmetersHeats.add(r);
                    }
                    else if (typeResult.equals("1600 meters")){
                        System.out.println("Please type a time in seconds.");
                        int time = scan.nextInt();
                        RunningEvent r = new RunningEvent ("1600 meters", false, time, n);
                        tempList.add(r);
                        sixteenhundredmetersHeats.add(r);
                    }
                    else if (typeResult.equals("3200 meters")){
                        System.out.println("Please type a time in seconds.");
                        int time = scan.nextInt();
                        RunningEvent r = new RunningEvent ("3200 meters", false, time, n);
                        tempList.add(r);
                        thirtytwohundredmetersHeats.add(r);
                    }
                    else if (typeResult.equals("110h")){
                        System.out.println("Please type a time in seconds.");
                        int time = scan.nextInt();
                        RunningEvent r = new RunningEvent ("110h", true, time, n);
                        tempList.add(r);
                        onetenhurdlesHeats.add(r);
                    }
                    else if (typeResult.equals("300h")){
                        System.out.println("Please type a time in seconds.");
                        int time = scan.nextInt();
                        RunningEvent r = new RunningEvent ("300h", true, time, n);
                        tempList.add(r);
                        threehundredhurdlesHeats.add(r);
                    }
                    typeResult = scan.nextLine();
                }
                p = new Athlete (n, tempList);
                athleteList.add(p);
                System.out.println("New athlete "+n+" added to the athlete list in the "+p.printEvents()+".");
            }
            else if (userInput.equals("simulate meet")){
                HeatSheet onehdash = new HeatSheet (onehundredmetersHeats, "100 meter dash");
                HeatSheet twohdash = new HeatSheet (twohundredmetersHeats, "200 meter dash");
                HeatSheet fourhdash = new HeatSheet (fourhundredmetersHeats, "400 meter dash");
                HeatSheet eighthrun = new HeatSheet (eighthundredmetersHeats, "800 meter run");
                HeatSheet sixteenrun = new HeatSheet(sixteenhundredmetersHeats, "1600 meter run");
                HeatSheet thirtytworun = new HeatSheet(thirtytwohundredmetersHeats, "3200 meter run");
                HeatSheet onehh = new HeatSheet(onetenhurdlesHeats, "110 meter hurdles");
                HeatSheet threethreezeroh = new HeatSheet(threehundredhurdlesHeats, "300 meter hurdles");
                onehdash.organizeHeatSelectionSort(onehdash.getHeatList());
                twohdash.organizeHeatSelectionSort(twohdash.getHeatList());
                fourhdash.organizeHeatSelectionSort(fourhdash.getHeatList());
                eighthrun.organizeHeatSelectionSort(eighthrun.getHeatList());
                sixteenrun.organizeHeatSelectionSort(eighthrun.getHeatList());
                thirtytworun.organizeHeatSelectionSort(thirtytworun.getHeatList());
                onehh.organizeHeatSelectionSort(onehh.getHeatList());
                threethreezeroh.organizeHeatSelectionSort(threethreezeroh.getHeatList());
                if(onehdash.getHeatList().size()>0) {
                    System.out.println(onehdash.printHeat());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
                if(twohdash.getHeatList().size()>0) {
                    System.out.println(twohdash.printHeat());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
                if(fourhdash.getHeatList().size()>0) {
                    System.out.println(fourhdash.printHeat());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
                if (eighthrun.getHeatList().size()>0) {
                    System.out.println(eighthrun.printHeat());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
                if(sixteenrun.getHeatList().size()>0) {
                    System.out.println(sixteenrun.printHeat());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
                if(thirtytworun.getHeatList().size()>0) {
                    System.out.println(thirtytworun.printHeat());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
                if (onehh.getHeatList().size()>0) {
                    System.out.println(onehh.printHeat());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
                if(threethreezeroh.getHeatList().size()>0) {
                    System.out.println(threethreezeroh.printHeat());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            }
            else if (userInput.equals("running events")){
                System.out.println("Possible Running Events: \n-100 meter dash \n-110 meter hurdles \n-200 meter dash \n-300 meter hurdles \n-400 meter dash \n-800 meter run \n-1600 meter run \n-3200 meter run");
            }
            else
                System.out.println ("Invalid Input");
            System.out.println("\n-Type \"New Athlete\" to create a new athlete\n-Type \"Running Events\" to see a list of potential running events\n-Type \"Simulate Meet\" to simulate a track meet\n-Type \"-1\" to stop\n");
            userInput = scan.nextLine();
        }
        System.out.println ("\nThank you for using the Build-a-Track-Meet Tool");
    }
}