import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rectangle width and height: ");

        Rectangle rectangle = new Rectangle();

        rectangle.height = sc.nextDouble();
        rectangle.width = sc.nextDouble();


        System.out.print(rectangle);

        sc.close();
    }

    public static class Rectangle{
        public double height;
        public double width;

        public double Area(){
            return height * width;
        }
        public double Perimeter(){
            return 2*(height + width);
        }

        public double Diagonal(){
            return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
        }
        public String toString(){
            return "AREA: "+ String.format("%.2f\n", Area())+"PERIMETER: "+String.format("%.2f\n", Perimeter()) +"DIAGONAL: "+String.format("%.2f", Diagonal());
        }
    }
}
