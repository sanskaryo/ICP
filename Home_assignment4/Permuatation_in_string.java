import java.util.*;

public class Permuatation_in_string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(checkInclusion(s1,s2));

        
    }

    public static boolean checkInclusion(String s1, String s2) {

    char[] array1  = s1.toCharArray();

    Arrays.sort(array1);

    for (int i = 0; i <= s2.length() - s1.length(); i++) {

        char[] arr2 = s2.substring(i, i + s1.length()).toCharArray();

        Arrays.sort(arr2);

        if (Arrays.equals(array1, arr2)) return true;
    }
    return false;
}

}
    

