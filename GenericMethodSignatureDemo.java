package generictest;

import java.util.ArrayList;

public class GenericMethodSignatureDemo {
	public void methodOne(ArrayList<String> l){}
	public void methodOne(ArrayList<Integer> l){}
	
	//Compile Time Error
	/*Erasure of method methodOne(ArrayList<String>) is the same as another method in type GenericMethodSignatureDemo*/
}
