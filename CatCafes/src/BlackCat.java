public class BlackCat extends Cat{
    public BlackCat(String CatName,int age,String sex,double price) {
        super(CatName,age,sex,350);
    }

    @Override
    public String toString() {
        return "BlackCat{" +
                "CatName='" + CatName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                '}';
    }
}
