package lab2;

import java.util.Scanner;
import java.lang.Object;
import java.lang.ClassNotFoundException;

public class PhoneBook {
    LinkedList names;
    LinkedList numbers;

    public PhoneBook(){
        names = new LinkedList();
        numbers = new LinkedList();
    }

    public void insert(String name, String phonenumber){
        names.insert(name);
        numbers.insert(phonenumber);
    }

    public void lookUp(String prefix, StringBuffer name, StringBuffer number) throws ClassNotFoundException{
//        System.out.println(names.current().substring(0,prefix.length() - 1));
        while(names.hasElement() && numbers.hasElement()){
            int length = prefix.length();
            if(names.current().substring(0, length-1).equals(prefix)){
                name.append(names.current());
                number.append(numbers.current());
            }
            names.advance();
            numbers.advance();
        }
        if (name.length() == 0 && number.length() == 0){
            System.out.println("Bi loi roi!!!!");
            throw new ClassNotFoundException();
        }

    }

    public void repeatLookUp(String prefix, StringBuffer name, StringBuffer number) throws Exception{
        Scanner sc = new Scanner(System.in);
        try{
            lookUp(prefix, name, number);
        }catch (ClassNotFoundException e){
            System.out.println("Not Found!");
            System.out.println("Enter another prefix please");
            prefix = sc.nextLine();
            lookUp(prefix, name, number);
        }
    }

    public static void main(String[] args) throws Exception {
        PhoneBook pb = new PhoneBook();
        pb.insert("Trung", "0945933710");
        pb.insert("Khanh", "0123456789");
        pb.insert("Minh", "399473239");

        while(!pb.numbers.hasElement() && !pb.names.hasElement()){
            System.out.println(pb.names.current() + " " + pb.numbers.current());
            pb.names.advance();
            pb.numbers.advance();
        }

        StringBuffer name = new StringBuffer();
        StringBuffer phonenumber = new StringBuffer();

        pb.lookUp("Kh", name, phonenumber);
        System.out.println(name + " " + phonenumber);
    }
}
