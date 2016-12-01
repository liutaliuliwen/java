package www.liutao.gson;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by wxliutao on 2016/12/1.
 */
public class Gson6 {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        User user = new User();
        user.setName("Jack");
        user.setAge(20);
        user.setEmailAddress("China");
        gson.toJson(user,System.out);

        JsonWriter writer = new JsonWriter(new OutputStreamWriter(System.out));
        writer.beginObject()
                .name("name").value("Mike")
                .name("age").value(23)
                .name("email").nullValue()
                .endObject();
        writer.flush();
        writer.close();
    }
}
