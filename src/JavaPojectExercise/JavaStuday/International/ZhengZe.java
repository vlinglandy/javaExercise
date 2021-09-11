package JavaPojectExercise.JavaStuday.International;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Auther:pikaqiu
 * @Date:2021-09-02-09-02-9:31
 * @Description:JavaPojectExercise.JavaStuday.International
 * @version:1.0
 */
public class ZhengZe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Pattern com = Pattern.compile("153\\d\\d\\d");
        Matcher s1 = com.matcher(s);
        boolean matches = s1.matches();
        System.out.println(matches);
    }
}
