abstract class GeneralBank {
    public double getSavingInterestRate()
    {
    	return 0.0;
    }
    public  double getFixedInterestRate() {
    	return 0.0;
    }
}

class ICICIBank extends GeneralBank {
    public double getSavingInterestRate() {
    	return 4.0; 
    	}

    public double getFixedInterestRate() {
    	return 8.5; 
    	}
}

class KotMBank extends GeneralBank {
    public double getSavingInterestRate() {
    	return 6.0;
    	}

    public double getFixedInterestRate() { 
    	return 9.0;
    	}
}

class prog1 {
    public static void main(String[] args) {
        ICICIBank ic = new ICICIBank();
        KotMBank kot = new KotMBank();
        System.out.println(ic.getSavingInterestRate()+ "%");
        System.out.println(ic.getFixedInterestRate() + "%");
        System.out.println(kot.getSavingInterestRate()+ "%");
        System.out.println(kot.getFixedInterestRate() + "%");
        GeneralBank gb1 = new ICICIBank();
        GeneralBank gb2 = new KotMBank();
        System.out.println(gb1.getSavingInterestRate()+ "%");
        System.out.println(gb1.getFixedInterestRate() + "%");
        System.out.println(gb2.getSavingInterestRate() + "%");
        System.out.println(gb2.getFixedInterestRate() + "%");
    }
}