import java.util.ArrayList;
// input = {1,2,3,4,5,6,7,8,9}
// output = {1,8,3,6,5,4,7,2,9}

public class ZohoQA {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ArrayList<Integer> ar2 = new ArrayList<Integer>();
        for (int integer : ar) {
            if(integer % 2 == 0){
                ar2.add(integer);
            }
            else{
                ar1.add(integer);
            }
        }
        int artemp[] = new int[ar2.size()];
        int a = 0;
        for (int ele : ar2) {
            artemp[a] = ele;
            a++;
        }
        for (int i = 0,j = artemp.length-1; i < ar1.size()||j>=0; i++,j--) {
            if(i<ar1.size()){
                System.out.println(ar1.get(i));
            }
            if(j>=0){
                System.out.println(artemp[j]);
            }
        }
        ar1 = sort(ar1);
    }
    static ArrayList<Integer> sort(ArrayList<Integer> ar3)
    {
        int start = 0;
        for (start = 0; start < ar3.size(); start++) {
            for (int i = 0; i < array.length; i++) {
                
            }
        }
        return ar3;
    }
}