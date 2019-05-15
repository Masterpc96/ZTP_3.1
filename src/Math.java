public class Math {
    public double divideByZero(){
        int a = 5;
        int b = 0;
        int temp = 0;
        try{
            temp = a/b;
        }catch(ArithmeticException e){

        }
        return temp;
    }

    public double divideByOne(){
        int a = 5;
        int b = 1;
        int temp;
        temp = a/b;
        return temp;
    }

    public double divideByZeroWithException() throws ArithmeticException{
        int a = 5;
        int b = 0;
        int temp;
        temp = a/b;
        return temp;
    }

}
