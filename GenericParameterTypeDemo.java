package generictest;

import java.util.ArrayList;

public class GenericParameterTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> arrayList=new ArrayList<String>();
		arrayList.add("Pratyush");
		arrayList.add("Ranjan");
		arrayList.add("Sahu");
		System.out.println(arrayList);//Compile Time Error because polymorphism is applicable for base type but not parameter type
	}

}
