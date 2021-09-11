package dataStructure;

/**
 * @Auther:pikaqiu
 * @Date:2021-08-01-08-01-7:30
 * @Description:PACKAGE_NAME
 * @version:1.0
 */
public class LinkList<T> {
    private int length;
    private Node<T> head;
    private Node<T> rear;
    //private dataStructure.Node<T> next=new dataStructure.Node<T>(null);

    public LinkList(){
        length=0;
        head=new Node<T>(null);
        rear=head.next;
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getRear() {
        return rear;
    }

    public Node<T> getNode(int pos){
        int num=1;
        Node<T> p=head,q=head.next;
        while(num<pos){
            p=q;
            q=q.next;
            num++;
        }
        return q;
    }

    public boolean add(T obj, int pos){
        if(pos<1||pos>length+1){
            System.out.println("pos值不合法");
            return false;
        }
        int num=1;
        Node<T> p=head,q=head.next;
        while(num<pos){
            p=q;
            q=q.next;
            num++;
        }
        Node<T> tNode = new Node<T>(q, obj);
        p.next=tNode;
        length++;
        if(length==pos){
            rear=tNode;
        }
        return true;
    }

    public boolean add(Node<T> n,T obj){
        rear=n;
        rear.data=obj;
        length++;
        return true;
    }

    public boolean delete(int pos){
        int num=1;
        Node<T> p=head,q=head.next;
        while(num<pos){
            p=q;
            q=q.next;
            num++;
        }
        length--;
        p.next=q.next;
        return true;
    }

    public int find(T obj){
        Node<T> p=head.next;
        int num=0,find=0;
        while(p!=null){
            if(p.data==obj)break;
            p=p.next;
            num++;
        }
        return num;
    }

    //比较值getData，推进值
    public T value(int pos){
        Node<T> p=head.next;
        int num=1;
        while(num<pos){
            p=p.next;
            num++;
        }
        return p.data;
    }

    public int size(){
        return length;
    }

    public boolean change(Node<T> n,T d){
        new Node<T>(n,d);
        return false;
    }

    public void clear(){
        length=0;
        head.next=null;
    }
}
