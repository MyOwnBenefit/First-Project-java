// import java.util.*;

public class Checkin {
    
    public int habitCheckinID;
    public String checkinDate;
    //ArrayList<Comment> comment;

    // void addComment(Comment comment1) {
    //     comment= new ArrayList<Comment> ();
    //     comment.add(comment1);
        
    // }

    public Checkin(int habitCheckinID, String checkinDate) {
        this.habitCheckinID = habitCheckinID;
        this.checkinDate = checkinDate;
    }

    public String toString() {
        return "" + habitCheckinID + checkinDate;
    }

    // public void displayCheckin(int habitCheckinID) {

    // }

}