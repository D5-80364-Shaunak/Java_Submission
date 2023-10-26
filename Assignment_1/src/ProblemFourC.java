class ProblemFourC{
    public static void main(String[] args){
        patternC(10);
    }

    public static void patternC(int num){
        for(int row = 0; row <= num; row++){
            for(int i = 0; i < (num -row); i++){
                System.out.print(" ");
            }
            for(int col = 0; col < row; col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
