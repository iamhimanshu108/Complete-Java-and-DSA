public class DigitManipulationDemo {

    public void findDigitsUsingFormula(int num){
        if(num ==0){
             System.out.println("Number Of Digits: " + 1);
             return;
        }

        if(num<0){
            num = -1 *num;
        }
       int res = (int)Math.log10(num)+1;
       System.out.println("Number Of Digits: " + res);
    }
    
    public void findDigitsUsingDivision(int num){
      if(num ==0){
             System.out.println("Number Of Digits: " + 1);
             return;
        }
     
        if(num <0){
        num = -1*num;
     }
        int res =0;
        while(num >0){
            num = num/10;
            res++;
        }
        System.out.println("Number of Digits "+ res);
    }
    


    public void appendDigit(int num, int digit){
        int res = num *10 + digit;
        System.out.println("New Number is "+ res);
    }


    public void insertfront(int num, int digit){
        int digits = (int)Math.log10(num)+1;
        int res = digit * (int)Math.pow(10, digits)+ num;
        System.out.println("New Number is: " + res);
    }

    public void reverse(int num){
        int res =0;
        while (num >0){
            int d = num %10;
            res = res *10+d;
            num = num/10;
        }
        System.out.println("reverse "+ res);
    }


    public static void main(String[] args) {
        DigitManipulationDemo dm = new DigitManipulationDemo();
        //dm.findDigitsUsingFormula(-6417);

        //dm.findDigitsUsingDivision(8714);

        // dm.appendDigit(765, 1);
        //dm.insertfront(10, 5);
        dm.reverse(123);
      }
}


