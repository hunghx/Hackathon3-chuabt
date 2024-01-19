package ra.service;

import ra.model.Singer;

import java.util.Scanner;

public class SingerService {
    public static int newId = 1;
    public static Singer[] singers = new Singer[0];
    public static Singer findById(int id) {
        for (Singer singer : singers) {
            if (singer.getSingerId()==id) {
                return singer;
            }
        }
        return null;
    }
    public static void showAllListSinger(){
        if (singers.length==0){
            System.err.println("danh sách rỗng");
        }
        else {
            System.out.println("-------Danh sach ca sĩ---------");
            for (Singer singer : singers) {
                singer.displayData();
            }
        }
    }
    public static void addSinger(Scanner sc) {
        System.out.println("Nhap so luong can them");
        int n = Integer.parseInt(sc.nextLine());
        Singer[] newSingers =  new Singer[singers.length+n];
        for (int i = 0; i < singers.length; i++) {
            newSingers[i] = singers[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println("nhap thong tin ca si thu "+(i+1));
            Singer singer = new Singer();
            singer.setSingerId(newId++);
            singer.inputData(sc);
            newSingers[singers.length+i] = singer;
        }
        singers = newSingers;
        System.out.println("đã them moi "+n+" ca si");
    }

}
