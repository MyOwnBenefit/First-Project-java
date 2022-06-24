import java.util.*;

public class Coach extends Person {
    ArrayList<User> userList = new ArrayList<User>();


    public Coach (int coachID,String name,ArrayList<User> userList) {
        this.ID=coachID;
        this.name=name;
        this.userList=userList;
    }

    public Coach (int coachID,String name) {
        this.ID=coachID;
        this.name=name;
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void deleteUser(User user) {
        userList.remove(user);
    }

    public void viewUserHabits(User user) {
        for(int i=0; i<userList.size();i++) {
            if(user==userList.get(i)) {
                user.printHabits();
            }
        }
    }

    public void displayAllUsers() {
        User user;
        for(int i=0; i<userList.size();i++) {
            user=userList.get(i);
            user.printHabits();
        }
    }

    public String toString() {
        return "" + ID +name;
    }

    
   


   
}