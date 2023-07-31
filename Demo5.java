public class Demo5 {
    public static void main(String[] args) {
        int firstNumber=978;
        int secondNumber=3;
        int thirdNumber=16;
        int fourthNumber=1484100;

        final String FIRSTCOLOR="\033[33;1m";
        final String SECONDCOLOR="\033[34;1m";
        final String THIRDCOLOR="\033[35;1m";
        final String FOURTHCOLOR="\033[36;1m";
        final String RESET ="\033[30;0m";

        System.out.printf("\"%s%3d%s-%s%d%s-%s%2d%s-%s%7d%s\" \n",FIRSTCOLOR,firstNumber,RESET,SECONDCOLOR,secondNumber,RESET,
        THIRDCOLOR,thirdNumber,RESET,FOURTHCOLOR,fourthNumber,RESET);
    }
    
}
