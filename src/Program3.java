public class Program3 {
    public static void main(String[] args){
        int[] arr = {3, 8, 1, 6, 5,6};
        int key = 6;
        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                found = true;
                System.out.println("Found at index " + i);
                break;
            }
        }

        if(!found) {
            System.out.println("Not found");
        }
    }
}
