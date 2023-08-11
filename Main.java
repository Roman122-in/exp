import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double exp = 2.71828;
        double result1 = Math.pow(exp, 5);
        System.out.println(result1);

        Scanner scan = new Scanner(System.in);
        int stepen = scan.nextInt();
        double summa=0;

        for(int i =2; i<14; i++ ){
            summa += Math.pow(stepen,i)/factorial(i);
        }


        System.out.println(summa+1+stepen);
    }

    public static int factorial(int n){
        int result=1;
        for(int i =1; i<=n; i++){
            result = result*i;
        }
        return result;


    }


}
