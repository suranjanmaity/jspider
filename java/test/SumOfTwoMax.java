public class SumOfTwoMax{

    public int findTwoMaxNumbers(int[] ener){
        int maxOne = 0;
        int maxTwo = 0;
        for(int num : ener){
            if(maxOne < num){
                maxTwo = maxOne;
                maxOne =num;
            } else if(maxTwo < num){
                maxTwo = num;
            }
        }
        return (maxOne+maxTwo);
    }

    public static void main(String a[]){
        int num[] = {6,9,80,56,90,1};
        SumOfTwoMax maxNumber = new SumOfTwoMax();
        System.out.print(maxNumber.findTwoMaxNumbers(num));
    }
}