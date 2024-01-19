package ra.model;

import java.util.Scanner;

public class Singer {
    private int singerId,age;
    private String singerName,nationality,genre;
    private boolean gender;

    // constructor


    public Singer() {
    }

    public Singer(int singerId, int age, String singerName, String nationality, String genre, boolean gender) {
        this.singerId = singerId;
        this.age = age;
        this.singerName = singerName;
        this.nationality = nationality;
        this.genre = genre;
        this.gender = gender;
    }
    // getter/setter

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void inputData(Scanner sc){

        System.out.println("Nhập Tên");
        while (true) {
            this.singerName = sc.nextLine();
            if (!singerName.trim().isBlank()){
                break;
            }
            System.err.println("khong duoc de trong");
        }
        System.out.println("Nhập tuỏi");
        while (true) {
            this.age = Integer.parseInt(sc.nextLine());
            if (age>0){
                break;
            }
            System.err.println("tuoi phai lon hon 0");
        }
        System.out.println("Nhập quốc tích");
        this.nationality = sc.nextLine();
        System.out.println("Nhập giơ tính");
        this.gender = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập thê laoi");
        this.genre = sc.nextLine();
    }
    public void displayData(){
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("ID : %-3s | Name : %-15s | Age : %-3s | Genre : %-10s | Sex : %-5s | National : %-15s \n",
                singerId, singerName, age, genre, gender?"Nam":"Nữ", nationality);
    }
    public String toString(){
        return String.format("ID : %3s | Name : %15s\n",
                singerId, singerName);
    }
}
