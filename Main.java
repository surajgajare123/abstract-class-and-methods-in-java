abstract class Base{
    public void res(){
        System.out.println("Good morning..!");
    }
    public void des(){
        System.out.println("Good afternoon....!");
    }
    abstract public void Greet();
}
class Derived extends Base{
    public void com(){
        System.out.println("Good night...!");
        
    }
    @Override
    public void Greet(){
        System.out.println("stop........!");
    }
}
class Derived2 extends Base{
    public void Greet(){
        System.out.println("Starting....!");
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("abstract class and methods..........!");
		Derived n = new Derived();// Allowed 
	//	Base b = new Base(); // not Allowed
	    Derived2 n1 = new Derived2();
	    n1.Greet();
		n.Greet();
	}
}
