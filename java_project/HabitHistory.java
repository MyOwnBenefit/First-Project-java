import java.util.*;

public class HabitHistory {
    int habitID;
    ArrayList<Checkin> habitCheckins;

    public HabitHistory( int habitID, ArrayList<Checkin> habitCheckins) {
        this.habitID=habitID;
        this.habitCheckins=habitCheckins;
    }

    public HabitHistory( int habitID) {
        this.habitID=habitID;
        habitCheckins = new ArrayList<Checkin>();
    }

    public void newCheckin(Checkin checkin) {
        habitCheckins = new ArrayList<Checkin> ();
        habitCheckins.add(checkin);
    }

    public void addCheckin(Checkin checkin) {
        habitCheckins.add(checkin);
    }
    public void displayHistory(ArrayList<Checkin> habitCheckins) {
        habitCheckins = new ArrayList<Checkin> ();


       
        // checkin1.displayCheckin();

        
       

    }

    public void printHabitHistory() {
        
        Checkin check;

        
    for(int i=0; i<habitCheckins.size(); i++) {
        check=habitCheckins.get(i);
        System.out.println(check.checkinDate);
        System.out.println(check.habitCheckinID);
    }

    

}

 }