class Solution {
    public void merge (int nums[],int si,int mid,int ei){
        int arr[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            long m1=10;
            while(m1<=nums[i]){
                m1*=10;
            }
            long m2=10;
            while(m2<=nums[j]){
                m2*=10;
            }

            long val1=nums[i]*m2+nums[j];
            long val2=nums[j]*m1+nums[i];

            if(val1>=val2){
                arr[k]=nums[i];
                i++;k++;
            }
            else{
                arr[k]=nums[j];
                j++;k++;
            }

        }
        while(i<=mid){
                arr[k]=nums[i];
                i++;k++;
            }
            while(j<=ei){
                arr[k]=nums[j];
                j++;k++;
            }

            int q=si;
            for(int z=0;z<arr.length;z++){
                nums[q]=arr[z];
                q++;
            }
    }
    public void mergeSort(int nums[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+((ei-si)/2);
        mergeSort(nums,si,mid);
        mergeSort(nums,mid+1,ei);
        merge(nums,si,mid,ei);
    }
    public String largestNumber(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<nums.length;i++){
            sb.append(nums[i]);
        }

        if(nums[0]==0){
            return"0";
        }

        else{
            return sb.toString();
        }
        
        
    }
}