import java.util.*;

public class RemoveCharcter {
    public static void main(String[]args){
        ArrayList<String> input1 = new ArrayList<>();
        input1.add("alice");
        input1.add("Joshna");
        input1.add("Josh");
        input1.add("amulya");

        ArrayList<String> input2 = new ArrayList<>();
        input2.add("bob");
        input2.add("Joshnavi");
        input2.add("Joshna");
        input2.add("amulya");
        boolean found = false;
        for(int i=0;i<input1.size();i++){
            for(int j=0;j<input2.size();j++){
                if(input1.get(i).equals(input2.get(j))) {
                    System.out.println(input1.get(i));
                    found = true;
                    break;
                }
            }
        }
        if(!found) {
            System.out.println("No Common Names Found !");
        }

    }
}
