package www.liutao.gson;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Created by wxliutao on 2016/12/1.
 */
public class UserTypeAdapter extends TypeAdapter<User>{
    @Override
    public void write(JsonWriter out,User user) throws IOException {
        out.beginObject();
        out.name("name").value(user.getName());
        out.name("age").value(user.getAge());
        out.name("email").value(user.getEmailAddress());
        out.endObject();
    }

        @Override
        public User read(JsonReader in) throws IOException {
            User user = new User();
            in.beginObject();
            while (in.hasNext()) {
                switch (in.nextName()) {
                    case "name":
                        user.setName(in.nextString());
                        break;
                    case "age":
                        user.setAge(in.nextInt());
                        break;
                    case "email":
                    case "email_address":
                    case "emailAddress":
                        user.setEmailAddress(in.nextString());
                        break;
                }
            }
            in.endObject();
            return user;
        }


}
