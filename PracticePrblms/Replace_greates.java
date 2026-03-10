public class Replace_greates {
    public static void main(String[] args)
    {
        Replace_greates dg=new Replace_greates();
        int arr[]={2,4,5,3,1,2};
        int ans[]=dg.replaceElements(arr);
        for(int num:ans)
        {
            System.out.print(num+" ");
        }
    }
     public int[] replaceElements(int[] arr) {
        int n=arr.length;
       // int max=Math.Min();
        for(int i=0;i<n;i++)
        {
            int max=-1;
        for(int j=i+1;j<n;j++)
        {
            if(arr[j]>max)max=arr[j];
            
        }
        arr[i]=max;
            
        }
        return arr;
        
    }
}
