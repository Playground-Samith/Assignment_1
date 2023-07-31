public class Demo3 {
    public static void main(String[] args) {
        int firstNum=123;
        int secondNum=456;
        int thirdNum=7890;
        final String COLOR= "\033[32;1m";
        final String RESET= "\033[30;0m";
        System.out.printf("%s(%3d)%s% 4d-%3d \n",COLOR,firstNum,RESET,secondNum,thirdNum);
    }
    
}
