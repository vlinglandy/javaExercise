package JavaPojectExercise.JavaStuday.Parent;

/**
 * @Auther:pikaqiu
 * @Date:2021-08-06-08-06-16:31
 * @Description:JavaPojectExercise.JavaStuday.Parent
 * @version:1.0
 */
public class Dog extends Animal{

    public static int age=-1;


    public Dog(){
        //super(13);
        System.out.println("Dog");
    }

    public void small(){
        System.out.println("子类的small方法");
    }

    public static void eat(){
        System.out.println("舔狗");
    }

    public static void main(String[] args) {
        Animal ani = new Dog();
        /*
        1
        two  2
        3  3
           4
         */
        ani.small();
        int i = ani.age;
        ani.eat();
    }
}
