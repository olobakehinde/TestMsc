public class reverseint {

    public static void main(String[]args){
        int nn=809;
        System.out.println(f(nn));  

    }
    public static int f(int n){
        int result=0,sighn=1;
        if(n*(-1)>0){
            sighn=-1;
            n*=(sighn);
        }
        for(int i=0;n>0;i++){
            result=result*10+(n%10);
            n/=10;
        }
        return result*(sighn);
        }
}
