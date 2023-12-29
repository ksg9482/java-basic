package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "루프";
        movieReviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "시간";
        movieReviews[1] = aboutTime;

        for (MovieReview movieReview : movieReviews) {
            System.out.println(movieReview.title + ", " + movieReview.review);
        }
    }
}
