package www.liutao.gson;

import com.google.gson.Gson;

/**
 * Created by wxliutao on 2016/12/1.
 */
public class Gson2 {
    public static void main(String[] args) {

        Gson gson = new Gson();
        //对象转化为json
        User user = new User();
        user.setName("刘涛");
        user.setAge(30);
        user.setEmailAddress("江苏常州");
        String jsonUser = gson.toJson(user);
        System.out.println(jsonUser);
        //json转化为对象
        User u = gson.fromJson(jsonUser,User.class);
        System.out.println(u);

        String json = "{\"name\":\"liuliwen\",\"age\":30,\"email\":27129773@qq.com}";
        User liutao = gson.fromJson(json,User.class);
        System.out.println(liutao);
    }
}
