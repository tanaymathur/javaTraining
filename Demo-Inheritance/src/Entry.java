import com.simulationdemo.Animal;
import com.simulationdemo.Cat;

public class Entry {
	public static void main(String[] args) {
		
		Cat c = new Cat("Feline","");
		c.roam();
		
		System.out.println(c.getSize());
		System.out.println(c.display());
		Animal a;
		
//		IMPLICIT UP-CASTING
		a = c;
		
		a.roam();
//		a.getType();
		System.out.println(a.getType());
	}
}
