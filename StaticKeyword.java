public class Person {
  public String name;
  public int age;
  public static String address;
  
  public static void main(String[] args){
    Person john = new Person();
    john.name = "John";
    john.age = 35;
    john.address = "101 Main St";
		
    System.out.println(john.name);
    System.out.println(john.age);
    System.out.println(john.address);
		
	  
    Person smith = new Person();
    System.out.println(smith.name);
    System.out.println(smith.age);
    System.out.println(smith.address);
  }	
}

/*
  Output:
  John
  35
  101 Main St
  null
  0
  101 Main St
  
  - Static variables belong to class. They do not belong to specific object.
    That's why for second object print "101 Main St" value for address.
    Correct way of accessing static members is by class name
    
*/



