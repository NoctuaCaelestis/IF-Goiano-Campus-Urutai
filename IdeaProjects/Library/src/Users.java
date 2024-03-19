public class Users {
    private String name;
    private String gender;
    private String phone_num;
    private int age;

    public Users() {

    }
    public Users (String name, String gender, String phone_num, int age) {
        this.name = name;
        this.gender = gender;
        this.phone_num = phone_num;
        this.age = age;
    }


    public String getName() {return name;}
    public String getGender() {return gender;}
    public String getPhone_num() {return phone_num;}
    public int getAge() {return age;}

    public void readBook() {System.out.println(getName() + " está lendo um livro.");}

}
