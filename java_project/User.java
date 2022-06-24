import java.util.*;

public class User extends Person {
    
    ArrayList<Habit> habits;
    int habitNum;
    Coach coach;

    public User( int userID,  String userName,  ArrayList<Habit> habits,  int habitNum) {
        this.ID = userID;
        this.name = userName;
        this.habits = habits;
        this.habitNum = habitNum;
    }

    public User(int userID,  String userName) {
        this.ID = userID;
        this.name = userName;
        habits = new ArrayList<Habit>();
    }

    public String toString() {
        return ID + " " + name + " " ;
    }

    public void printHabits() {
        Habit habit;
        // HabitHistory habitHistory;

        //System.out.println(coach);

        for (int i = 0; i < habits.size(); i++) {
            habit = habits.get(i);
            System.out.println(habit);
            habit.printHabitHistory();
        }
    }

    public void addhabit(final Habit habit) {
        habits.add(habit);

    }

    public void setCoach(final Coach ch) {
        this.coach=ch;
    }

    public void deleteCoach() {
        this.coach=null;
    }

    



  
    // public void newUser(int userId) {
    //     Userinfo userInfo = new Userinfo(userId, null;
    //     userInfoList.add(userInfo);



    // habit = new Habit(habitID, habitName);
    // habits.add(habit);
    // habit = new Habit(habit)

    
    
    // int newUser(String sdd) {

    //     Habit habit1 = new Habit();
    //     habits.add(habit);
    //     Habit habit2 = new Habit();
    //     habits.add(habit2);

    //     for 

    // }
    // String displayHabits() {
    //     return name;
    // }
    
    
}