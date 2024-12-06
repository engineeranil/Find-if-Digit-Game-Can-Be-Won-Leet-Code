public class Main {
    public static void main(String[] args) {
        int[] nums = {5,5,5,25};
        int sumOneDigits = 0;
        int sumDoubleDigits = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]<10){
                sumOneDigits+=nums[i];
            }
            else{
                sumDoubleDigits+=nums[i];
            }
        }
       if(sumDoubleDigits>sumOneDigits){
           System.out.println("TRUE");
       }
       else if(sumOneDigits>sumDoubleDigits){
           System.out.println("TRUE");
       }
       else if(sumOneDigits==sumDoubleDigits){
           System.out.println("FALSE");
       }

    }
}
