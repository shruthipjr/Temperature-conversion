

// class Temperature
public class Temperature {

	float temp;
	char scale;

//Default Constructor
	Temperature(){
		setTemp(0);
		setScale('C');
	}
// Constructor with degree argument
	Temperature(float temp){
		setTemp(temp);
		setScale('C');
	}
//Constructor with scale argument
	Temperature(char scale){
		setScale(scale);
		setTemp(0);
	}
//Constructor with both degree and scale arguments
	Temperature(float temp, char scale){
		setTemp(temp);
		setScale(scale);
	}
//Get method to get the temp variable
	public float getTemp() {
		return temp;
	}
//Set method to set the temp variable
	public void setTemp(float temp) {
		this.temp = temp;
	}
//Get method to get scale variable
	public char getScale() {
		return scale;
	}
//Set method to set the scale variable
	public void setScale(char scale) {
		this.scale = scale;
	}
//Set method to set the both temp and scale values
	public void setBoth(float temp, char scale){
		this.scale = scale;
		this.temp = temp;
	}
//method to convert Celsius to Faurenhit
	public float CtoF(float temp){
		return ((9 * temp)/5) + 32;

	}
//Method to convert Faurenhit to Celsius
	public float FtoC(float temp){
		return 5*(temp - 32)/9;
	}

	//Method to find two temp values are equal
	public boolean isEqual(float temp1, float temp2){
		if(temp1 == temp2){
			return true;
		}
		else{
			return false;
		}
	}
//Method to find temp1 is greater than temp2
	public boolean isGreater(float temp1, float temp2){
		if(temp1 > temp2){
			return true;
		}
		else{
			return false;
		}
	}
//Method to find temp1 is less than temp2
	public boolean isLesser(float temp1, float temp2){
		if(temp1 < temp2){
			return true;
		}
		else{
			return false;
		}
	}

}
