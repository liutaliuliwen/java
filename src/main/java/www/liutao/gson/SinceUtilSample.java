package www.liutao.gson;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;

/**
 * Created by wxliutao on 2016/12/1.
 */
public class SinceUtilSample {
    /**
     * 基于版本排除
     */
    @Since(4)
    public String since;
    @Until(5)
    public String until;

    public static void main(String[] args) {
        double version = 3.0;
        SinceUtilSample sinceUtilSample = new SinceUtilSample();
        sinceUtilSample.since = "since";
        sinceUtilSample.until = "until";
        Gson gson = new GsonBuilder().setVersion(version).create();
        System.out.println(gson.toJson(sinceUtilSample));

        Gson gson1 = new GsonBuilder()
                .addSerializationExclusionStrategy(new ExclusionStrategy() {
                    //要排除的字段
                    @Override
                    public boolean shouldSkipField(FieldAttributes fieldAttributes) {
                        //true 为排除某个字段
                        if("finalField".equals(fieldAttributes.getName())){
                            return true;
                        }
                        Expose expose = fieldAttributes.getAnnotation(Expose.class);
                        if(expose!=null && expose.deserialize() == false) return true;
                        return false;
                    }
                    //要排除的类
                    @Override
                    public boolean shouldSkipClass(Class<?> aClass) {
                        //直接排除某个类，return true 为排除
                        return (aClass == int.class || aClass == Integer.class);
                    }
                }).create();

    }
}
