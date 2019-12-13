package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String name = sc.nextLine();


        Account acco = new Account(name, 1);

        System.out.println(acco.accountNumber);

	    //acco.accountName;
        System.out.println(acco.valuta);

        Manager man = new Manager();
        man.tell();
    }

}

