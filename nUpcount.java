public class nUpcount {

    public static void main(String[]args){

        int [] array =  {2,3,1,-6,8,-3,-1,2};

        System.out.println(NUpcount(array, 5));

    }
    static int NUpcount(int[]a,int number){
        int count=0;
        int previousSum= 0;
        int firstSum = 0;
        for(int i =0;i<a.length;i++){
            previousSum = firstSum;
            firstSum +=a[i];
            if(previousSum <= number && firstSum >number){
                count++;
            }
        }
        return count;

    }
    
}
