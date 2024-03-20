package ch4;

/**
 * 参数为引用类型时，传递的是对象的引用
 */
public class PassReference {
    public static void main(String[] args) {
        Animal p = new Animal();
        String bob = "Bob";
        p.setName(bob); // 传入bob变量
        System.out.println(p.getName()); // "Bob"
        bob = "Alice"; // bob改名为Alice
        System.out.println(p.getName()); // "Bob"还是"Alice"?
    }
}
class Animal {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}