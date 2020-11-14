/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

/**
 *
 * @author nguye
 */
public class MathUtility {
    
    private static final double PI = 3.1415;
    
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20) 
        // throws
        if(n == 0 || n == 1)
            return 1; // đặc biệt, return luôn
        // viết else ở đây, trừ điểm
        // mặc nhiện CPU đến đc đây là hiểu rằng n = 2->20
        long result = 1;
        for(int i = 2; i <= n; i++){
            result += i;
        }
        return result;
    }
}
