public class Bsearch {
    static int BS(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end)
        {

            mid=start+(end-start)/2;
            if(arr[mid]>target)
            {
                end=mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;
            }
            else if (arr[mid]==target)
            {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={13,17,19,22,25,29,90,99};
        int target=90;
        System.out.println(BS(arr,target));
    }
}


