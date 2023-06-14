import java.util.ArrayList;
import java.util.List;

public class GeneGreyCo {

    public static void main(String[] args) {
        int n = 4;
        ArrayList<String> ans = generateCode(n);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static ArrayList<String> generateCode(int n) {

        if (n == 1) {
            ArrayList<String> base = new ArrayList<>();
            base.add("0");
            base.add("1");
            return base;
        }

        ArrayList<String> ans = generateCode(n - 1);
        ArrayList<String> myAns = new ArrayList<>();

        for (int i = 0; i < ans.size(); i++) {
            myAns.add("0" + ans.get(i));
        }

        for (int i = ans.size() - 1; i >= 0; i--) {
            myAns.add("1" + ans.get(i));
        }

        return myAns;
    }

    public static ArrayList<String> Code(int n) {
        ArrayList<String> list = new ArrayList<>();

        list.add("0");

        list.add("1");

        for (int i = 1; i < n; i++) {

            int l = list.size();

            for (int j = l - 1; j >= 0; j--)list.add(list.get(j));

            for (int j = 0; j < l; j++) {

                String str = "0" + list.get(j);

                list.set(j, str);

            }

            for (int j = l; j < 2 * l; j++) {

                String str = "1" + list.get(j);

                list.set(j, str);

            }

        }

        return list;

    }
}
