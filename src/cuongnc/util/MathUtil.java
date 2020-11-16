/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuongnc.util;

import github.MathUtility;



/**
 *
 * @author nguye
 */
public class MathUtil {
    public static void main(String[] args) {
        long expected = 120;
        
        long actual = MathUtility.getFactorial(5);
        System.out.println("5! expected: "+expected);
        System.out.println("5! actual: "+actual);
        System.out.println("6!: 720, actual: "+MathUtility.getFactorial(6));
        System.out.println("0!: 720, actual: "+MathUtility.getFactorial(0));
        // ném ngoại lệ
        // illigalArguamentException nếu cố tình, người xài hàm này 
        // tham so > 20, tham so < 0
        System.out.println("expected: illigalArguamentException" +MathUtility.getFactorial(-5));
    }
}
