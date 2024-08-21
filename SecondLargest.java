class SecondLargest
{
    public static int secondLargest(int arr[])
    {
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > largest && arr[i] > slargest)
            {
                slargest = arr[i];
            }
        }
        return slargest;
    }

    public static void main(String[] args)
    {
        int arr [] = {1, 2, 3, 4, 5};
        System.out.println(secondLargest(arr));
    }
}