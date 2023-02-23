/*
Question : Write a program to print the sum of n natural number by using recursion.
 */
public class Main {
    static void PrintSumOfNaturalNumber(int i,int n,int sum) {
        if (i == n){
          sum += i;
            System.out.println(sum);
          return;
      }
        sum +=  i;
        PrintSumOfNaturalNumber(i+1,n,sum);
    }
    public static void main(String[] args) {
        System.out.println("Printing the result :");
       PrintSumOfNaturalNumber(1,5,0);
    }
}