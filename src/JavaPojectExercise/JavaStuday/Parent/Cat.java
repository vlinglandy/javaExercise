package JavaPojectExercise.JavaStuday.Parent;

/**
 * @Auther:pikaqiu
 * @Date:2021-08-16-08-16-16:35
 * @Description:JavaPojectExercise.JavaStuday.Parent
 * @version:1.0
 */
public class Cat {
    int age=12;
    static int num;

    public static void out(){
        Cat cat = new Cat();
        System.out.println(cat.age+num);
    }

    public static void main(String[] args) {
        int a= num;//int b=age;
        Cat c = new Cat();
        c.out();
    }

}
