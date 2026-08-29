package oops.encapsulation;

public class employ {
    private String name;
    private int age;
    private double salary;
    private String userid;
    private String password;

    employ() {

    }

    employ(String name, int age, double salary, String userid, String password) {
        this.name = name;
        this.age = age;

    }

    public void setUserId(String userid) {
        this.userid = userid;
    }

    public void setPassword(String password) {
        if (password.length() < 8 || password.isBlank()) {
            System.out.println("invalid password");
            return;
        }
        int uc = 0, lc = 0, dig = 0, sc = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c == ' ') {
                uc++;
            } else if (c > 'a' && c < 'z') {
                if (c > 'A' && c < 'Z')
                    uc++;
                else if (c > 'a' && c < 'z')
                    lc++;
                else if (c > '0' && c < '9')
                    dig++;
                else
                    sc++;
            }
            if (uc > 0 && lc > 0 && dig > 0 && sc > 0)
                this.password = password;
        }
    }

    public void setName(String name) {
        if(name.length()<=2){
        System.out.println("invalid name!");
        return;}

        if (name.matches("[A-Za-z\s]+"))
            this.name = name;
        else
            System.out.println("invalid name!");
    }

    public void setAge(int age) {
        if (age > 01 || age < 99)
            System.out.println();
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
// userinput password validate username validate name age salary also inside
// encapsulation block by setter getter
