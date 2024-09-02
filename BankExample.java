class Bank {
    public double getRateOfInterest() {
        return 0.0;
    }
}

class HDFC extends Bank {
  public double getRateOfInterest() {
        return 4.0;
    }
}
class SBI extends Bank {
  public double getRateOfInterest() {
        return 4.5;
    }
}

class PNB extends Bank {
   public double getRateOfInterest() {
        return 5.0;
    }
}

public class BankExample {
    public static void main(String[] args) {
        Bank bank1 = new HDFC();
        Bank bank2 = new SBI();
        Bank bank3 = new PNB();

        System.out.println("Interest rate of HDFC: " + bank1.getRateOfInterest() + "%");
        System.out.println("Interest rate of SBI: " + bank2.getRateOfInterest() + "%");
        System.out.println("Interest rate of PNB: " + bank3.getRateOfInterest() + "%");
    }
}

