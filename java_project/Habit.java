public class Habit {
    int habitID;
    String habitName;
    HabitHistory habitHistory;
    
    public Habit(int habitID, String habitName, HabitHistory habitHistory) {
        this.habitID = habitID;
        this.habitName = habitName;
        this.habitHistory = habitHistory;
    }

    public Habit(int habitID, String habitName) {
        this.habitID = habitID;
        this.habitName = habitName;
        habitHistory = new HabitHistory(habitID);
    }

    //Habit habit =new Habit(habitID, habitName);

    public String toString() {
        return habitName;
    }

    public void displayHabit() {
       System.out.println(habitID + habitName);
    }

    public void printHabitHistory() {
        System.out.println(habitHistory.habitID);
        habitHistory.printHabitHistory();

    }

    public void addCheckin(Checkin checkin) {
        habitHistory.addCheckin(checkin);
    }

    // void deleteHabit(String habitname, int habitiD) {
    //     //erase habit
    // }

}