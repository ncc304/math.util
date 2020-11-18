/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util.test;

import cuongnc.util.MathUtil;
import github.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

import static fu.util.test.MathUtilityTest.*;

/**
 *
 * @author nguye
 */
public class MathUtilityTest {
    
    public MathUtilityTest() {}
        // viết ra những CASE xài hàm getFactorial()
        // Kiểm tra xem actual == expected hay ko? như truyền thống bên main()
        // nhưng ở đây xịn sò hơn, showw ra màu xanh&đỏ
        // ngoài ra nó còn dùng cho viẹc CI - Continous Integration
        //                               CD - Continous Delivery
        //                               CT - Continous Regression Test
        //                               DevOps - Development & Operation
        // ngoài doanh nghiệp đang xài
        // app luên tục kiểm tra chất lượng code, build ra file .jar .war
        // đẩy lên 1 server trung gian - STAGING ENVIRONMENT để cho nhóm test sẵn sàng test kĩ
        //sau đó có thể đẩy thẳng lên PRODUCTION SERVER, máy chạy thật ở nơi KHÁCH Hàng
        // mọi việc sẽ bắt đầu kể từ lúc Developer push code liên tục lên GIT
        // mọi thứ có thể tự động, ko cần  con người can thiệp

      @Test // từ khóa này - biến hàm này thành public static void main()
        // EXPECTED VS. ACTUAL qua hàm assertEquals().... mà thư viện cung cấp
        // assert....()dù các loại assert trên cuộc đời - assert (v) so sánh
        // thay vì so sánh = mắt, ta nhờ hàm so sánh giùm, thảy về màu giùm ta
        
        
        
        
        public void getFactorial_RunsWell_ifValidArgument(){
            assertEquals(120, MathUtility.getFactorial(5));
            assertEquals(24, MathUtility.getFactorial(4));
            assertEquals(720, MathUtility.getFactorial(6));
            assertEquals(1, MathUtility.getFactorial(0));
            
            // vietsub: hãy tính giùm t 5! coi nó có là 120 ko ?
            // có thì báo màu xanh, ko thì đỏ
        }
    
    
}
