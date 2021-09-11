package JavaPojectExercise.MyFiveZiQi;

/**
 * @Auther:pikaqiu
 * @Date:2021-08-04-08-04-19:18
 * @Description:JavaPojectExercise
 * @version:1.0
 */
public class NewException extends Exception {

    public NewException(int size){

        System.out.println("发生异常，棋盘边长为："+size);

    }

}
