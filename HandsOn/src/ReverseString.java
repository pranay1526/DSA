public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        int n = s.length;
        for(int i = 0; i < n/2; i++)
        {
            char t = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = t;
        }
        System.out.println(s);
    }
}
