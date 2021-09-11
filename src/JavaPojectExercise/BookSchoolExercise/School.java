package JavaPojectExercise.BookSchoolExercise;

/**
 * @version 1.0
 */
public class School {

    /**
     *
     */

    int studentNumber;

    /**
     *
     */
    public void challenge(){
        System.out.println("School has a challenge");
    }

    /**
     *
     */
    public void takeMoney(){
        MainTeacher.monthMoney+=1000;
        Teacher.MonthMoney+=500;
    }

    /**
     *
     * @param name
     */
    public void addStudent(String name){
        Student st = new Student();
        st.getName()[st.getName().length]=name;
    }

}
