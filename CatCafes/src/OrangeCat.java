public class OrangeCat extends Cat {
    boolean isFat;

    public OrangeCat(String CatName,int age,String sex,double price,boolean isFat) {
        super(CatName,age,sex, 200);
        this.isFat=isFat;
    }

    @Override
    public  String toString() {
        return "OrangeCat{" +
                "CatName='" + CatName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                ", isFat=" + isFat +
                '}';
    }
}
