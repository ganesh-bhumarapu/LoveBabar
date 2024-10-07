import java.util.*;
class FactorialsOfLargeNumber{
    public static ArrayList<Integer> factorial(int n){
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);

        for(int i = 2; i <= n; i++){
            multiply(i, res);
        }
        Collections.reverse(res);

        return res;
    }
    private static void multiply(int x, ArrayList<Integer> res){
        int carry = 0;

        for(int i = 0; i < res.size(); i++){
            int product = res.get(i) * x + carry;
            res.add(carry % 10);
            carry /= 10;
        }
        while(carry != 0){
            res.add(carry % 10);
            carry /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ans = factorial(n);
        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}