package com.main;

import java.util.*;

public class scTest2 {
    static boolean isRunning = true;

    static void programGameSederhana() {
        String jawaban;
        Scanner baca = new Scanner(System.in);

        System.out.println("=== PROGRAM GAME SEDERHANA ===");

        System.out.println("Soal 1: ");
        System.out.println("Apa nama ibukota Australia?: ");
        jawaban = baca.nextLine();

        if (jawaban.equals("canberra")) {
            System.out.print("Jawaabuka mumtaz!");
            System.out.println();
        } else if (jawaban.equals("Canberra")) {
            System.out.print("Jawaabuka mumtaz!");
            System.out.println();
        } else if (jawaban.equals("Sydney")) {
            System.out.print("Jawaban kurang tepat!");
            System.out.println();
        } else if (jawaban.equals("sydney")) {
            System.out.print("Jawaban kurang tepat!");
            System.out.println();
        } else {
            System.out.print("Salah!");
            System.out.println();
        }

        System.out.println("Soal 2: ");
        System.out.println("Apa nama ibukota Malaysia?: ");
        jawaban = baca.nextLine();

        if (jawaban.equals("Kuala Lumpur")) {
            System.out.print("Jawaabuka mumtaz!");
            System.out.println();
        } else if (jawaban.equals("kuala lumpur")) {
            System.out.print("Jawaabuka mumtaz!");
            System.out.println();
        } else if (jawaban.equals("Kuala lumpur")) {
            System.out.print("Jawaabuka mumtaz!");
            System.out.println();
        } else {
            System.out.print("Anda salah!");
            System.out.println();
        }

        System.out.println("Soal 3: ");
        System.out.println("Apa nama ibukota Palestina?: ");
        jawaban = baca.nextLine();

        if (jawaban.equals("Al Quds")) {
            System.out.print("Jawaabuka mumtaz!");
            System.out.println();
        } else if (jawaban.equals("Al quds")) {
            System.out.print("Jawaabuka mumtaz!");
            System.out.println();
        } else if (jawaban.equals("al quds")) {
            System.out.print("Jawaabuka mumtaz!");
            System.out.println();
        } else {
            System.out.print("Salah! Masa ginian aja gak tau");
            System.out.println();
        }
    }

    // Advanced login
    static void programLoginAdvanced() {
        int jawaban;
        Scanner scan = new Scanner(System.in);

        System.out.println("=== PROGRAM LOGIN ===");
        System.out.println("[1] Admin login");
        System.out.println("[2] Not Admin Login");
        System.out.println("[3] Exit");
        System.out.println("Pilihan> ");
        jawaban = scan.nextInt();

        switch(jawaban){
            case 1:
                adminLogin();
                break;
            case 2:
                notAdminLogin();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak ditemukan");
        }
    }

    // advanced login tools 1
    static void adminLogin() {
        String username, password;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("= ADMIN LOGIN =");

        System.out.println("Input username admin: ");
        username = inputUser.nextLine();
        System.out.println("Input password admin: ");
        password = inputUser.nextLine();

        if (username.equals("noname")) {
            if (password.equals("nonamejagocoding")) {
                System.out.println("Selamat datang admin!");
            } else {
                System.out.println("Username / password salah!");
            }
        } else {
            System.out.println("Username / password salah!");
        }
    }

    // advanced login tools 2
    static void notAdminLogin() {
        String username, password;
        Scanner scan = new Scanner(System.in);

        System.out.println("= NOT ADMIN LOGIN =");

        System.out.println("Inputkan username user: ");
        username = scan.nextLine();
        System.out.println("Inputkan password user: ");
        password = scan.nextLine();

        System.out.println("Selamat datang " + username + " harap anda mengingat username dan password anda");
    }

    static void programBuatAkunSederhana() {
        String username, password, email, PasswordEmail;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("= PROGRAM PEMBUATAN AKUN =");

        System.out.println("Inputkan username baru: ");
        username = inputUser.nextLine();
        System.out.println("Inputkan password baru: ");
        password = inputUser.nextLine();
        System.out.println("Inputkan alamat gmail: ");
        email = inputUser.nextLine();
        System.out.println("Inputkan password email: ");
        PasswordEmail = inputUser.nextLine();

        System.out.println("Berhasil! Cek alamat gmail anda untuk melihat hasilnya");
    }

