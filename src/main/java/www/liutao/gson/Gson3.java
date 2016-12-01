package www.liutao.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Created by wxliutao on 2016/12/1.
 */
public class Gson3 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String jsonArray = "[\"Android\",\"PHP\",\"Java\"]";
        //转化为数组
        String[] strings = gson.fromJson(jsonArray,String[].class);
        //使用泛型
        List<String> stringList = gson.fromJson(jsonArray,new TypeToken<List<String>>(){}.getType());
        System.out.println(strings[0]+strings[1]+strings[2]);
        System.out.println(stringList);
    }

}
