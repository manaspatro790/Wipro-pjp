import java.util.Random;

abstract class Instrument {
	public abstract void play();
}

class Piano extends Instrument {
	public void play() {
		System.out.println("Piano is playing tan tan tan tan");
	}
}

class Flute extends Instrument {
	public void play() {
		System.out.println("Flute is playing toot toot toot toot");
	}
}

class Guitar extends Instrument {
	public void play() {
		System.out.println("Guitar is playing tin tin tin");
	}
}

public class TestInstrument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Instrument array[]=new Instrument[10];
Random rand =new Random();
for(int i =0; i<array.length;i++) {
	int choice =rand.nextInt(9);
	switch(choice) {
    case 1:
        array[i] = new Piano();
        break;
    case 2:
        array[i] = new Flute();
        break;
    case 3:
        array[i] = new Guitar();
        break;
	}
	
	for(Instrument i1: array) {
		 System.out.println("Instrument[" + i1 + "] instanceof Piano: " + (i1 instanceof Piano));
         System.out.println("Instrument[" + i1 + "] instanceof Flute: " + (i1 instanceof Flute));
         System.out.println("Instrument[" + i1 + "] instanceof Guitar: " + (i1 instanceof Guitar));
         i1.play();
		
	}
	}
}
}
	