import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee funcionario;
        funcionario = new Employee();

        System.out.println("Enter data(name, gross salary, tax): ");
        funcionario.name = sc.nextLine();
        funcionario.grossSalary = sc.nextDouble();
        funcionario.tax = sc.nextDouble();

        System.out.println("Employee: "+funcionario);
        System.out.print("Which percentage to increase salary? ");
        double percent = sc.nextDouble();
        funcionario.IncreaseSalary(percent);
        System.out.println("Update data: "+funcionario);

        sc.close();
    }
    public static class Employee{
        public String name;
        public double grossSalary;
        public double  tax;

        public double netSalary(){
            return grossSalary-tax;
        }
        public void IncreaseSalary(double percentage){
            grossSalary += grossSalary* percentage/100.0;
        }
        public String toString(){
            return name+ ", $ "+String.format("%.2f\n", netSalary());
        }
    }
}
