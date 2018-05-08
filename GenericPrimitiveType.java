package generictest;

import java.util.ArrayList;

public class GenericPrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<int> arrayList=new ArrayList<int>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		System.out.println(arrayList);//Compilr Time Error , because for parameter type we can use only reference type but not primitive type.

	}

}
