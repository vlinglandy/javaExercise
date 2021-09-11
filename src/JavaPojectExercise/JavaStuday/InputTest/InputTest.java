package JavaPojectExercise.JavaStuday.InputTest;

import clojure.lang.Var;
import org.junit.Test;

import java.io.*;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

/**
 * @Auther:pikaqiu
 * @Date:2021-08-22-08-22-18:17
 * @Description:JavaPojectExercise.JavaStuday.Parent
 * @version:1.0
 */
public class InputTest {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("C:\\Personal\\Desktop\\Test.txt"));
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

    }

    @Test
    public void testFn1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line=null;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
    @Test
    public void testFn2() throws IOException {
        Map<String, String> env = System.getenv();
        for(String name:env.keySet()){
            System.out.println(name+"----->"+env.get(name));
        }

        System.out.println(env.get("JAVA_HOME"));
        System.out.println(System.getenv("JAVA_HOME"));
        Properties pp = System.getProperties();
        pp.store(new FileOutputStream("C:\\Personal\\Desktop\\System Properties"),"System Properties");
        System.out.println(System.getProperty("os.name"));
    }


}
