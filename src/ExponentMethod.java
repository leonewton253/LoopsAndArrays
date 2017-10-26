
public class ExponentMethod {
    
    public static int pow(int a, int b) {
        if (b == 0) return 1;
        int result = 1;
        while (b > 0) {
            result = a * result;
            b =  b -1;
            
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(pow(2,10));
    }
}
