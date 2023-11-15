import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight1 = scanner.nextInt();
        int weight2 = scanner.nextInt();
        int weight3 = scanner.nextInt();

        int[] FatMansWeight = new int[3];

        FatMansWeight[0] = weight1;
        FatMansWeight[1] = weight2;
        FatMansWeight[2] = weight3;

        int MaxWeight = 0;

        if ((weight1 < 94 || weight1 > 727) || (weight2 < 94 || weight2 > 727) || (weight3 < 94 || weight3 > 727)){
            System.out.println("Error");
        }
        else {
            for (int i = 0; i < FatMansWeight.length; i++) {
                if (FatMansWeight[i] > MaxWeight) {
                    MaxWeight = FatMansWeight[i];
                }
            }
            System.out.println(MaxWeight);

        }
    }
}



