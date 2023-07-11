class Person{
    private String name;
    private int age;
    private String address;
    
    public Person(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public void setName(String name){
        this.name=name;
    }
    
    public void setAge(int age){
        this.age=age;
    }
    
    public void setAddress(String address){
        this.address=address;
    }
    

    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getAddress(){
        return address;
    }
}
public class Main3 {
    public static void main(String[] args) {
        Person s=new Person("Riya", 18, "Delhi");
        s.setName("Riya");
        s.setAge(18);
        s.setAddress("Delhi");
        
        String name=s.getName();
        System.out.println("Person name : " + name);
        
        int age=s.getAge();
        System.out.println("Person age : " + age);
        
        String address=s.getAddress();
        System.out.println("Person address : " + address);
     }
}
