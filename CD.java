package tuan3;

public class CD {
    private String maCD, tuaCD, caSy;
    private int soBH;
    private double giaThanh;

    public CD(String maCD, String tuaCD, String caSy, int soBH, double giaThanh) {
        this.maCD = maCD;
        this.setTuaCD(tuaCD);
        this.caSy = caSy;
        this.soBH = soBH;
        this.giaThanh = giaThanh;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public CD() {
    }

    public String getTuaCD() {
        return tuaCD;
    }

    // tao rang buoc
    public void setTuaCD(String tuaCD) {
        if (tuaCD != null) {
            this.tuaCD = tuaCD;
        } else {
            System.out.println("Loi");
        }
    }
    
    public String getMaCD() {
        return maCD;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) throws Exception {
        if (giaThanh > 0) {
            this.giaThanh = giaThanh;
        } else {
            throw new Exception("Loi Gia thanh");
        }
   
    }

    public int getSoBH() {
        return soBH;
    }

    public void setSoBH(int soBH) throws Exception {
        if (soBH >= 1) {
            this.soBH = soBH;
        } else {
            throw new Exception("Loi so bao hat");
        }
    
    }

    public void setMaCD(String maCD) throws Exception {
        if (maCD != null) {
            this.maCD = maCD;
        } else {
            throw new Exception("Loi");
        }
    
    }
    
    @Override
    public String toString() {
        return "CD [giaThanh=" + giaThanh + ", maCD" + maCD + ", soBH" + soBH + ", tuaCD=" + tuaCD + "]";
    }
    
}
