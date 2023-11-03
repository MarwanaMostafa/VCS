import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> userInfo = new HashMap<>();
        userInfo.put("UserName", "Marwan Mostafa");
        userInfo.put("Age", "30");
        userInfo.put("MobileNumber", "123-456-7890");
        userInfo.put("Address", "123 Main St");

        printUserInfo(userInfo);

    }

    public static void printUserInfo(HashMap<String, String> userInfo){

          for (Map.Entry<String, String> entry : userInfo.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " is: " + value);
        }

    }

}

