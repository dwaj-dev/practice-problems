public class AgnosticBsearch {

    static int BS(int[] arr,int target)
    {
//        1st we have to find weather arraty is sorted in ascending or descending order
        boolean isAscending = arr[0] < arr[arr.length -1];
        int start = 0;
        int end = arr.length-1;
        while(start <= end)
        {
            int mid = start +(end - start)/2;
            if (arr[mid]==target)
            {
                return mid;
            }
            if(isAscending)
            {
                if(arr[mid]>target)
                {
                    end = mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else
            {
                if(arr[mid]>target)
                {
                    start = mid +1;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,11,13,17};
        int[] newarr={-13,-11,-5,-2,0,11,16,88,987};
        int target=11;
        System.out.println(BS(arr,target));
        System.out.println(BS(newarr,target));
    }
}
