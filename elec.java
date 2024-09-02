class ElectricityBill {
 String name;
 int unit;
 double total, charge;
 void setter(String name, int unit)
 {
   this.name = name;
   this.unit=unit;
 }
 void billCalculate()
 {
   if(unit<=100)
   {
     charge=0.6*unit;
   }
   else if(unit<=300)
   {
     charge=(0.6*100)+(0.8*(unit-100));
   }
   else
   {
     charge=(0.6*100)+(0.8*200)+(0.9*(unit-300));
   }
   total=50+charge;
   if(total>300)
   {
     total=total+(0.15*charge);
   }
 }
 void showDetails()
 {
   System.out.println("Name: "+name+" Unit: "+unit+" Total: "+total);
 }
 public static void main(String[] args) {
  ElectricityBill d= new ElectricityBill();
  d.setter("Akansha",100);
  d.billCalculate();
  d.showDetails();
 }
}
