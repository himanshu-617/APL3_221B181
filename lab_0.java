/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class juet
{
		int age;
		String name;
		public void agesetter(int a){
		    this.age=a;
		}
		public void namesetter(String s){
		    this.name=s;
		}
		public int agegetter(){
		    return age;
		}
		public String namegetter(){
		    return name;
		}
		public static void main(String[] args) {
		    juet obj=new juet();
		    obj.agesetter(21);
		    obj.namesetter("Ajay");
		    int a=obj.agegetter();
		    String st=obj.namegetter();
		    System.out.println("Name is:" +st);
		    System.out.println("Age is:" +a);
	    }   
	
}