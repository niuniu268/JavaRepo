public class Main {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {

                    if (i * 100 + j * 10 + k == Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(k, 3)) {
                        count++;
                        System.out.println(i * 100 + j * 10 + k);
                    }


                }

            }

        }

        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[10];

        System.arraycopy(a, 0, b, 3, 2);
        System.arraycopy(a, 2, b, 2, 2);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }


    }


}