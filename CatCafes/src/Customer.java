import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    String Customer;
    int times;
    LocalDate ArriveTime;
    String PhoneNumber;

    public Customer(String customer, int times, LocalDate arriveTime, String phoneNumber) {
        Customer = customer;
        this.times = times;
        ArriveTime =arriveTime;
        if(phoneNumber.matches("^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(16[5,6])|(17[0-8])|(18[0-9])|(19[1、5、8、9]))\\d{8}$")){
            PhoneNumber = phoneNumber;
        }else{
            PhoneNumber = "无效号码";
        }

    }

    @Override
    public String toString() {
        return "Customer{" +
                "Customer='" + Customer + '\'' +
                ", times=" + times +
                ", ArriveTime=" + ArriveTime +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }
}
