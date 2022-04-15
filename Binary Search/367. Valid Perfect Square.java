class Solution {
    public boolean isPerfectSquare(int num) {
        long lo=1;                                    //here long is used to prevent stack overflow while mid*mid. 
        long hi=num;
        long mid;
        while(lo<=hi){                                // condition for binary search
            mid=lo+(hi-lo)/2;                         // This way we can prevent stack overflow 
            if(mid*mid==num){                         //comparing if mid square = num
                return true;
            }
            else if((mid*mid)>num) {                  //if mid square is>num that means the hi has to be reduced    
                hi=mid-1;
            }
            else{                                     //else if mid< num then the lo has to be incremented.
                lo=mid+1;
            }
        }
        return false;
    }
}
