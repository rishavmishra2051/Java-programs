package com.exchange;

public class P21_Bit_manipulation {
    //Get ith bit
    static int Get_ith_bit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    //Set ith bit
    static int Set_ith_bit(int n,int i){
        int bitmask=1<<i;
        return n | bitmask;
    }
    //Clear ith bit
    static int Clear_ith_bit(int n,int i){
        int bitmask=~(1<<i);
        return n & bitmask;
    }
    //Update ith bit
    static int update_ith_bit(int n,int i,int newbit){
        if (newbit==0){
            return Clear_ith_bit(n,i);
        }
        else{
            return Set_ith_bit(n, i);
        }
    }
    //Update ith bit alternate way
    static int update_ith_bit_alternate(int n,int i,int newbit){
        n=Clear_ith_bit(n, i);
        int bitmask=newbit<<i;
        return n | bitmask;
    }
    //Clear last i bits
    static int Clear_last_i_bits(int n,int i){
        int bitmask=((~0)<<i);
        return n & bitmask;
    }
    //Clear range of bits i to j
    static int Clear_range_of_bits(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
    //Power of 2 or not
    static boolean Power_of_2(int n){
        if((n&(n-1))==0){
            return true;
        }
        else{
            return false;
        }
    }
    //Count set bits
    static int Count_set_bit(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    //Fast exponentiation
    static int Fast_exponentiation(int n,int pow){
        int ans=1;
        while(pow>0){
            if((pow & 1)!=0){
                ans = ans*n;
            }
            n=n*n;
            pow=pow>>1;
        }
        return ans;
    }
    //Swap two numbers without using third variable
    static void Swap_number(int a,int b){
        System.out.println("Before Swap "+"a= "+a+" b= "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swap "+"a= "+a+" b= "+b);
    }
    //
    public static void main(String[] args) {
        //Bitwise operator
        //Binary AND
        System.out.println(5&6);
        //Binary OR
        System.out.println(5|6);
        //Binary XOR
        System.out.println(5^6);
        //Binary \One's compliment for x input it gives -(x+1) output
        System.out.println(~5);
        //Binary Left shift a<<b=a*2^b
        System.out.println(5<<2);
        //Binary Right shift a>>b=a/2^b
        System.out.println(5>>2);
        //Get ith bit find value of ith bit is 0 or 1
        System.out.println(Get_ith_bit(10, 2));
        //Set ith bit set value of ith bit 1
        System.out.println(Set_ith_bit(10, 2));
        //Clear ith bit clear value of ith bit 0
        System.out.println(Clear_ith_bit(10, 1));
        //Update ith bit
        System.out.println(update_ith_bit(10, 2, 1));
        //Update ith bit alternate way
        System.out.println(update_ith_bit_alternate(10, 2, 1));
        //Clear last i bits
        System.out.println(Clear_last_i_bits(15, 2));
        //Clear range of bits i to j the value from i to j are convert in 0
        System.out.println(Clear_range_of_bits(10, 2, 4));
        //Power of 2 or not check number is power of 2 or not
        System.out.println(Power_of_2(4));
        //Count set bits in number count no. of 1 in a number
        System.out.println(Count_set_bit(10));
        //Fast exponentiation Calcuate the value of a^n faster by reduce
        //its time complexity O(n) to O(log n)
        System.out.println(Fast_exponentiation(3, 5));
        //Swap two numbers without using third variable
        Swap_number(3, 4);
        //Uppercase to lowercase
        for(char ch='A';ch<='Z';ch++){
            System.out.print((char)(ch|' '));
        } 
    }
}
