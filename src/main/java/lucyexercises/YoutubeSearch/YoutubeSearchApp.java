package lucyexercises.YoutubeSearch;


import lombok.SneakyThrows;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;


@RestController
@SpringBootApplication
@Service
public class YoutubeSearchApp {
    public List<YoutubeVideo> playlist;
    private AuthValues auth;

    public YoutubeSearchApp() {
        init();
    }

    public YoutubeVideo getYoutubeVideoFromTitle(String title) {
        SearchEngine engine = new SearchEngine();
        YoutubeVideo vid = new YoutubeVideo();
        try {
            vid = engine.SearchByQueryTerm(title, auth);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoAuthKeyFoundException e) {
            e.printStackTrace();
        }
        return vid;
    }

    @SneakyThrows
    public void init() {
        this.auth = LoadAuthValues.getAuthValues();
    }

    public static void main(String[] args) {
        YoutubeSearchApp app = new YoutubeSearchApp();
        YoutubeVideo vid = app.getYoutubeVideoFromTitle("the beatles - hello");
        System.out.println(vid);
    }
}
