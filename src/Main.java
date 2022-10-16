public class Main {
    public static void main(String[] args) {
        int[] newMassiv = new int[]{1, 2, 3};
        for (int i = 0; i < 3; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(newMassiv[i]);


        }
        System.out.println();

        double[] newmassiv2 = new double[]{1.57, 7.654, 9.986};
        for (int a = 0; a < 3; a++) {
            if (a > 0) {
                System.out.print(", ");
            }
            System.out.print(newmassiv2[a]);

        }
        System.out.println();


        int[] newmassiv3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int c = 0; c < 10; c++) {
            if (c > 0) {
                System.out.print(", ");
            }
            System.out.print(newmassiv3[c]);
        }


        System.out.println();

        for (int i = newMassiv.length - 1; i >= 0; i--) {
            System.out.print(newMassiv[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int a = newmassiv2.length - 1; a >= 0; a--) {
            System.out.print(newmassiv2[a]);
            if (a > 0) {
                System.out.print(", ");
            }

        }
        for (int c = newmassiv3.length - 1; c >= 0; c--) {
            System.out.print(newmassiv3[c]);
            if (c > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i =0; i < newMassiv.length; i++) {
           if(newMassiv[i]%2 !=0)
           {newMassiv[i]++;}
            if (i > 0) {
                System.out.print(", ");}
                System.out.print(newMassiv[i]);

        }



    }
}
