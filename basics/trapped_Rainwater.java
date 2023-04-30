public class trapped_Rainwater {

    public static int rainWater(int height[])
    {
        int totalRainWater=0;
        int n = height.length,
        lmb[] = new int[n],
        rmb[] = new int[n],
        totalHeight[] = new int[n],
        waterheight[] = new int[n];
        lmb[0] = height[0];
        rmb[n-1] = height[n-1];

        for(int i=1; i<n; i++)
        {
            if(lmb[i-1]>height[i])
                lmb[i] = lmb[i-1];
            else
                lmb[i] = height[i];
        }

        for(int i=(n-2);i>=0;i--)
        {
            if(rmb[i+1]>height[i])
                rmb[i] = rmb[i+1];
            else
                rmb[i] = height[i];
        }

        for(int i=0;i<n;i++)
        {
            totalHeight[i]=Math.min(lmb[i],rmb[i]);
            waterheight[i]=totalHeight[i]-height[i];
            totalRainWater=totalRainWater+waterheight[i];
        }

        // FOR DEBUGGING TO CHECK IF ALL ARRAYS HAVE CORRECT VALUES OR NOT 
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(lmb[i]+" - ");
        // }
        // System.out.println(" ");

        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(rmb[i]+" + ");
        // }
        // System.out.println(" ");
        
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(totalHeight[i]+" * ");
        // }
        // System.out.println(" ");

        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(waterheight[i]+" = ");
        // }
        // System.out.println(" ");

        return totalRainWater;
    }


    public static void main(String[] args) {
        int ar[]={4,2,0,6,3,2,5};
        System.out.println("Total RainWater Accumulated : "+rainWater(ar));
    }
}
