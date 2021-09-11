package dataStructure;

/**
 * @Auther:pikaqiu
 * @Date:2021-08-04-08-04-17:42
 * @Description:dataStructure
 * @version:1.0
 */
public class NodeTwo<T> {

    private T data;
    private Node<T> n;

    public NodeTwo(Node<T> n){
        this.n=n;
    }

    public NodeTwo(Node<T> n,T obj){
        this.n=n;
        data=obj;
    }

    public Node<T> getNode() {
        return n;
    }

    public T getData(){
        return data;
    }
}
