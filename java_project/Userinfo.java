
public class Userinfo {
    
    public int userId;
    public String password;
   

    public Userinfo(int userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public String toString() {
        return "userInfo; " + "userId = " + userId + ", password = " + password;
    }

    
    }