package JavaPojectExercise.BookSchoolExercise;

/**
 * @Auther:pikaqiu
 * @Date:2021-08-09-08-09-10:07
 * @Description:JavaPojectExercise.BookSchhoolExercise
 * @version:1.0
 */
public class Student extends Person {

    int grade;
    String[] name;

    public Student(){
        name=new String[100];
        grade=11;
    }
    public void work(){
        System.out.println("学生的工作就是写作业");
    }

    public String[] getName(){
        return name;
    }

}
