import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class IMDBContentExtractor implements ContentExtractor{
    
    public List<Content> contentExtractor(String json){
        var parser = new JsonParser();
        List<Map<String, String>> pasedList = parser.parse(json);

        List<Content> contentsList = new ArrayList<>();

        // fill the content list
        for (Map<String, String> atributes : pasedList) {
            String title = atributes.get("title");
            String urlImage = atributes.get("image")
                    .replaceAll("(@+)(.*).jpg$", "$1.jpg");
            
            var content = new Content(title, urlImage);
            
            contentsList.add(content);
        }

        return contentsList;
    }
}
