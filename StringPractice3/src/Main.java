public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3};

        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+", ");
            }

        }
        System.out.print("]");

    }
}