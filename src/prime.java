
public class prime {
    
    //checks whether an int is prime or not.
static boolean isPrime(int n) {
    //check if n is a multiple of 2
    if (n%2==0) return false;
    //if not, then just check the odds
    for(int i=3;i*i<=n;i+=2) {
        if(n%i==0)
            return false;
    }
    return true;
}
public static void main(String[] args) {
    System.out.println(isPrime(6));
    
}
}
