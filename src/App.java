import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        
        // make an  HTTP requisiton to take JSON info
        String url = "https://alura-filmes.herokuapp.com/conteudos";
        URI adress = URI.create(url);
        HttpClient client = HttpClient.newHttpClient(); // var can be used
        HttpRequest request = HttpRequest.newBuilder(adress).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

        // get the concern data (title, image, rate) and keep it in a string
        var parser = new JsonParser();
        List<Map<String, String>> filmList = parser.parse(body);
        
        // show and manipulate data
        var stickerFactory = new StikerFactory();
        for (Map<String,String> film : filmList) {

            String urlImage = film.get("image");
            String title = film.get("title");
            InputStream inputStream = 
                                new URL(urlImage)
                                 .openStream();
            String fileName = title + ".png";
            
            stickerFactory.generator(inputStream, fileName);

            System.out.println("\u001b[1m\u001b[46mTítulo:\u001b[m " + title);
            System.out.println("\u001b[1m\u001b[104mCapa:\u001b[m " + film.get("image"));
            System.out.println("\u001b[1m\u001b[42m\u2B50Classificação:\u001b[m \u2B50" + film.get("imDbRating"));
            System.out.println(" ");
        }
    }
}
