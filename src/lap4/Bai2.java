/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap4;

public class Bai2 {
    public class SinhVienPoly {
        private String hoTen;
        private String nganh;

        public SinhVienPoly() {
        }

        public SinhVienPoly(String hoTen, String nganh) {
            this.hoTen = hoTen;
            this.nganh = nganh;
        }

        public double getDiem() {
            double diem = 0;
            return diem;
        }

        public double getHocLuc(double diem) {
            System.out.println("Học lực: ");
            if (0<=diem && diem<=10) {
            if (diem<5) {System.out.println("Yếu");}
            else if (5<=diem && diem<6.5) {System.out.println("Trung bình");}
            else if (6.5<=diem && diem<7.5) {System.out.println("Khá");}
            else if (7.5<=diem && diem<9) {System.out.println("Giỏi");}
            else {System.out.println("Xuất sắc");}
            }
            else {System.out.println("Nhập lại điểm");}
            return diem;
        }  
    }
            
}