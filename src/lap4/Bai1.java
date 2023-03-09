/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap4;

public class Bai1 {
    
    public class ChuNhat {
        private double rong;
        private double dai;

        public ChuNhat() {
        }

        public ChuNhat(double rong, double dai) {
            this.rong = rong;
            this.dai = dai;
        }

        public double getRong() {
            return rong;
        }

        public double getDai() {
            return dai;
        }
    }
    
    public class Vuong extends ChuNhat {
        private double canh;

        public Vuong() {
        }

        public Vuong(double canh) {
            this.canh = canh;
        }

        public Vuong(double canh, double rong, double dai) {
            super(rong, dai);
            this.canh = dai;
            this.canh = rong;
        }        
    }
    
}