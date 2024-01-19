package ra.service;

import ra.model.Singer;
import ra.validate.InputMethods;

import java.util.Scanner;

public class SingerService {
    public static int newId = 4;
    public static Singer[] singers ;
    static {
        singers = new Singer[]{
         new Singer(1,19,"Nguyễn Vn A","Việt Nam","Nhạc vàng",true),
         new Singer(2,21,"Nguyễn Vn B","Việt Nam","Nhạc vàng",true),
         new Singer(3,20,"Nguyễn Vn C","Việt Nam","Nhạc vàng",true)
        };
    }
    public static Singer findById(int id) {
        for (int i = 0; i < singers.length; i++) {
            if (singers[i].getSingerId()==id){
                return singers[i];
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
    public static void addSinger() {
        System.out.println("Nhap so luong can them");
        int n = InputMethods.getInteger();
        Singer[] newSingers =  new Singer[singers.length+n];
        for (int i = 0; i < singers.length; i++) {
            newSingers[i] = singers[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println("nhap thong tin ca si thu "+(i+1));
            Singer singer = new Singer();
            singer.setSingerId(newId++);
            singer.inputData();
            newSingers[singers.length+i] = singer;
        }
        singers = newSingers;
        System.out.println("đã them moi "+n+" ca si");
    }

    public static void deleteSinger(){
        System.out.println("Nhập id can xóa");
        int id =InputMethods.getInteger();
        // kiem tra ton tai
        if (findById(id)==null){
            System.err.println("Khong tim thay id can xoa");
            return;
        }

        Singer[] newSingers = new Singer[singers.length-1];
        int index = 0;

        for (int i = 0; i < singers.length; i++) {
           if (singers[i].getSingerId() != id){
               newSingers[index++] = singers[i];
           }
        }
        singers = newSingers;
        System.out.println("Xóa thành công");
    }

    public static  void editSinger(){
        System.out.println("Nhập id can sửa");
        int id = InputMethods.getInteger();
        // kiem tra ton tai
        Singer editSinger = findById(id);
        if (editSinger ==null){
            System.err.println("Khong tim thay id can sửa");
            return;
        }

        // hiển thi thong tin cũ
        System.out.println("Thông tin cũ của ca sĩ nay");
        editSinger.displayData();
        editSinger.inputData();
        System.out.println("CHỉnh su thanh công");
    }

}
