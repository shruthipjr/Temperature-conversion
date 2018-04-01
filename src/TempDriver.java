

// Class to test Temperature class
public class TempDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float value;
		boolean result1, result2, result3;
		
		// Create the object with default constructor
		Temperature t1 = new Temperature();
		value = t1.FtoC(32.0f);
		result1 = t1.isEqual(0.0f, value);
		// Fetch the values after conversion and print
		System.out.println("Is " + t1.getTemp() + " degree C is equal to " + "32.0f degree F : " + result1);

        // Create object with passing a scale value in constructor
		Temperature t2 = new Temperature('C');
		value = t2.FtoC(-40.0f);
		result1 = t2.isEqual(-40.0f, value);
		System.out.println("Is -40 degree C is equal to " + "-40.0f degree F : " + result1 +"\n");
		
		// Create object with passing a temp value in constructor
		Temperature t3 = new Temperature(212.0f);
		value = t3.CtoF(100.0f);
		result1 = t3.isEqual(t3.getTemp(), value);
		result2 = t3.isGreater(t3.getTemp(), value);
		result3 = t3.isLesser(t3.getTemp(), value);
		System.out.println("Is 100 degree C is equal to " + "212.0f degree F : " + result1);
		System.out.println("Is 100 degree C is greater than " + "212.0f degree F : " + result2);
		System.out.println("Is 100 degree C is lesser than " + "212.0f degree F : " + result3 + "\n");
		
		// Create object with passing a temp  and scale value in constructor
		Temperature t4 = new Temperature(75.0f, 'C');
		value = t4.FtoC(t4.getTemp());
		result1 = t4.isEqual(55.0f, value);
		result2 = t4.isGreater(55.0f, value);
		result3 = t4.isLesser(55.0f, value);
		System.out.println("Is 55 degree C is equal to " + "75.0f degree F : " + result1);
		System.out.println("Is 55 degree C is greater than " + "75.0f degree F : " + result2);
		System.out.println("Is 55 degree C is lesser than " + "75.0f degree F : " + result3);
		
        // Create object with default temperature
		Temperature t5 = new Temperature();
		value = t5.FtoC(233.6f);
		result3 = t5.isLesser(20.0f, value);
		System.out.println("Is 20 degree C is lesser than " + "233.6f degree F : " + result3);

	}

}
