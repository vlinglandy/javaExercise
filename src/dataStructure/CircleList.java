package dataStructure;

/**
 * @Auther:pikaqiu
 * @Date:2021-08-04-08-04-17:25
 * @Description:PACKAGE_NAME
 * @version:1.0
 */
public class CircleList<T> {
    Node<T> head;
    Node<T> rear;
    int length;

    public CircleList(){
        head=new Node<T>(head);
        rear=head;
        length=0;
    }

    public boolean add(T obj,int pos){
        int num=1;
        Node<T> p=head,q=head.next;
        while (num<pos){
            p=q;
            q=q.next;
            num++;
        }
        Node<T> tNode = new Node<>(q, obj);
        p.next=tNode;
        length++;
        if (q.next==null){
            rear=q;
            rear.next=head;
        }
        return true;
    }


}