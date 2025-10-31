//                    Day-5
//1) List Problem — Corporate Training Feedback Analyzer
//        Theme: You’re running a high-end corporate bootcamp for new software engineers (😏 sounds familiar).
//        Story: After your technical bootcamp, you collected feedback as integer ratings (1-10). Due to some enthusiastic responses and typos, a few participants entered invalid scores (>10 or negative).
//        Task: Given a list of ratings, clean the data by ✔ Removing invalid ratings ✔ Calculate average rating, highest, and lowest ✔ Print the sorted cleaned ratings list
//        Sample Input
//        Ratings: [9, 10, 12, 8, -1, 7, 11, 10, 6]
//        Expected Output
//        Cleaned Ratings: [6, 7, 8, 9, 10, 10]
//        Highest Rating: 10
//        Lowest Rating: 6
//        Average Rating: 8.33

import java.util.*;
public class CollectionsExamp {


    public static void main(String[] args){
        int[]  rating = {9, 10, 12, 8, -1, 7, 11, 10, 6};
        //remove the invalid ratings
        ArrayList<Integer> arr = new ArrayList<>();
        for(int r:rating){
            if(r>=1 && r<=10){
                arr.add(r);

            }
        }
        //sort the clean ratings
        Collections.sort(arr);

        //find the lowest,highest,average
        int lowest = arr.get(0);
        int highest = arr.get(arr.size() -1);

        int sum=0;
        for(int r : arr){
            sum+=r;
        }
        double average = (double) sum / arr.size();
        System.out.println("cleaned Rating: "+arr);
        System.out.println("Highest Rating:" +highest);
        System.out.println("Lowest Rating:" +lowest);
        System.out.println("Average Rating:" +average);
    }
}

