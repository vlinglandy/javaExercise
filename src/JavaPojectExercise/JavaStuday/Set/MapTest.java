package JavaPojectExercise.JavaStuday.Set;

import org.jetbrains.annotations.NotNull;

import java.util.TreeMap;

/**
 * @Auther:pikaqiu
 * @Date:2021-09-03-09-03-17:41
 * @Description:JavaPojectExercise.JavaStuday.Set
 * @version:1.0
 */
class Map implements Comparable {
    int count=1;

    public Map(int cou){
        this.count=cou;
    }

    public boolean equals(Object o){
        Map m=(Map)o;
        if(this==o){
            return true;
        }
        if(o.getClass()==this.getClass()&&m.count==this.count){
            return true;
        }
        return false;
    }


    public int compareTo(Object o) {
        Map m=(Map)o;

        return this.count>m.count?1:this.count==m.count?0:-1;
    }
}

public class MapTest{

    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
    }
}
