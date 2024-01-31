import java.util.HashMap;

public class IdAndPassword {
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    IdAndPassword(){
        loginInfo.put("Shivi","Shivam");
        loginInfo.put("code","&coffee");
        loginInfo.put("JVM","JDK");
    }
    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
