class ProblemFourB{
    public static void main(String[] args){
        patternB(10);
    }

    public static void patternB(int num){
        for(int row = 1; row < 2 * num; row++){
            int totalColInRow = row > num ? 2 * num - row : row;
            int noOfSpaces = num - totalColInRow;
            for(int j = 0; j < noOfSpaces; j++){
                System.out.print(" ");
            }
            for(int col = 1; col <= totalColInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}