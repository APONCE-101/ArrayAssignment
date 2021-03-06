import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] movies = {"Avengers", "Breakfast Club", "South Park: Bigger, Longer & Uncut",
                "Nightmare Before Christmas", "Big Hero 6"};
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printFavoriteMovies(movies);
        printSum(nums);
    }

    public static void printFavoriteMovies(String[] favMovies) {
        System.out.println(Arrays.toString(favMovies));
    }

    public static void printSum(int[] nums) {
        int sum = 0 ;
        for (int i = 0; nums.length > i; i++) {
           sum += nums[i];
        }
        System.out.println(sum);

    }
}




