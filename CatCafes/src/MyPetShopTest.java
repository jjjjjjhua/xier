import java.time.LocalDate;
import java.util.ArrayList;

public class MyPetShopTest {

    public static void main(String[] args){
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new BlackCat("Shelly",2,"F",350));
        cats.add(new OrangeCat("Jay",3,"M",200,true));
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Mike",2, LocalDate.of(2021,10,21),"13459197399"));
        customers.add(new Customer("Jennie",4,LocalDate.of(2021,10,23),"13950263201"));
        MyPetShop myPetShop = new MyPetShop(300,cats,customers);

        myPetShop.buyCat(new OrangeCat("June",1,"M",200,false));
        myPetShop.buyCat(new BlackCat("May",1,"F",350));

        myPetShop.Service(new Customer("Fei",2,LocalDate.now(),"1312197399"));
        myPetShop.Service(new Customer("Mike",3,LocalDate.now(),"13459197399"));
        myPetShop.Closed();
    }
}
