package week2;

import java.util.Set;

public class Variable {
    String id;
    int num;
    public Variable(String name){
        id = name;
    }
    public void Setnumber(){
        num = 0;}
    public int Getnumber(){
        return num;
    }
    public void Incr(){
        num++;
    }
    public void Decr(){
        num--;
    }


}
