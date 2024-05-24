package javaapplication7;

public class Main {

    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(26, 7, 2003);
        Ngay ngay2 = new Ngay(25, 5, 2023);
        Ngay ngay3 = new Ngay(26, 9, 2021);

        TacGia tg1 = new TacGia("Phung Nam", ngay1);
        TacGia tg2 = new TacGia("Nam ms10", ngay2);
        TacGia tg3 = new TacGia("Huan Rose", ngay3);

        Sach sach1 = new Sach("Anti Hpc", 15000, 2021, tg1);
        Sach sach2 = new Sach("Cach day xam lol", 30000, 2020, tg2);
        Sach sach3 = new Sach("Cach de ko lam ma co an", 40000, 2022, tg3);

        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();

        System.out.println("Kiem tra sach 1 va sach 2 cung nam xuat ban:" + sach1.kiemTraCungNamXuatBan(sach2));
        System.out.println("Kiem tra sach 1 va sach 3 cung nam xuat ban:" + sach1.kiemTraCungNamXuatBan(sach3));

        System.out.println("Gia tien khi giam 10% la: " + sach1.giaTienSauGiam(10));
        System.out.println("Gia tien khi giam 10% la: " + sach2.giaTienSauGiam(10));
        System.out.println("Gia tien khi giam 10% la: " + sach3.giaTienSauGiam(10));
    }

}
