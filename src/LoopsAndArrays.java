public class LoopsAndArrays {

    public static void main(String[] args) {
        int[] a = {45, 67, 89, 35, 56};
        int small= Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++)
        if (a[i] < small){
            small = a[i];

            }
        System.out.println(small);


//        System.out.println("Smallest positive value: "+ small );
//        System.out.println("Prime count: "+ prime);
//        System.out.println("Conatins a square plus one "+square);
//        System.out.println("Two elements with product equal to array sum: "a+""+b);

        }
}