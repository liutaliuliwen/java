package www.liutao.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wxliutao on 2016/12/1.
 */
public class User {
    private String name;
    private int age;
    //配置序列化的名称以及可选的别名
    @SerializedName(value = "emailddress",alternate = {"email","email_adress"})
    private String emailAddress;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public java.lang.String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
