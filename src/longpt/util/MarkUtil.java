/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpt.util;

/**
 *
 * @author phamt
 */

//class này chứa các hàm tiện ích hỗ trợ phép tính toán 
//vì nó là tiện ích hàm ý dùng chung cho mọi nơi
//do đó chúng nó là static
public class MarkUtil {
    //hàm giai thừa n! = 1, 2, 3,..., n bùng nổ kết quả rất nhanh
    //nên tràn int sớm,  ta trả về long cỡ 15!
    public static long computeFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
