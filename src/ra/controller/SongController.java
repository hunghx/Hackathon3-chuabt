package ra.controller;

import ra.service.SingerService;
import ra.service.SongService;
import ra.validate.InputMethods;

import java.util.Scanner;

public class SongController {
    public  static void displaySongManagementMenu(){
//        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-------------------SONG-MANAGEMENT----------------");
            System.out.println("1.Nhập vào số lượng bài hát cần thêm và nhập thông tin cần thêm mới (có validate dữ\n" +
                    "liệu nhập vào) [10 điểm]\n" +
                    "2.Hiển thị danh sách tất cả bài hát đã lưu trữ [5 điểm]\n" +
                    "3.Thay đổi thông tin bài hát theo mã id [10 điểm]\n" +
                    "4.Xóa bài hát theo mã id [5 điểm]\n" +
                    "5.Thoát");
            System.out.println("Nhap lua chon");
            byte choice  = InputMethods.getByte();

            switch (choice) {
                case 1:
                    // hien thi
                    SongService.addSong();
                    break;
                case 2:
                    // them moi
                    SongService.displayAllListSong();
                    break;
                case 3:
                    // them moi
                    SongService.editSong();
                    break;
                case  4:
                    // xóa

                    break;
                case 5:
                    return;

            }
        }
    }
}
