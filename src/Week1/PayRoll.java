package Week1;

public class PayRoll {
    float payRate;
    float workHouse;
    public PayRoll(float payRate, float workHouse)
    {
        this.payRate=payRate;
        this.workHouse=workHouse;
    }
    public void caculateNetpay()
    {
        float grossPay = payRate*workHouse;
        float tax = grossPay*0.15f;
        float netPay = grossPay - tax;
        System.out.println("Net Pay :"+netPay);
    }
    public static void main(String [] args)
    {
        PayRoll obj = new PayRoll(12.0f, 8.5f);
        obj.caculateNetpay();
    }
}
