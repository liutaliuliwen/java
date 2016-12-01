package www.liutao.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by wxliutao on 2016/12/1.
 */
public class Gson9 {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Kimi");
        user.setAge(10);
        user.setEmailAddress("say@gamil.com");
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(User.class,new UserTypeAdapter())
                .create();
        System.out.println(gson.toJson(user));
    }
}
