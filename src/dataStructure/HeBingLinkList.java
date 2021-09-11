package dataStructure;

/**
 * @Auther:pikaqiu
 * @Date:2021-07-30-07-30-17:53
 * @Description:PACKAGE_NAME
 * @version:1.0
 */
public class HeBingLinkList {

    public static <T extends Comparable>void HeBing(LinkList<T> LA, LinkList<T> LB, LinkList<T> LC){
        int i=1,j=1,k=1;
        Node<T> pa,pb,pc;
        pa=LA.getHead().next;
        pb=LB.getHead().next;
        pc= LC.getHead();
        while (pa.next!=null&&pb.next!=null){
            if(pa.data.compareTo(pb.data)<=0){
                pc.next=pa;
                pc=pa;
                pa=pa.next;
            }else{
                pc.next=pb;
                pc=pb;
                pb=pb.next;
            }
        }
        while (pa!=null){
            pc.next=pa;
            pc=pa;
            pa=pa.next;
        }
        while (pb!=null){
            pc.next=pb;
            pc=pb;
            pb=pb.next;
        }
        LA.clear();
        LB.clear();
    }


}