    static void membantuAtauTidak() {
        String jawaban;
        Scanner baca = new Scanner(System.in);

        System.out.println("Apakah program ini membantu?: ");
        jawaban = baca.nextLine();

        if (jawaban.equals("membantu")){
            System.out.println("Terimakasih! :)");
        } else if (jawaban.equals("iya")){
            System.out.println("Terimakasih! :)");
        } else if (jawaban.equals("tidak")) {
            System.out.println(":( Saya akan berusaha meningkatkan program ini!");
        }
    }

    static void beriUlasan() {
        int ulasan;
        Scanner scan = new Scanner(System.in);

        System.out.println("Beri rating: ");
        ulasan = scan.nextInt();

        if (ulasan == 10){
            System.out.println("Ulasan yang hebat! Terimakasih!");
        } else if (ulasan == 9){
            System.out.println("Ulasan yang hebat! Terimakasih!");
        } else if (ulasan == 8){
            System.out.println("Ulasan yang hebat! Terimakasih!");
        } else if (ulasan == 7){
            System.out.println("Tenang saja, saya akan berusaha membuat program ini lebih baik lagi!");
        } else if (ulasan == 6){
            System.out.println("Tenang saja, saya akan berusaha membuat program ini lebih baik lagi!");
        } else if (ulasan == 5){
            System.out.println("Tenang saja, saya akan berusaha membuat program ini lebih baik lagi!");
        } else if (ulasan == 4){
            System.out.println("Tenang saja, saya akan berusaha membuat program ini lebih baik lagi!");
        } else if (ulasan == 3){
            System.out.println("Tenang saja, saya akan berusaha membuat program ini lebih baik lagi!");
        } else if (ulasan == 2){
            System.out.println("Tenang saja, saya akan berusaha membuat program ini lebih baik lagi!");
        } else if (ulasan == 1){
            System.out.println("Tenang saja, saya akan berusaha membuat program ini lebih baik lagi!");
        } else {
            System.out.println("Saya tidak mengerti, harap memberi rating 1-10 tanpa menggunakan koma");
        }
    }

    static void programCalc() {
        char operator;
        float angka1, angka2, hasil;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("== PROGRAM CALC ==");

        System.out.println("Inputkan angka 1: ");
        angka1 = inputUser.nextFloat();
        System.out.println("Inputkan operator: ");
        operator = inputUser.next().charAt(0);
        System.out.println("Inputkan angka 2: ");
        angka2 = inputUser.nextFloat();


        if (operator == '+'){
            System.out.println("== PENJUMLAHAN ==");
            hasil = angka1 + angka2;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '-'){
            System.out.println("== PENGURANGAN ==");
            hasil = angka1 - angka2;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '*'){
            System.out.println("== PERKALIAN ==");
            hasil = angka1 * angka2;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '/'){
            System.out.println("== PEMBAGIAN ==");
            hasil = angka1 / angka2;
            System.out.println("Hasil = " + hasil);
        } else {
            System.out.println("Maaf, inputan anda mungkin salah, harap inputkan operator dengan operator aritmatika");
        }
    }

    // Tools program luas 1
    static void luasPersegi() {
        float sisi1, sisi2, luas;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("== LUAS PERSEGI ==");

        System.out.print("Inputkan sisi 1: ");
        sisi1 = inputUser.nextFloat();
        System.out.print("Inputkan sisi 2: ");
        sisi2 = inputUser.nextFloat();

        luas = sisi1 * sisi2;
        System.out.println("Hasil = " + luas);
    }

    // Tools program luas 2
    static void luasPersegiPanjang() {
        float panjang, lebar, luas;
        Scanner scan = new Scanner(System.in);

        System.out.println("== LUAS PERSEGI PANJANG ==");

        System.out.print("Inputkan panjang: ");
        panjang = scan.nextFloat();
        System.out.print("Inputkan lebar: ");
        lebar = scan.nextFloat();

        luas = panjang * lebar;
        System.out.println("Hasil = " + luas);
    }

