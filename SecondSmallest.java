class SecondSmallest
{
    public static int secondSmallest(int arr[])
    {
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < smallest)
            {
                ssmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] > smallest && arr[i] < ssmallest)
            {
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }

    public static void main(String[] args)
    {
        int arr [] = {1, 2, 3, 4, 5};
        System.out.println(secondSmallest(arr));
    }
}