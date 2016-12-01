package www.liutao.gson;

import com.google.gson.Gson;

/**
 * Created by wxliutao on 2016/12/1.
 */
public class Gson1 {
    public static void main(String[] args) {

        Gson gson = new Gson();
        /**
         * json装java 基本类型
         */

        //json整数转java整数
        int i = gson.fromJson("100",int.class);
        System.out.println(i);
        //json浮点数转java浮点数
        double d = gson.fromJson("300.23",double.class);
        System.out.println(d);
        //json boolean转java boolean
        boolean b = gson.fromJson("true",boolean.class);
        System.out.println(b);
        //json string转java String  注意转译
        String s = gson.fromJson("\"I like it\"",String.class);
        System.out.println(s);

        /**
         * java类型转json
         */

        //数字
        String jsonNumber = gson.toJson(100);
        //boolean
        String jsonBool = gson.toJson(true);
        //String
        String jsonString = gson.toJson("I Like it");
        System.out.println(jsonNumber);
        System.out.println(jsonBool);
        System.out.println(jsonString);

    }
}
