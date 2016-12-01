package www.liutao.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

/**
 * Created by wxliutao on 2016/12/1.
 */
public class Gson4 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = "{\"code\":10000,\"message\":\"success\",\"data\":{\"name\":\"liuliwen\",\"age\":30,\"email\":27129773@qq.com}}";
        UserResult userResult = gson.fromJson(json,UserResult.class);
        System.out.println(userResult);

        Type userType = new TypeToken<Result<User>>(){}.getType();
        Result<User> userResult1 = gson.fromJson(json,userType);
        User user = userResult1.getData();
        System.out.println(user);
    }
}
