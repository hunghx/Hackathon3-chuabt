package ra.service;

import ra.model.Song;
import ra.validate.InputMethods;

import java.util.Date;
import java.util.Scanner;

public class SongService implements ISongCrud{
    @Override
    public void display() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    public static Song[] songs ;
    static {
        songs = new Song[]{
                new Song("S001","Em cua hom nay","nothing","Son Tung",SingerService.findById(1),new Date(),true),
                new Song("S002","Con mua ngang qua","nothing","Son Tung",SingerService.findById(2),new Date(),true),
                new Song("S003","Nac choi","nothing","Son Tung",SingerService.findById(3),new Date(),true)
        };
    }

    public  Song findById(String id){
        for (int i = 0; i < songs.length; i++) {
            if (songs[i].getSongId().equals(id)){
                return songs[i];
            }
        }
        return null;
    }

    public static void displayAllListSong(){
        if (songs.length==0){
            System.err.println("danh sach trong");
            return;
        }
        System.out.println("===============Danh sách bài hát===========");
        for (Song song : songs){
            song.displayData();
        }
    }
    public static  void addSong(){
        // kiem tra ca si
        if (SingerService.singers.length==0){
            System.err.println("Chưa có ca sĩ nào, vui lòng thêm ca sĩ trước");
            return;
        }
        System.out.println("Nhap so luong bai hat");
        int n = InputMethods.getInteger();
        Song[] newSongs = new Song[songs.length+n];
        for (int i = 0; i < songs.length; i++) {
            newSongs[i] = songs[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin bai hat thu "+(i+1));
            Song song = new Song();
            song.inputData();
            newSongs[songs.length+i] = song;
        }
        songs = newSongs;
        System.out.println("thêm thanh công");
    }
    public static  void editSong(){
        // kiem tra ca si
        System.out.println("Nhâp id bai hát");
        String id = InputMethods.getString();
        Song editSong = findById(id);
        if (editSong ==null){
            System.err.println("khong tim thay id can sua");
            return;
        }
        System.out.println("thông tin cũ");
        editSong.displayData();
        editSong.inputData();
        System.out.println("Thay đổi thông tin thanh công");
    }
    // tìm kiem bai hat theo ten ca si hoac the loai
    public static void findSongsBySingerNameOrGenre(){
        System.out.println("Nhập chuỗi cần tìm");
        String search = InputMethods.getString();
        boolean flag = true;
        for (Song s : songs) {
            boolean check1 = s.getSinger().getSingerName().toLowerCase().contains(search.toLowerCase());
            boolean check2= s.getSinger().getGenre().toLowerCase().contains(search.toLowerCase());
            if (check1 || check2){
                s.displayData();
                flag = false;
            }
        }
        if (flag){
            System.err.println("Khong tim thây bai hat nao trung khớp");
        }
    }


}
