package ra.controller;

import ra.service.SingerService;
import ra.service.SongService;
import ra.validate.InputMethods;

import java.util.Scanner;

public class SearchController {
    public  static  void displayMenuSearch(){
//        Scanner sc =new Scanner(System.in);
        while (true){
            System.out.println("*********************SEARCH-MANAGEMENT************************\n" +
                    "1.Tìm kiếm bài hát theo tên ca sĩ hoặc thể loại . [5 điểm]\n" +
                    "2.Tìm kiếm ca sĩ theo tên hoặc thể loại [5 điểm]\n" +
                    "3.Hiển thị danh sách bài hát theo thứ tự tên tăng dần [5 điểm]\n" +
                    "4.Hiển thị 10 bài hát được đăng mới nhất [10 điểm]\n" +
                    "5.Thoát");
            System.out.println("Nhap lua chon");
            byte choice  = InputMethods.getByte();
            switch (choice) {
                case 1:
                    // hien thi
                    SongService.findSongsBySingerNameOrGenre();
                    break;
                case 2:
                    // them moi

                    break;
                case 3:
                    // them moi

                    break;
                case  4:
                    // xóa

                    break;
            }
        }
    }
}
