package tuan3;

public class TestCD {

    public static void main(String[] args) throws Exception {
        CD cd1 = new CD();
        cd1.setMaCD("123456789");
        cd1.setTuaCD("Mua Xuan");
        cd1.setSoBH(7);
        cd1.setGiaThanh(50000);
        System.out.println(cd1);
    }
}