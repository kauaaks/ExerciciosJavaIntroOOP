import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student;
        student = new Student();
        System.out.print("Digite o nome e as notas do aluno: ");
        student.nome = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        System.out.print(student);

        sc.close();
    }
    public static class Student{
        public String nome;
        public double nota1;
        public double nota2;
        public double nota3;

        public double somatoria(){
            return nota1+nota2+nota3;
        }
        public String aprovadoOuNao(){
            double missing = 60.0 - somatoria();
            return (somatoria() >= 60)? "PASS": "FAILED\n MISSING: "+String.format("%.2f",missing)+" POINTS";
        }
        public String toString(){
            return "FINAL GRADE: "+String.format("%.2f",somatoria())+"\n"+aprovadoOuNao();
        }
    }
}
