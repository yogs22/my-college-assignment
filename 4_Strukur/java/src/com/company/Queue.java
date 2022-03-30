package com.company;

public class Queue {

    int data[];
    int head = 0;
    int tail = -1;

    public Queue(int size) {
        data = new int[size];
    }

    public boolean isEmpty(){
        if(tail==-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(tail==data.length-1){
            return true;
        }else{
            return false;
        }
    }

    public void masuk(int baru){
        if(isEmpty()){
            tail = head;
            data[tail] = baru;
        }else if(!isFull()){
            tail++;
            data[tail] = baru;
        }else if(isFull()){
            System.out.println("antrian sudah penuh");
        }
    }

    public int keluar(){
        int temp = data[head];
        for(int i=head;i<=tail-1;i++){
            data[i] = data[i+1];
        }
        tail--;
        return temp;
    }

    public void tampilkan(){
        if(!isEmpty()){
            int index = head;
            while(index <= tail){
                System.out.print("|"+data[index]+"| ");
                index++;
            }
            System.out.println();
        }else{
            System.out.println("Kosong");
        }
    }
}
