package JavaPojectExercise.BookFiveZiQi;

import b.b.S;

/**
 * @Auther:pikaqiu
 * @Date:2021-08-05-08-05-17:18
 * @Description:JavaPojectExercise.BookFiveZiQi
 * @version:1.0
 */
public enum EnumTest {
    BLACK("●"),WHITE("○");

    private String enumTest;

    private EnumTest(String enumTest){
        this.enumTest=enumTest;
    }

    public String getEnumTest(){
        return this.enumTest;
    }


}
