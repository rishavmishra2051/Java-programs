package com.exchange;
/*Arrays
 * - Collection of data
 * - Contiguous memory allocation
 * - Random access
 * - Cache friendly
 */
public class M01_arrayCRUD {
    int arr[];
    int currentSize;
    public M01_arrayCRUD(int n){
        this.arr=new int[n];
        this.currentSize=0;
    }
    void insert(int index,int item){
        if(index>currentSize){
            throw new RuntimeException("Index cannot be greater than current size");
        }
        if(index==arr.length){
            System.out.println("Array is full....cannot insert elements");
            return;
        }

        for(int i=currentSize;i>index;i--){
            arr[i]=arr[i-1];     
        }
        
        arr[index]=item;
        currentSize++;
        System.out.println("Element added");
    }
    void delete(int item){
        if(currentSize==0){
            System.out.println("Array is Empty");
            return;
        }
        //Logic
    }
    void update(int index,int item){
        arr[index]=item;
    }
    void search(int item){
        //Linear Search
    }
    void print(){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("==============");
    }
    public static void main(String[] args) {
        M01_arrayCRUD obj = new M01_arrayCRUD(5);
        obj.insert(0,10);
        obj.insert(1,20 );
        obj.insert(2,30 );
        obj.insert(3,40 );
        obj.insert(1,50 );
        obj.print();
    }
}
