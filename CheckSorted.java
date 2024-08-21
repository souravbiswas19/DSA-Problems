class CheckSorted
{
    public static boolean checkarray(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i]>=arr[i-1])
            {}
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,1};
        System.out.println(checkarray(arr));
    }
}