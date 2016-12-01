package www.liutao.gson;

import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by wxliutao on 2016/12/1.
 */
public class Gson5 {
    public static void main(String[] args) throws IOException {
        String json = "{\"name\":\"刘涛\",\"age\":30,\"emailAddress\":\"江苏常州\"}";
        User user = new User();
        //手动反序列化
        JsonReader jsonReader = new JsonReader(new StringReader(json));
        jsonReader.beginObject();
        while(jsonReader.hasNext()){
            String s = jsonReader.nextName();
            switch (s) {
                case "name":
                    user.setName(jsonReader.nextString());
                    break;
                case "age":
                    user.setAge(jsonReader.nextInt());
                    break;
                case "emailAddress":
                    user.setEmailAddress(jsonReader.nextString());
                    break;
            }
        }
        jsonReader.endObject();
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getEmailAddress());
    }
}
