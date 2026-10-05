package org.example.campsitemanagementsystem;

public class LinkedList<T> {

    private Node<T> head;
    private int size;

    public LinkedList(){
        head = null;
        size=0;
    }

    public void add(T data){
        Node<T> newNode= new Node<>(data);

        if(head==null){
            head = newNode;
        }
        else{
            Node<T> current = head;

            while(current.getNext()!=null){
                current=current.getNext();
            }
            current.setNext(newNode);
        }
        size ++;
    }

    public T get(int i){
        Node<T> current = head;
        int count = 0;
        while(current!=null){
            if(count==i){
                return current.getData();
            }
        }
        return current.getData();
    }

    public String listElements(){
        String result = "";
        Node<T> current = head;

        while(current!=null){
            result += current.getData();

            if(current.getNext()!=null){
                result += ", ";
            }
            current = current.getNext();
        }
        return result;
    }

    public String listObjectElements() {
        String result = "";
        Node<T> current = head;

        while (current != null) {
            result += current.getData().toString() + "\n";
            current = current.getNext();
        }

        return result;
    }

    //get size



}
