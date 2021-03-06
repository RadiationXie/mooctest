//see more details on http://www.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
//Write a program called ComputePI to compute the value of π, using the following series expansion.
//You have to decide on the termination criterion used in the computation (such as the number of terms used or the magnitude of an additional term). 
//Is this series suitable for computing π?
public class ComputePI {

	public static double compute(){
		double pi = 0.0d;
		for(int i = 1;i<10000;i++){
			pi = pi + ((int)Math.pow((int)(-1),(int)(i-1)))*((double)1/(2*i-1))*4;
			if(pi == 3.1415926){
				break;
			}
		}
		
		return pi;
	}
}
