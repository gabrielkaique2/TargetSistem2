import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserir um valor para verificar se existe na sequencia de Fibonacci: ");
        int n = scanner.nextInt();
        System.out.println("Inserir quantidade de termos da sequencia: ");
        int termos = scanner.nextInt();
        //System.out.println(n);

        int t1=0,t2=1;
        System.out.print("Sequencia de Fibonacci: "+t1+" "+t2);
        for(int i=2; i<termos; i++){
            int t3 = t1 + t2;
            System.out.print(" "+t3+" ");

            t1 = t2;
            t2 = t3;

            if(t3==n){
                System.out.println("O valor "+t3+" está na sequencia de Fibonacci");
                break;
            } else if (n<t3){
                System.out.println("O valor "+n+" não está na sequencia de Fibonacci");
                break;
            }
        }
    }
}