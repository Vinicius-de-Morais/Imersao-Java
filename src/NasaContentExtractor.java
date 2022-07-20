import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NasaContentExtractor implements ContentExtractor{
    
    // extract the necessary data from Json
    public List<Content> contentExtractor(String json){
        var parser = new JsonParser();
        List<Map<String, String>> pasedList = parser.parse(json);

        // just in case i need some review, and i know that's a bad behavior
        // this project is for knoewledge
    
        // List<Content> contentsList = new ArrayList<>();

        // // fill the content list
        // for (Map<String, String> atributes : pasedList) {
        //     String title = atributes.get("title");
        //     String urlImage = atributes.get("url");
            
        //     var content = new Content(title, urlImage);
            
        //     contentsList.add(content);
        // }

        List<Content> contentsList = pasedList.stream()
                    .map(atributes ->  new Content(atributes.get("title"), atributes.get("url"))).collect(Collectors.toList());

        return contentsList;
    }
}
