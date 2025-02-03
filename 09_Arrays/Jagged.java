public class Jagged {
    public static void main(String[] args) {
        int arr[][] =  new int[3][];
        // jagged array
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];

        for(int i=0 ; i<arr.length ; i++){
            for(int j=0; j < arr[i].length ; j++){
                arr[i][j] = (int)(Math.random()*10);
            }
        }

        for(int subarray[] : arr){
            for(int ele : subarray){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}

