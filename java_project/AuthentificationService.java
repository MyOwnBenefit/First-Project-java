import java.util.*;

public class AuthentificationService {
    
    ArrayList<Userinfo> userInfoList = null;

    //global variables
    int userId;
    String password;

   public AuthentificationService() {

        initialize();

   }

   public void initialize() {
       Userinfo userInfo;

        userInfoList = new ArrayList<Userinfo> ();
        userInfo = new Userinfo(123, "abc");
        userInfoList.add(userInfo);
        userInfo = new Userinfo(1223, "abbc");
        userInfoList.add(userInfo);
   }

   
    boolean validateCredentials(int userId, String password) {
        boolean validate =false;
        Userinfo userInfo;

        for(int i=0; i<userInfoList.size(); i++) {
            userInfo = userInfoList.get(i);
            System.out.println(userInfo.userId + " " + userInfo.password);

            if(userId==userInfo.userId && password.equals(userInfo.password)) {
                validate = true;
                break;
            }
        }
        return validate;
     }

    public void newUser(int userId, String password) {
        Userinfo userInfo = new Userinfo(userId, password);
        userInfoList.add(userInfo);
    }

    public void printUserInfoList() {
        Userinfo userInfo;

        for(int i = 0; i<userInfoList.size(); i++) {
            userInfo = userInfoList.get(i);
            System.out.println(userInfo.userId + userInfo.password);
        }
    }
}



