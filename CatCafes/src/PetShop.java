public interface PetShop {
    void buyCat(Cat newCat) throws InsufficientBalanceException;
    void Service(Customer newCustomer);
    void Closed();
}
