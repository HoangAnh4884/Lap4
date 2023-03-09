/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap4;

public class Bai3 {
    public class SinhVienIT extends Bai2.SinhVienPoly {
        private double diemJava;
        private double diemCss;
        private double diemHtml;

        public SinhVienIT() {
        }

        public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen) {
            this.diemJava = diemJava;
            this.diemCss = diemCss;
            this.diemHtml = diemHtml;
        }

        public double getDiemJava() {
            return diemJava;
        }

        public double getDiemCss() {
            return diemCss;
        }

        public double getDiemHtml() {
            return diemHtml;
        }
        
        public double getDiem(double dC, double dJ, double dH, double diem) {
            diem = (2*dJ + dH + dC)/4;
            return diem;
        }
    }
    
    public class SinhVienBiz extends Bai2.SinhVienPoly {
        private double diemMarketing;
        private double diemSale;

        public SinhVienBiz() {
        }

        public SinhVienBiz(double diemMarketing, double diemSale, String hoTen) {
            this.diemMarketing = diemMarketing;
            this.diemSale = diemSale;
        }

        public double getDiemMarketing() {
            return diemMarketing;
        }

        public double getDiemSale() {
            return diemSale;
        }
        
        public double getDiem(double dM, double dS, double diem) {
            diem = (2*dM +dS)/3;
            return diem;
        }
    }
}
