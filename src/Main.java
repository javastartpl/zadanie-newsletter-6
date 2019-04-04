import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            System.out.write("Witaj JavaStarcie!\n".getBytes());
        } finally {
            System.out.append("Witaj JavaStarcie!");
        }

    }
}
