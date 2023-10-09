class Solution {
    public int[] searchRange(int[] nums, int target) {
        int startPos=-1;
        int endPos=-1;
        int first=0;                    
        int last= nums.length-1;      
        int mid=0;
        

//        first position
        while(first<=last) {          
            mid=(first+last)/2;      
            if(target<nums[mid]) {     
                last=mid-1;
            } else if (target>nums[mid]) {     
                first=mid+1;                   
            }
            else if(target==nums[mid]){        
                startPos=mid;
                last=mid-1;
            }
        }

//        last position

        first=0;                    
        last= nums.length-1;

        while(first<=last) {          
            mid=(first+last)/2;      
            if(target<nums[mid]) {     
                last=mid-1;
            } else if (target>nums[mid]) {     
                first=mid+1;                   
            }
            else if(target==nums[mid]){        
                endPos=mid;
                first=mid+1;
            }
        }
        int[] result = {startPos,endPos};

        return result;

    }
}