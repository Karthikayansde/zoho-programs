public class ZohoQA {
    // 4 2 3 6 = 12
    // 3 6 4 8 5 5 = 26
    public static void main(String[] args) {
        int a[] = {4,2,3,6};
        int b[] = {3,6,4,8,5,5};
        int back = 0,current = 0,sum = 0;
        for(int i=0;i<b.length;i++)
        {
            if(i==0)
            {
                back = b[i];
                sum = back;
            }
            else{
                current = b[i];
                if(back%2==0 && current%2!=0)
                {
                    back = current;
                    continue;
                }
                sum = sum + current;
                back = current;
            }
        }
        System.out.println(sum);
    }
}