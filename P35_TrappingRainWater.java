package com.exchange;
//Wrong answer
public class P35_TrappingRainWater {
    public class Main {
        public static int trap(int[] height) {
            int n= height.length,count=0;
            int[] prefix = new  int[n];
            int[] p = new  int[n];
            prefix[0]=height[0];
            p[0]=height[n-1];
            //Loop for prefix[]
            for(int i=1;i<n;i++){
                prefix[i]=Math.max(prefix[i-1],height[i]);
                p[i]=Math.max(p[i-1],height[(n-1)-i]);
            }
            //Swap p[] to find suffix[]
            int[] suffix = new  int[n];
            for(int i=0;i<n;i++){
            suffix[i]=p[(n-1)-i];
            }
            for(int i=0;i<n;i++){
                count+= Math.min(prefix[i], suffix[i]) - height[i];
                /*OR this code
                 * int temp=Math.min(prefix[i], suffix[i]);
                if(height[i]<temp){
                    count+=temp-height[i];
                }
                 */
            }
            return count;
        }
    
        public static void main(String[] args) {
            int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
            System.out.println(trap(height));
        }
    }    
}
