class Array_insert {
    public static void main(String[] args){
        int ar[] = new int[10];

        // arr[10] = {10,2,3,34,56,76,88,43,1,97,67};
        ar[0] = 12;
        ar[1] = 32;
        ar[2] = 23;
        ar[3] = 43;
        ar[4] = 35;
        ar[5] = 21;
        ar[6] = 65;
        ar[7] = 87;
        ar[8] = 33;
        ar[9] = 99;

        for(int i = 0; i < ar.length; i++){
            System.out.println("Array element at index " + i + ": " + ar[i]);
        }
    }
}
