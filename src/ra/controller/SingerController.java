package ra.controller;

import ra.service.SingerService;
import ra.validate.InputMethods;

import java.util.Scanner;

public class SingerController {
    public  static void displaySingerManagementMenu(){
        while (true) {
//            Scanner sc = new Scanner(System.in);
            System.out.println("-------------------SINGER-MANAGEMENT----------------");
            System.out.println("1.Nhập vào số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới (có validate dữ\n" +
                    "liệu nhập vào) [10 điểm]\n" +
                    "2.Hiển thị danh sách tất cả ca sĩ đã lưu trữ [5 điểm]\n" +
                    "3.Thay đổi thông tin ca sĩ theo mã id [10 điểm]\n" +
                    "4.Xóa ca sĩ theo mã id (kiểm tra xem nếu ca sĩ có bài hát thì không xóa được)[5 điểm]\n" +
                    "5.Thoát");
            System.out.println("Nhap lua chon");
            byte choice  = InputMethods.getByte();
            switch (choice) {
                case 1:
                    // hien thi
                    SingerService.addSinger();
                    break;
                case 2:
                    // them moi
                    SingerService.showAllListSinger();
                    break;
                    case 3:
                    // them moi
                    SingerService.editSinger();
                    break;
                case  4:
                    // xóa
                    SingerService.deleteSinger();
                    break;
                case 5:
                    return;
            }
        }
    }
}
