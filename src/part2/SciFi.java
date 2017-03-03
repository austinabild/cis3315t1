package part2;

/**
 * This SciFi class is finished. Use it as a model for Horror and Romance.
 *
 * @author Austin Abild
 */
public class SciFi extends Book {

    public SciFi(String title, String author) {
        super(title, author);
    }

    @Override
    public String getGenre() {
        return "sci-fi";
    }

}
