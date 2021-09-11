package JavaPojectExercise.BookFiveZiQi;

import JavaPojectExercise.MyFiveZiQi.NewException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Auther:pikaqiu
 * @Date:2021-08-05-08-05-15:46
 * @Description:JavaPojectExercise.BookFiveZiQi
 * @version:1.0
 */
public class Start {

    private static int size=15;
    private static int[][] flags=new int[size][size];

    public static void main(String[] args) throws IOException {
        String s=null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while ((s = br.readLine())!=null){

            if(!IsOk.judge(s)){
                continue;
            }
            if(IsOk.posX<1||IsOk.posY>size){
                try {
                    throw new BookException();
                } catch (JavaPojectExercise.BookFiveZiQi.BookException e) {
                    e.printStackTrace();
                }
            }

        }

    }


}
