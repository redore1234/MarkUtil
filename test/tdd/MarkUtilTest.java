/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import longpt.util.MarkUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phamt
 */
public class MarkUtilTest {

    @Test
    public void testSuccessfulCases() {
        //hàm này test những tình huống thành công tức là đưa đầu vào tử tế cho hàm cF() (tính giai thừa)
        Assert.assertEquals(55, 55);
        Assert.assertEquals(1, MarkUtil.computeFactorial(1));
        Assert.assertEquals(2, MarkUtil.computeFactorial(2));
        Assert.assertEquals(6, MarkUtil.computeFactorial(3));
        Assert.assertEquals(24, MarkUtil.computeFactorial(4));
        Assert.assertEquals(120, MarkUtil.computeFactorial(5));
        
    }

    //@Test biến hàm thành 1 hàm main() riêng biệt và Shift F6 chạy
    //cmt @Test phế hàm này thành hàm bt, ko được chạy trong lần Shift F6
    //trò này do thư viện JUnit nó bày ra, bày thêm màu sắc XANH ĐỎ VÀNG
    
//    @Test(expected = NumberFormatException.class)
    @Test(expected = IllegalArgumentException.class)
    public void testFailCases() {
        //hàm này test những tình huống cà chớn và đưa đầu vào cà cớn
        //ví dụ cF(-1) sao mà tính được và cF(20) to quá
        //Ngoại lệ là 1 thứ không thể so sánh
        //Exception là 1 tình huống ko dữ liệu đc, do đó ko có value
        //do đó kko thể so sánh được nên ko dùng hàm assertEquals được 
        //vì nó so sánh value theo màu săsc
        //vậy ta phải xài chiêu khác khi chơi với ngoại lệ
        // kì vọng rằng khi đưa ra cF(-5) thì hàm cF() này sẽ ném ra cái ngoại lệ 
        //thông báo ra tham số cà chớn
        //câu này viết thế nào trong code để ra màu xanh hay đỏ
        MarkUtil.computeFactorial(-5); //ra màu đỏ vì nó ko ra lỗi như expected trên line 35
    }
}

//dù code bạn sai logic nhưng bạn vẫn ra đc file .jar, .war khi Clean & Build
//nguy hiểm, ko tốt 
//ta sẽ chơi trò disable nút Clean & Build nếu code còn đang màu đỏ
//chơi với JUnit thì làm được trò này
//chơi truyền thống sout() JOptionPane, ghi ra file log môn JavaWeb thì kiểu nào cũng ra được file .jar, .war nếu ko sai cú pháp
//hãy nhớ 2 con số nếu xài NB 8.2 1005, NB 10 trở lên,
