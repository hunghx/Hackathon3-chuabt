package ra.run;

import ra.controller.SingerController;
import ra.service.SingerService;

import java.util.Scanner;

public class MusicManagement {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------------MUSIC-MANAGEMENT----------------");
            System.out.println("1. Quản lý ca sĩ [20 điểm]\n" +
                    "2. Quản lý bài hát [20 điểm]\n" +
                    "3. Tìm kiếm bài hát [25 điểm]\n" +
                    "4. Thoát [5 điểm]");
            System.out.println("Nhap lua chon");
            byte choice  = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    // singgermanager
                    SingerController.displaySingerManagementMenu();
                    break;
                case 2:
                    break;
            }
        }
    }
}
