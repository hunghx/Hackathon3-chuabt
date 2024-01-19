package ra.model;

import ra.service.SingerService;
import ra.service.SongService;
import ra.validate.Validate;

import java.util.Date;
import java.util.Scanner;

public class Song {
    private String songId,songName,descriptions,songWriter;
    private  Singer singer;
    private Date createdDate;
    private boolean songStatus;

    public Song() {
    }

    public Song(String songId, String songName, String descriptions, String songWriter, Singer singer, Date createdDate, boolean songStatus) {
        this.songId = songId;
        this.songName = songName;
        this.descriptions = descriptions;
        this.songWriter = songWriter;
        this.singer = singer;
        this.createdDate = createdDate;
        this.songStatus = songStatus;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songWriter) {
        this.songWriter = songWriter;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isSongStatus() {
        return songStatus;
    }

    public void setSongStatus(boolean songStatus) {
        this.songStatus = songStatus;
    }
    public  void inputData(Scanner sc){
        // kiem tra ca si
        if (SingerService.singers.length==0){
            System.err.println("Chưa có ca sĩ nào, vui lòng thêm ca sĩ trước");
            return;
        }
        // nhập thông tin
        System.out.println("Nhập song id");
        while (true) {
            this.songId = sc.nextLine();
            if (!Validate.checkSongId(songId)){
                if (SongService.findById(songId)==null){
                    break;
                }
                System.err.println("id đã tồn tại");
            }else {
                System.err.println("Không đúng dịnh dạng");
            }

        }
        System.out.println("Nhap ten bai hat");
        this.songName = sc.nextLine();
        System.out.println("Nhap mô ta");
        this.descriptions = sc.nextLine();
        System.out.println("Nhap tac gia");
        this.songWriter = sc.nextLine();
        System.out.println("Nhap trang thai");
        this.songStatus = Boolean.parseBoolean(sc.nextLine());
        //hien thi danh sach ca si
        System.out.println("danh sách ca si :");
        for (Singer s:  SingerService.singers){
            System.out.println(s);
        }
        while (true) {
            System.out.println("Nhap id ca si");
            int id = Integer.parseInt(sc.nextLine());
            Singer singer = SingerService.findById(id);
            if (singer != null) {
                this.singer = singer;
                break;
            }
            System.err.println("id không tồn tại, nhập lại");
        }
        this.createdDate = new Date();

    }
    public  void displayData(){
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("ID : %3s | SongName : %15s | Descriptions : %20s | SongWriter : %10s | Status : %5s | SingerName : %15s \n",
                songId,songName,descriptions.substring(0,15)+"...",songWriter,songStatus?"active":"inActive",singer.getSingerName());
    }
}
