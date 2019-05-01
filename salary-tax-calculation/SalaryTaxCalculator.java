public class SalaryTaxCalculator  {
//Different amount of income pays different amount of tax. 
//First 15k pays 5%, next 20 pays 10%, etc. Given an income M, return amount of tax  

    private double calculateTax(double salary){
        double taxAmount = 0;

        if(salary <= 15000.00){

            taxAmount += (salary/100 * 5);

        }else{
            taxAmount += (15000.00/100*5);

            if(salary <= 35000.00){
                taxAmount += ((salary - 15000.00)/100 * 10);
            }else if(salary > 35000.00){
                taxAmount += (20000.00/100 * 10);
            }
        }
        
        return taxAmount;
    }

    public static void main(String[] args){
        System.out.println(new SalaryTaxCalculator().calculateTax(1000.00));
    }

}