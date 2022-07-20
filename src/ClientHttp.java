import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ClientHttp {
    
    // make an http requisition and return it
    public String searchData(String url) throws BadURL{
        
        try{
            URI adress = URI.create(url);
            HttpClient client = HttpClient.newHttpClient(); // var can be used
            HttpRequest request = HttpRequest.newBuilder(adress).GET().build();
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            String body = response.body();
            return body;

        }catch(IOException | InterruptedException | IllegalArgumentException ex){
            throw new BadURL("Bad URL, please check if is something wrong in it" + ex);
        }
        
    };  
}
