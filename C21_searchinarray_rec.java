package com.exchange;

public class C21_searchinarray_rec {
    static int search(int arr[],int index,int searchvalue){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==searchvalue){
            return index;
        }
        return search(arr, index+1, searchvalue);
    }

    //No. of occurance
    static int[] occurancesearch(int arr[],int index,int searchvalue,int occurancecount){
        if(index==arr.length){
            int IndexArray[]=new int[occurancecount];
            return IndexArray;
        }
        if(arr[index]==searchvalue){
            int IndexArray[]=occurancesearch(arr, index+1, searchvalue, occurancecount+1);
            IndexArray[occurancecount]=index;
            return IndexArray;
        }
        return occurancesearch(arr, index+1, searchvalue,occurancecount);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println(search(arr, 0, 10)>=0?"Found":"Not Found");
        int a[]={10,20,30,40,40,40,40,50,40,60};
        int indexArray[]=occurancesearch(a, 0, 40, 0);
        for(int e:indexArray){
            System.out.println(e);
        }
    }
}
