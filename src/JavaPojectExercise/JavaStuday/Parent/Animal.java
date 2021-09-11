package JavaPojectExercise.JavaStuday.Parent;

import org.apache.coyote.OutputBuffer;

/**
 * @Auther:pikaqiu
 * @Date:2021-08-06-08-06-16:31
 * @Description:JavaPojectExercise.JavaStuday.Parent
 * @version:1.0
 */
public class Animal  {

    public static int age=1;

    public Animal(){
        System.out.println("无参构造方法");
    }

    public static void eat(){
        System.out.println("不一定怎么吃");
    }


    public void small(){
        System.out.println("嗅觉");
    }
}
