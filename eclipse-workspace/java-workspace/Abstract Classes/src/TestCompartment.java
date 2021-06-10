import java.util.Random;

abstract class Compartment{
	public abstract void notice();
}
// FirstClass, Ladies, General, Luggage
class Firstclass extends Compartment{
public void notice(){
		System.out.println("first class");
		}
}
class Ladies extends Compartment{
public void notice(){
		System.out.println("Ladiesclass");
		}
}
class General extends Compartment{
public void notice(){
		System.out.println("General class");
		}
}
class Luggage extends Compartment{
public void notice(){
		System.out.println("Luggage");
		}
}
public class TestCompartment {
	 public static void main(String[] args) {
Compartment array[]=new Compartment[10];
Random rand = new Random();
for (int i = 0;i < array.length;i++) {
    int choice = rand.nextInt(4) + 1;
    switch(choice) {
        case 1:
            array[i] = new Firstclass();
            break;
        case 2:
            array[i] = new Ladies();
            break;
        case 3:
            array[i] = new General();
            break;
        case 4:
            array[i] = new Luggage();
            break;
    }
}
for (Compartment i:array) {
    i.notice();
}
}
}

