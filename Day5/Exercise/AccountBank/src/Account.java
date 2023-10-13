package src;

public class Account {
    private String name;
    private String email;
    private String phone;
    private int money;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getMoney() {
        return money;
    }

    public Account(String name,String email,String phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.money = 0;
    }

    public String getInfo() {
        return "Name: " + this.name + "\n" + "Email: " + this.email + "\n" + "Phone: " + this.phone;
    }

    public String deposit(int depositMoney) {
        this.money += depositMoney;
        return "Nap tien thanh cong";
    }

    public String withDrawMoney(int drawMoney){
        if  ( drawMoney > this.money){
            return "So tien hien tai khong du";
        }else {
            this.money -= drawMoney;
            return "Rut tien thanh cong";
        }
    }
}
