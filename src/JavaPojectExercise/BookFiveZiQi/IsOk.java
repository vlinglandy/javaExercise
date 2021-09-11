package JavaPojectExercise.BookFiveZiQi;

/**
 * @Auther:pikaqiu
 * @Date:2021-08-05-08-05-18:10
 * @Description:JavaPojectExercise.BookFiveZiQi
 * @version:1.0
 */
public class IsOk {

    public static int posX;
    public static int posY;

    public static boolean judge(String s){
        String[] ss = s.split(",");
        try {
            posX = Integer.parseInt(ss[0]);
            posY = Integer.parseInt(ss[1]);
        }catch (NumberFormatException e){
            System.out.println("请以（数字，数字）的格式输入:");
            return false;
        }
        return true;
    }

}
