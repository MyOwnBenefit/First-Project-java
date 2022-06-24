import java.io.*;

import java.util.*;

public class SataStore {
    ArrayList<User> userList=null;
    ArrayList<Coach> coachList=null;

    public SataStore() {
        initialize();
    }

    public void initialize() {
       
        userList =new ArrayList<User>();
        readFile("n.txt");
    }

    public void readFile(String filename) {
        User user = null;
        Habit habit = null;
        Checkin checkin = null;


        try {
            FileReader fr = new FileReader(filename);
            BufferedReader bfr = new BufferedReader(fr);

            String line = bfr.readLine();

            

            while(line != null){
                StringTokenizer str = new StringTokenizer(line, ",");
                
                while(str.hasMoreTokens()) {
                    String temp = str.nextToken();
                    
                    if(temp.equals("User")) {
                   
                        int id = Integer.parseInt(str.nextToken());
                        String name = str.nextToken();

                        user = new User(id,name);
                        userList.add(user);


                    }else if(temp.equals("Habit")){
                        
                       int id = Integer.parseInt(str.nextToken());
                       String name = str.nextToken();

                       habit = new Habit(id,name);
                       user.addhabit(habit);
                        

                    }else if(temp.equals("Checkin")){

                        int id = Integer.parseInt(str.nextToken());
                        String name = str.nextToken();

                        checkin = new Checkin(id,name);
                        habit.addCheckin(checkin);

                    



                    }
                    
                
                }
               
                line = bfr.readLine();
            }

        }catch(IOException e){
            System.err.println(e);
        }

    }

    // public void createUser() {

    // ArrayList<Habit> habits;
    // // ArrayList<Habit> habits1;
    // ArrayList<Checkin> habitCheckins, habitCheckins1;

    // Habit habit;
    // User user;
    // int habitNum;
    // HabitHistory habitHistory;
    // Checkin checkin;
    // Coach coach;
    // habits = new ArrayList<Habit>();
    // habitCheckins = new ArrayList<Checkin>();
    // habitCheckins1 = new ArrayList<Checkin>();

    // coach = new Coach(77,"김삿갓");

    // checkin = new Checkin(34, 14);
    // habitCheckins.add(checkin);
    // checkin = new Checkin(35, 14);
    // habitCheckins.add(checkin);
    // habitHistory = new HabitHistory(1, habitCheckins);

    // habit = new Habit(11, "b1", habitHistory);
    // habits.add(habit);

    // checkin = new Checkin(32, 27);
    // habitCheckins1.add(checkin);
    // checkin = new Checkin(33, 27);
    // habitCheckins1.add(checkin);
    // habitHistory = new HabitHistory(2, habitCheckins1);

    // habit = new Habit(12, "c1", habitHistory);
    // habits.add(habit);

    // habitNum = habits.size();

    // userList = new ArrayList<User>();
    // user = new User(1, "dd", habits, habitNum);
    // userList.add(user);
    // user.setCoach(coach);

    // coachList = new ArrayList<Coach>();
    // coachList.add(coach);

    // // habits1 = new ArrayList<Habit> ();
    // // habit = new Habit(13, "d1");
    // // habits1.add(habit);
    // // habit = new Habit(14, "e1");
    // // habits1.add(habit);
    // // habitNum = habits.size();

    // // user = new User(2,"ddd",habits1, habitNum);
    // // userList.add(user);

    // }

    public void printUserList() {
        User user;

        for (int i = 0; i < userList.size(); i++) {
            user = userList.get(i);
            System.out.println(user);
            user.printHabits();
        }
    }

    public void displayHabits(int UserID) {
        User user;

        for (int i = 0; i < userList.size(); i++) {
            user = userList.get(i);

            if (UserID == user.ID) {
                user.printHabits();
            }
        }

    }

    // public void addHabit(String name,String habit) {
    // User user;
    // Habit habit11;

    // for(int i=0; i<userList.size(); i++) {
    // user = userList.get(i);

    // if(name.equals(user.name)) {
    // habit11 = new Habit(13, habit);
    // user.addhabits(habit11);

    // }
    // }
    // }

    public User inDataBase(int UserID) {
        User user = null;
        User userTemp;

        for (int i = 0; i < userList.size(); i++) {
            userTemp = userList.get(i);

            if (UserID == userTemp.ID) {
                user = userTemp;
                break;
            }
        }
        return user;
    }

    public void addUserToCoach(int userID, Coach coach) {
        User user;
        for (int i = 0; i < userList.size(); i++) {
            user = userList.get(i);

            if (userID == user.ID) {
                user.setCoach(coach);
                coach.addUser(user);
            }

        }
    }

    public void deleteUserToCoach(int userID) {
        User user;

        for (int i = 0; i < userList.size(); i++) {
            user = userList.get(i);

            if (userID == user.ID) {
                user.deleteCoach();
                user.coach.deleteUser(user);
            }

        }

    }

    // public void printCheckinList(User user) {
    // Checkin checkin;
    // // HabitHistory habitHistory;
    // Habit habit;

    // habits = new ArrayList<Habit>();

    // System.out.println(user);
    // for (int k = 0; k < habits.size(); k++) {
    // habit = habits.get(k);
    // System.out.println(habit);
    // System.out.println(habit.habitHistory.habitID);

    // for (int i = 0; i < habit.habitHistory.habitCheckins.size(); i++) {
    // checkin = habit.habitHistory.habitCheckins.get(i);
    // System.out.println(checkin);

    // }

    // }
    // }

}
