package generictest;

import java.util.ArrayList;

public class GenericCompileTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arrayList=new ArrayList<String>();
		arrayList.add("Pratyush");
		arrayList.add(1);
		arrayList.add(true);
		System.out.println(arrayList);//[Pratyush, 1, true]
		/*Generic concept is applicable only for compile time. So on the rigth side the  parameter type will be ignored.
		ArrayList arrayList1=new ArrayList<String>();
		ArrayList arrayList2=new ArrayList<Integer>();
		 both are equal.
		*/

	}

}
