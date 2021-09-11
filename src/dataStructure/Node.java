package dataStructure;

/**
 * @Auther:pikaqiu
 * @Date:2021-07-31-07-31-9:11
 * @Description:PACKAGE_NAME
 * @version:1.0
 */
public class Node<T> {
    T data;
    Node<T> next;
    public Node(Node<T> n){
        next=n;
    }
    public Node(Node<T> n,T data){
        this.data=data;
        this.next=n;
    }

    public T getData(){
        return data;
    }

    public Node<T> getNext(){
        return next;
    }


}
