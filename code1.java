class parent{  
void func(){
System.out.println("hello world");
}  
}  
class child extends parent{  
void func(){
System.out.println("hello mannat");
}  
void fun(){
System.out.println("charu");
}  
void display(){ 
fun(); 
super.func();   
}  
}  
class mainclass{  
public static void main(String[ ] args){  
child c=new child();  
c.display();  
}
}  