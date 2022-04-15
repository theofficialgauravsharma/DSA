class Solution {
    public int mySqrt(int target) {
        long lo=1,hi=target/2,mid;
        if(target==1){
            return 1;
        }
        while(lo<=hi){                          //Condition of binary search 
            mid=lo+(hi-lo)/2;
            if(mid*mid==target){                //To prevent the overflow mid*mid used the "long"
                return (int)mid;
            }
            else if(mid*mid > target){          //answer lies on the left
                hi=mid-1;
            }
            else{                               //answer lies on the right
                lo=mid+1;
            }
        }
     return (int)hi;                            //when hi<li returning hi
    }
}
