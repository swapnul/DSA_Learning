package Math;

//https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Mathematics/problem/digits-in-factorial

/*Given an integer N. Find the number of digits that appear in its factorial. 
Factorial is defined as, factorial(n) = 1*2*3*4……..*N and factorial(0) = 1.*/


class Solution{
    public static int digitsInFactorial(int N){
        // code here
        if(N == 0 || N == 1 || N == 2) return 1;

        double result = 0;
        
        for(int i=1;i<=N;i++){
            result += Math.log10(i);
        }
        result = result+1;
        return (int)Math.floor(result);
    }
    public static void main(String[] args) {
        System.out.println(digitsInFactorial(5)); 
    }
}