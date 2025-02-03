public class mutilDim {
    public static void main(String[] args) {
        int arr[][] =  new  int[3][4];
        // Math.random()  gives a random double value less than 1.0
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<4 ; j++){
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        // priting 
        for(int smallArray[] : arr){
            for(int elem : smallArray){
                System.out.print(elem+ " ");
            }
            System.out.println();
        }
    }
}
