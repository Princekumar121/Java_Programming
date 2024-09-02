class phone{
    void mymusic(){
        System.out.println("this is music from the phone");
    }
}
class smartphone extends phone{
    void mymusic(){
        System.out.println("this is music from the smartphone  ");
    }
}
public class dynmetdis {
    public static void main(String[] args) {
         phone obj=new smartphone();
         obj.mymusic();
    }
   
}
