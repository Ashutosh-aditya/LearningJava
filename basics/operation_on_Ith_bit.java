public class operation_on_Ith_bit {
    
    public static int getIthBit(int n,int i) {
        int bitmask=1<<i;        
        return (n&bitmask) >0 ? 1: 0;        
    }

    public static int setIthBit(int n,int i) {
        int bitmask=(1<<i);        
        return (n|bitmask);        
    }

    public static int clearIthBit(int n,int i) {
        int bitmask=~(1<<i);        
        return (n&bitmask);        
    }

    public static int updateIthBit(int n,int i,int newBit) {
        n=clearIthBit(n, i); //overriding n value to new cleared value
        int bitmask=(newBit<<i);        
        return (n|bitmask);//as we have cleared the bit in clearIthBit(n, i) taking | will update it to required value
    }
    
    public static int clearLastIthBit(int n,int i) {
        // we need something like 1111111111000000000 to clear last ith bit
        n=clearIthBit(n, i); 
        int bitmask=(-1<<i);        
        return (n&bitmask);
    }

    public static int clearBitsInRange(int n,int i,int j) {
        // we need something like 111100000001111 to clear jth to ith bit range
        // we can generate a like 111100000000000  ->(-1<<j)
        //  and second one b like 000000000001111  -> (1<<i)-1

        n=clearIthBit(n, i);
        int a=(-1<<j+1),b=(1<<i)-1;
        int bitmask=(a|b);        
        return (n&bitmask);
        //take eg oof 10->1010 let i=2,j=4
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(13, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(14, 2));
        System.out.println(clearLastIthBit(15, 1));
        System.out.println(clearBitsInRange(10, 2,4));

    }
}
