public class Worker {
    String fio;
    String dolgnost;
    String mail;
    Integer  phone;
    Integer price;
    Integer age;

    public Worker(String fio, String dolgnost, String mail, int phone, int price, int age) {
        this.fio = fio;
        this.dolgnost = dolgnost;
        this.mail = mail;
        this.phone = phone;
        this.price = price;
        this.age = age;

    }






    public void print () {
        if (age > 40) {
            System.out.println(fio);
            System.out.println(dolgnost);
            System.out.println(mail);
            System.out.println(phone);
            System.out.println(price);
            System.out.println(age);
        }
    }


}
