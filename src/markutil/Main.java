/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markutil;

import static longpt.util.MarkUtil.computeFactorial;

/**
 *
 * @author phamt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5! = " + computeFactorial(5));
        
        //Expected: hi vọng đưa về  720 khi đưa số 6
        System.out.println("6! = " + computeFactorial(6));
        //Expected: hi vọng đưa về  1 khi đưa số 1
        System.out.println("1! = " + computeFactorial(1));
        //Expected: hi vọng đưa về  1 khi đưa số 0
        System.out.println("0! = " + computeFactorial(0));
        //Expected: hi vọng đưa về  ngoại lệ khi đưa số -5
        System.out.println("-5! = " + computeFactorial(-5));
        // hello test change 
        //Để test phần mềm ta làm việc sau
        //1. Chuẩn bị data ví dụ 5, 6, 7, 1, 2,...
        //2. Tính toán bằng tay trước xem 5! là bằng mấy, 6! là bằng mấy
        //ví dụ tính 6! là 720, 720 gọi là giá trị kì vọng EXPECTED VALUE
        
        //3. Gọi lệnh, gọi app, gọi hàm chạy thử với data đã chuẩn bị
        //coi xem hàm trả về số mấy kết quả mấy,
        // ví dụ khi chạy hàm cF(6) mà nó trả về 120, thì giá trị trả về
        // khi chạy hàm gọi là ACTUAL VALUE
        
        //4. cái hồi mình phải so sánh xem EXPECTED và ACTUAL có trùng nhau hay ko
        // nếu trùng: tức là hàm xử lí ra kết quả như mình dự kiến -> hàm chạy đúng
        // nếu ko trùng : mình tính sai, hay hàm tính sai , nói chung là sai
        
        //TEST: BẢN CHẤT LÀ CHẠY THỬ APP/HÀM, SO SÁNH KẾT QUẢ KÌ VỌNG CÓ TRƯỚC
        //VỚI KẾT QUẢ HÀM THỰC SỰ XỬ LÍ VÀ TRẢ VỀ
        
        //Có cách viết đơn giản nhưng chưa hay
        //Mình phải tự so sánh bằng mắt giá trị tự trả về của hàm và kì vọng 
        //Nó ko cấm mình disable nút Clean and Build -> code sai logic mà vẫn ra được file jar.war
        //Ta cần cách khác để đảm bảo chất lượng code ngay khi viết code 
        //ta cần dùng thêm thư viện hỗ trợ để kiểm tra chất lượng của hàm 
        //đó là kĩ thuật TDD kèm UNIT TESTING
        // xài thư viện JUnit, NUnit, TestNG, xUnit, MsUnit,...
        //những thưu viện này ko bắt mình phải so sánh bằng mắt các ACTUAL vs EXPECTED
        //nó tự so sánh giùm và nó QUĂNG VỀ 2 THỨC: XANH, ĐỎ
        //XANH: CODE ỔN
        //ĐỎ: CODE SAI LOGIN 
    }

}
