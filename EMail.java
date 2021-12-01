package xier;

import java.util.Scanner;

public class EMail {
    public static boolean email(String email){
        boolean tag=true;
        if(!email.matches("^(\\w+([-.][A-Za-z0-9]+)*){3,18}@\\w+([-.][A-Za-z0-9]+)*\\.\\w+([-.][A-Za-z0-9]+)*$")){
            tag=false;
        }
        return tag;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String email=scanner.next();
        System.out.println(email(email));
    }
}
