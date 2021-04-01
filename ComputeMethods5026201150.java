import java.util.Random;
public class ComputeMethods5026201150{

	public  double fToC(double degreesF){
	return(5.0/9.0*(degreesF-32));
	}
	public  double hypotenuse(int a, int b){
	return(Math.sqrt((a*a)+(b*b)));
	}
	public int roll(){
	Random numbers = new Random();
	return ((numbers.nextInt(6)+1)+(numbers.nextInt(6)+1)); 
	}
}