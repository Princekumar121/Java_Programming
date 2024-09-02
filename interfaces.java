

interface first{
    void mymeth(int s);
    void sys(int z);
}
class second implements first{
    public void mymeth(int a){
        System.out.println("hfiugi");
    }
    public void sys(int b){
        System.out.println("dgr");
    }
}
public class interfaces {
    public static void main(String args[]){
    second obj=new second();
    obj.mymeth(2);
    obj.sys(4);
    }
}
