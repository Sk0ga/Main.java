package cs.vsu.ru.skogorevma.gr12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
    int r1;
        System.out.print("Введите r1: ");
        r1 = scan.nextInt();
    double s1 = Math.PI * r1 * r1;

    int r2;
        System.out.print("Введите r2: ");
        r2 = scan.nextInt();
    double s2 = Math.PI * r2 * r2;

    double s_shaded = (s2 - s1) * 3/8 ;

    int r3;
        System.out.print("Введите r3: ");
        r3 = scan.nextInt();
    double s3 = Math.PI * r3 * r3;

    int side_square = 2 * r3;
    int s_square = side_square * side_square;
    double s_shaded_square = (s_square - s3) * 2/8;

    double s_figure = s_shaded + s_shaded_square ;
        System.out.print(s_figure);
    }
}
