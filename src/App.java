import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Properties;


public class App {
    public static void main(String[] args) throws Exception {
        
        //get api keys
        Properties props = new Properties();
        InputStream path = new FileInputStream("./local.properties");
        props.load(path);
        String NASA_API_KEY = props.getProperty("NASA_API_KEY");

        // make an  HTTP requisiton to take JSON info
        
        // IMDB
        // String url = "https://alura-filmes.herokuapp.com/conteudos";
        // ContentExtractor extractor = new IMDBContentExtractor();

        // nasa
        // String url = "https://api.nasa.gov/planetary/apod?api_key="+ NASA_API_KEY +"&start_date=2022-07-16";
        // ContentExtractor extractor = new NasaContentExtractor();
        
        // local API
        String url = "http://localhost:8080/languages";
        ContentExtractor extractor = new IMDBContentExtractor();
        
        ClientHttp http = new ClientHttp();
        String json = http.searchData(url);        
        
        
        // show and manipulate data
        List<Content> nasaContent = extractor.contentExtractor(json);

        var stickerFactory = new StikerFactory();
        for (int i = 0; i < 5; i++) {

            Content content = nasaContent.get(i);
            InputStream inputStream = 
                                new URL(content.urlImage())
                                 .openStream();
            String fileName = content.title() + ".png";
            
            stickerFactory.generator(inputStream, fileName);

            System.out.println("\u001b[1m\u001b[46mTítulo:\u001b[m " + content.title());
            System.out.println("\u001b[1m\u001b[104mCapa:\u001b[m " + content.urlImage());
            //System.out.println("\u001b[1m\u001b[42m\u2B50Classificação:\u001b[m \u2B50" + content.get("imDbRating"));
            System.out.println(" ");
        }
    }
}
