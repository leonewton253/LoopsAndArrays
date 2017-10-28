public class LoopsAndArrays {
    public static double sqrt(int number) {
	double t;
 
	double squareRoot = number / 2;
 
	do {
		t = squareRoot;
		squareRoot = (t + (number / t)) / 2;
	} while ((t - squareRoot) != 0);
 
	return squareRoot;
}
static boolean isPrime(int n) {
    //check if n is a multiple of 2
    if (n%2==0) return false;
    //if not, then just check the odds
    for(int p=3;p*p<=n;p+=2) {
        if(n%p==0)
            return false;
    }
    return true;
}

    public static void main(String[] args) {
        int[] a = {45, 67, 89, 35, 56};
        int small= Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++)
        if (a[i] < small){
            small = a[i];
            }
        
        
        System.out.println(small);
        for (int i = 0; i < a.length; i++)
        if (   sqrt((a[i] - 1 )) == (int)sqrt((a[i] - 1 ))    ){
            System.out.println("true");
            }
        System.out.println("false");
         int pcount = 0;
         for (int i = 0; i < a.length; i++)
         if (isPrime(a[i]) == true ) {
             pcount +=1;
         }
         pcount+=0;
         
        System.out.println(pcount);
        

        }
}