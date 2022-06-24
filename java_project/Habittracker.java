import java.util.*;

public class Habittracker {

    // public Habit h1;
    // public Checkin c1;

    AuthentificationService authentificationService = new AuthentificationService();

    void registerUser() {
        int userId;
        String password;
        Scanner scan = new Scanner(System.in);

        System.out.println("ID입력");
        userId = scan.nextInt();
        System.out.println("password입력");
        password = scan.next();

        authentificationService.newUser(userId, password);
        authentificationService.printUserInfoList();

        scan.close();
    }

    // void displayError() {
    // System.out.println("error 다시 입력하세요");
    // }
    // void enterNewHabit() {
    // System.out.println("Habit 를 입력하세요");
    // h1.habitName = scan.next();
    // }

    // void displayEnterNewHabit() {
    // enterNewHabit();
    // }

    // void addComment() {

    // }

    // void checkinPushNotification (int userID) {

    // }

    // void getHabitCheckinID() {}
    // c1.habitCheckinID =
    public void login() {
        int userId;
        String password;
        boolean validate = false;
        // boolean NewUser = false;

        AuthentificationService authentificationService = new AuthentificationService();

        Scanner scan = new Scanner(System.in);

        System.out.println("사용자 아이디를입력하시오");
        userId = scan.nextInt();
        System.out.println("사용자 비밀번호를 입력하시오");
        password = scan.next();

        scan.close();

        validate = authentificationService.validateCredentials(userId, password);

        System.out.println(validate);
    }

    // public Checkin getHabitCheckin(Checkin checkin) {
    //     HabitHistory habitHistory = new HabitHistory();
    //     Checkin checkin1;
    //     for(int i=0; i<habitHistory.habitCheckins.size(); i++) {
    //         checkin1 = habitHistory.habitCheckins.get(i);

    //        if(checkin1.equals(checkin)) {
            
    //        }
    //        break;
    //     }

        public void viewHabitHistory() {

        }
        
       
    // }

    public void isThatRight() {
        Userinfo userinfo1, userinfo2;
        
        userinfo1 = new Userinfo(11,"dd");
        userinfo2 = new Userinfo(11,"dd");

        if(userinfo1.equals(userinfo2)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }

    public static void main(String[] args) {
     

        // Habittracker habittracker = new Habittracker();
        

        // habittracker.login();
        // habittracker.registerUser();

        SataStore sataStore = new SataStore();
        //sataStore.printUserList();

        // sataStore.addHabit("dd", "final");
        // sataStore.displayHabits(1);

        User user = sataStore.inDataBase(112);
        System.out.println(user);
        user.printHabits();
        // habittracker.isThatRight();
        
        
    

    }
}
