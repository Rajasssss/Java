package Pack1;
public class ParaConst {

String name;
int roll;

ParaConst(String n , int r){

name=n;
roll = r;
}

public void display() {
System.out.println(name +" " +roll);
}

public static void main(String[] args) {

ParaConst p =new ParaConst("Rajas" , 18);
p.display();
}
}
