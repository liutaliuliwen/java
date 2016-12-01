package www.liutao.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by wxliutao on 2016/12/1.
 */
public class Gson7 {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                //序列化null
                .serializeNulls()
                //设置序列化日期格式
                .setDateFormat("yyyy-MM-dd")
                //禁止内部类序列化
                .disableInnerClassSerialization()
                //产生不可执行的json
                .generateNonExecutableJson()
                //禁止转义HTML
                .disableHtmlEscaping()
                //格式化输出
                .setPrettyPrinting()
                .create();

        User user = new User();
        user.setName("Jack");
        user.setAge(20);
        user.setEmailAddress("China");
        System.out.println(gson.toJson(user));

    }
}
