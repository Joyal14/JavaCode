import java.util.Arrays;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letter = {'c','j','k','m','x'};
        char target = 'n';
        char ans = (char) nextGreatestLetter(letter, target);
        System.out.println(ans);
    }

    static int nextGreatestLetter(char[] letter, char target) {
        int start = 0;
        int end = letter.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target < letter[mid]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return letter[start % letter.length];
    }
}
