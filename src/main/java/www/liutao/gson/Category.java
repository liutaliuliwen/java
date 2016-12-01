package www.liutao.gson;

import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Created by wxliutao on 2016/12/1.
 */
public class Category {
    @Expose
    private int id;
    @Expose
    private String name;
    @Expose
    private List<Category> children;
    //不需要序列化，不要加expose注解
    private Category parent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Category> getChildren() {
        return children;
    }

    public void setChildren(List<Category> children) {
        this.children = children;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", children=" + children +
                ", parent=" + parent +
                '}';
    }
}
