package www.liutao.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxliutao on 2016/12/1.
 */
public class Gson8 {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
        Category category = new Category();
        category.setName("电脑");
        category.setId(1);
        List<Category> children = new ArrayList<Category>();
        Category categoryChild1 = new Category();
        categoryChild1.setId(100);
        categoryChild1.setName("笔记本");
        categoryChild1.setParent(category);
        Category categoryChild2 = new Category();
        categoryChild2.setId(101);
        categoryChild2.setName("台式机");
        categoryChild2.setParent(category);
        children.add(categoryChild1);
        children.add(categoryChild2);
        category.setChildren(children);
        String json = gson.toJson(category);
        System.out.println(json);



    }
}
