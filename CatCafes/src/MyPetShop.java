import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class MyPetShop implements PetShop {
    double balance;
    ArrayList<Cat> Cats = new ArrayList<Cat>();
    ArrayList<Customer> Customers = new ArrayList<Customer>();

    public MyPetShop(double balance, ArrayList<Cat> cats, ArrayList<Customer> customers) {
        this.balance = balance;
        Cats = cats;
        Customers = customers;
    }

    private void getCatMsg(Cat cat){
        if(cat instanceof OrangeCat){
            System.out.println(cat);
        }
        if(cat instanceof BlackCat){
            System.out.println(cat);
        }
    }

    @Override
    public void buyCat(Cat newCat) throws InsufficientBalanceException {
        if(newCat instanceof OrangeCat){
            if(balance>=newCat.price){
                System.out.println("购买成功");
                balance-= newCat.price;
                Cats.add(newCat);
            }else{
                try{
                    throw new InsufficientBalanceException("余额不足");
                }catch(InsufficientBalanceException e){
                    e.printStackTrace();
                }

            }
        }

        if(newCat instanceof BlackCat){
            if(balance>=newCat.price){
                System.out.println("购买成功");
                balance-= newCat.price;
                Cats.add(newCat);
            }else{
                try{
                    throw new InsufficientBalanceException("余额不足");
                }catch(InsufficientBalanceException e){
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public void Service(Customer newCustomer) {
        Customers.add(newCustomer);
        System.out.println(newCustomer);
        for(int i=0;i<newCustomer.times;i++){
            Random random = new Random();
            int getCat=random.nextInt(Cats.size());
            getCatMsg(Cats.get(getCat));
        }
        if(Cats.size()==0){
            throw new CatNotFoundException("店里无猫");
        }

        balance+=15* newCustomer.times;

    }

    @Override
    public void Closed() {
        double profits = 0;
        for(Customer Customer:Customers){
            if(Customer.ArriveTime.equals(LocalDate.now())){
                profits+=15* Customer.times;
            }
        }

        System.out.println("今天你的店铺盈利"+profits+"元");
    }
}
