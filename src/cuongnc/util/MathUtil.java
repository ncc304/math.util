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
        
        System.out.println("hi");
    }
}
// Muốn kết luận hàm ngon, phải test các trường hợp sài hàm
// mình phải thiết kế các testcase, tình huống test để sau đó mình verify
// giữa giá trị trả về của hàm (actual) có khớp với expected cái mình dự đoán hàm chạy phải trả về
// và nếu mọi thứ khớp, tức là actual == expected, mình mới dám nói hàm ngon
// Cách này có nhược điểm: nhìn bằng mới và so sánh kết quả của từng test case
// Cách nâng cao
// Cũng nhìn bằng mắt, nhưng chỉ nhìn 2 màu xanh - đỏ cho một test case
// có nghĩa: nếu bạn xài hàm với 100 tham số , chạy hàm 100 tình huống khác nhau
// Xanh, CODE ổn cho 1 test case, Mọi tình huống gọi hàm
// Mọi case phải có expected = Actual thì mới xanh
// Đỏ, niuh case màu xanh, chỉ có ít nhất 1 thằng đỏ, kết luận cả hàm đó
//      hàm đúng cho 99 trường hợp, expected = actual cho 99% tình huống
//      chỉ có 1 tình huống sai, ko khớp, kết luận luôn, hàm ko ổn định
//      ai dám xài khi ko ổn định, ổn định và chính xác phải cho mọi case
// Chỉ cần ít nhất 1 cái ko ổn,

