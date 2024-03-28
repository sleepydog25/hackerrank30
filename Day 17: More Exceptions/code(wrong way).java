// Passed it with a wrong way

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int T = s.nextInt();

        for (int i = 0; i<T;i++){
            
            int n = s.nextInt();
            int p = s.nextInt();
            Calculator c = new Calculator (n,p);
            c.countPower();
            
        }
    }
}

class Calculator{
    
    private int T;
    private int n;
    private int p;
    
    public Calculator(int n, int p){
        this.n = n;
        this.p = p;
    }
    
    public void countPower(){
        
        if (n>=0 && p>=0)
          System.out.println((int)Math.pow(n,p));
        else if(n<0 || p<0){
            System.out.println("n and p should be non-negative");
        }
    }   
}
