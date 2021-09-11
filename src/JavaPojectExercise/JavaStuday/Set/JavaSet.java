package JavaPojectExercise.JavaStuday.Set;

import dataStructure.LinkList;

import java.io.*;
import java.util.*;

/**
 * @Auther:pikaqiu
 * @Date:2021-09-02-09-02-10:24
 * @Description:JavaPojectExercise.JavaStuday
 * @version:1.0
 */
public class JavaSet {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.setProperty("I","皮卡秋");
        p.store(new FileOutputStream("a.ini"),"first comments");
        Properties pp = new Properties();
        pp.load(new FileInputStream("a.ini"));
    }

}
