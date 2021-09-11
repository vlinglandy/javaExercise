package JavaPojectExercise.JavaStuday.International;

import net.sf.cglib.core.Local;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @Auther:pikaqiu
 * @Date:2021-09-02-09-02-7:36
 * @Description:JavaPojectExercise.JavaStuday.International
 * @version:1.0
 */
public class Hello {
    public static void main(String[] args) {
        Locale my = Locale.getDefault();
        ResourceBundle bundle = ResourceBundle.getBundle("mess", my);
        System.out.println(bundle.getString("hello"));

    }
}
