public class UncommonErrorExample {
    public static void main(String[] args) {
        int[] array = new int[5];
        //Error: accessing array element outside the bounds.
        System.out.println(array[5]); 
    }
}