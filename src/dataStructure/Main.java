package dataStructure;

/**
 * @Auther:pikaqiu
 * @Date:2021-07-28-07-28-11:22
 * @Description:PACKAGE_NAME
 * @version:1.0
 */
public class Main {


    public static <T extends Comparable>void HeBing(SequenceList<T> LA,SequenceList<T> LB,SequenceList<T> LC) {
        int i=0,j=0,k=0;
        while(i<LA.size()&&j<LB.size())
        {
            if (i==LA.size()||j==LB.size()){
                if(i<LA.size()){
                    for(i=i;i<LA.size();i++){
                        LC.add(LA.value(i),k++);
                    }
                }else{
                    for(j=j;i<LB.size();j++){
                        LC.add(LB.value(j),k++);
                    }
                }
            }else{
                if(LA.value(i).compareTo(LB.value(j))<=0)
                {
                    LC.add(LA.value(i),k++);
                    i++;
                }else{
                    LC.add(LB.value(j),k++);
                    j++;
                }
            }

        }

    }
}
