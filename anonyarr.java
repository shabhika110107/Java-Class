class anonyarr {
    public static void main (String[] args)
    {
        sum(new int[] {1,2,3});
    }
    public static void sum(int[] a)
    {
        int total = 0;
        for(int i : a) {
            total += i;
        }
        System.out.println("The sum is : " + total);
     }
}