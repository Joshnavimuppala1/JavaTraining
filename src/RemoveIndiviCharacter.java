public class RemoveIndiviCharacter {
    public static void main(String[]args){
    String s1 = "joshnavi";
    String s2 = "muppala";
    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    boolean found = false;
        for(int i=0;i<c1.length;i++) { //
        for(int j=0;j<c2.length;j++) {
            if(c1[i] == c2[j]){
                System.out.print(c1[i]);
                found = true;
                break;
            }
        }
    } //
        if(!found) {
        System.out.println("No Common Characters Found !");
    }

}
}

