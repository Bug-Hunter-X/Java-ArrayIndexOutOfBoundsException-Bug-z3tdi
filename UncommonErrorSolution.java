public class UncommonErrorSolution {
    public static void main(String[] args) {
        int[] array = new int[5];
        //Solution: Check array bounds before accessing elements.
        if(0 <= 4 && 4 < array.length){
            System.out.println(array[4]);
        } else{
            System.out.println("Index out of bounds");
        }
    }
}