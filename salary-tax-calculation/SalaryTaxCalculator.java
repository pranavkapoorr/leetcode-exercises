public class SalaryTaxCalculator  {

    private double calculateTax(double salary){
        double taxAmount = 0;
        if(salary >= 15000){
            taxAmount += (5/100)*(salary);
        }
        if(salary >= 20000){
            taxAmount += (10/100)*salary;
        }
        return taxAmount;
    }

    public static void main(String[] args){
        System.out.println(new SalaryTaxCalculator().calculateTax(15000));
    }

}