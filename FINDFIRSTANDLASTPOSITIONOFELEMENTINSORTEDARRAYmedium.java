class FINDFIRSTANDLASTPOSITIONOFELEMENTINSORTEDARRAYmedium {
    public int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        result[0]=binarySearch(nums,target,true);
        if(result[0]==-1){
            return result;
        }
        result[1]=binarySearch(nums,target,false);
        return result;

    }
    private int binarySearch(int[] nums,int target,boolean findfirst){
        int low=0;
        int high=nums.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                result=mid;
                if(findfirst){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
}