    // Tools program luas 3
    static void luasLingkaran() {
        double pi = 3.14;
        double r, luas;
        Scanner baca = new Scanner(System.in);

        System.out.println("== LUAS LINGKARAN ==");

        System.out.print("Inputkan r: ");
        r = baca.nextFloat();

        luas = pi * r * r;
        System.out.println("Hasil = " + luas);
    }

    static void programMenghitungLuas() {
        int pilihan;
        Scanner baca = new Scanner(System.in);

        System.out.println("== MENGHITUNG LUAS ==");

        System.out.println("[1] Luas Persegi");
        System.out.println("[2] Luas Persegi panjang");
        System.out.println("[3] Luas Lingkaran");
        System.out.println("[4] Exit");

        System.out.println("Pilihan> ");
        pilihan = baca.nextInt();

        switch(pilihan){
            case 1:
                luasPersegi();
                break;
            case 2:
                luasPersegiPanjang();
                break;
            case 3:
                luasLingkaran();
                break;
            case 4:
                System.exit(0);
        }
    }

    static void setTarget() {
        String target;
        Scanner a = new Scanner(System.in);

        System.out.println("Set Target: ");
        target = a.nextLine();

        System.out.println("Target diterima, target: " + target);
        System.out.println("Exploit? ");
        target = a.nextLine();

        if (target.equals("iya")){
            System.out.println("Diterima, target " + target);
        }
    }

    static void setWebsiteName() {
        String web, exploit;
        Scanner pe = new Scanner(System.in);

        System.out.println("Set website name: ");
        web = pe.nextLine();

        System.out.println("Target website diterima, target: " + web);
        System.out.println("Exploit? ");
        exploit = pe.nextLine();

        if (exploit.equals("iya")){
            System.out.println("Diterima, target " + web);
        }
    }

    static void setDomain() {
        String jawaban;
        Scanner scan = new Scanner(System.in);

        System.out.println("Set domain: ");
        jawaban = scan.nextLine();

        System.out.println("Diterima, domain " + jawaban);
        System.out.println("Exploit? ");
        jawaban = scan.nextLine();

        if (jawaban.equals("iya")){
            System.out.println("Diterima, target " + jawaban);
        }
    }

    static void programHackSederhana() {
        int pilihan;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("== WELCOME TO LAZZSCRIPTO ==");

        System.out.println("[1] Set Target");
        System.out.println("[2] Set Website Name");
        System.out.println("[3] Set Domain Website Target");
        System.out.println("[4] Exit");

        System.out.println("Pilihan> ");
        pilihan = inputUser.nextInt();

        switch(pilihan){
            case 1:
                setTarget();
                break;
            case 2:
                setWebsiteName();
                break;
            case 3:
                setDomain();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Tidak dimengerti");
        }
    }

    static void programUtama() {
        Scanner scan = new Scanner(System.in);
        int jawaban;


        System.out.println("=== PROGRAM UTAMA ===");

        System.out.println("[1] Program Game Sederhana");
        System.out.println("[2] Program Login Advanced");
        System.out.println("[3] Program Pembuatan Akun Sederhana");
        System.out.println("[4] Program Penjumlahan MTK");
        System.out.println("[5] Program Menghitung Luas");
        System.out.println("[6] Program Hack Sederhana");
        System.out.println("[7] Membantu / tidak");
        System.out.println("[8] Beri ulasan");
        System.out.println("[9] Exit Main Program");

        System.out.print("Pilih program> ");
        jawaban = scan.nextInt();


        switch(jawaban){
            case 1:
                programGameSederhana();
                break;
            case 2:
                programLoginAdvanced();
                break;
            case 3:
                programBuatAkunSederhana();
                break;
            case 4:
                programCalc();
                break;
            case 5:
                programMenghitungLuas();
                break;
            case 6:
                programHackSederhana();
                break;
            case 7:
                membantuAtauTidak();
                break;
            case 8:
                beriUlasan();
                break;
            case 9:
                System.exit(0);
                break;
            default:
                System.out.println("Tidak dimengerti");
        }
    }

    public static void main(String[] args){

        do {
            programUtama();
        } while (isRunning);

    }
}
