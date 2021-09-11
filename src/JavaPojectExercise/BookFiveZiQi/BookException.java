package JavaPojectExercise.BookFiveZiQi;

/**
 * @Auther:pikaqiu
 * @Date:2021-08-06-08-06-9:38
 * @Description:JavaPojectExercise.BookFiveZiQi
 * @version:1.0
 */
public class BookException extends Exception{

    public BookException(){
        System.out.println("输入的坐标越界，请重新输入");
    }
}
