package dataStructure;

import sun.java2d.pipe.AAShapePipe;
import sun.security.util.Length;

import java.util.List;

/**
 * @Auther:pikaqiu
 * @Date:2021-07-30-07-30-8:30
 * @Description:PACKAGE_NAME
 * @version:1.0
 */
public class SequenceList<T> {
    final int MaxSize = 10;
    private int length;
    public int size(){
        return length;
    }
    private T[] ListArray;
    public SequenceList(){
        //初始化顺序表
        length = 0;
        ListArray=(T[])new Object[MaxSize];
    }

    public T value(int obj){
        return ListArray[obj];
    }

    public SequenceList(int n){
        if(n<0){
            System.out.println("error");
            System.exit(1);
        }
        length = 0;
        ListArray = (T[])new Object[n];
    }

    public boolean add(T obj,int pos){
        if(pos<1||pos>length+1){
            System.out.println("pos值不合法");
            return false;
        }
        if(length==ListArray.length){
            T[] p = (T[])new Object[length*2];
            for (int i = 0; i < length; i++) {
                p[i]=ListArray[i];
            }
            ListArray = p;
        }
        for (int i = length; i < pos; i++) {
            ListArray[i]=ListArray[i-1];
        }
        ListArray[pos-1]=obj;
        length++;
        return true;
    }

    public boolean delete(int pos){
        if(pos<1||pos>length){
            System.out.println("error");
            return false;
        }
        for(int i=pos-1;i<length-1;i++){
            ListArray[i]=ListArray[i+1];
        }
        ListArray[length-1]=null;
        length--;
        return true;
    }

    public int find(T obj){
        if(length==0){
            System.out.println("顺序表为空");
            return -1;
        }
        for(int i=0;i<length-1;i++)
        {
            if(obj==ListArray[i])
            {
                return i;
            }
        }
        return -1;
    }
}
