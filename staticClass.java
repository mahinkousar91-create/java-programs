package staticc;

public class staticClass {
    public int age;
    public static String name="mahin";

    public staticClass(int age) {
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void show(){
        System.out.println(age);
        System.out.println(name);
    }
    static void display(){
        System.out.println(name);

    }
}
