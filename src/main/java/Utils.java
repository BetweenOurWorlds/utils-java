import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static final String schema = "http://schema.org/";
    public static final String dbo = "http://dbpedia.org/ontology/";
    public static final String actionstatus = "https://betweenourworlds.org/actionstatus/";
    public static final String dbp = "http://dbpedia.org/resource/";

    public static List<String> getClasses(String str) {
        ArrayList<String> result = new ArrayList<>();

        switch(str.toLowerCase()) {
            case "tv":
                result.add(schema + "TVSeries");
                result.add(dbo + "TelevisionShow");
                break;
            case "movie":
                result.add(schema + "Movie");
                result.add(dbo + "Film");
                break;
        }

        return result;
    }

    public static String scaleRating(String rating) {
        try {
            int r = Integer.parseInt(rating);
            return "" + (r / 2);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static String getActionStatus(String status) {
        if (status != null) {
            switch (status) {
                case "completed":
                case "planned":
                case "current":
                    return actionstatus + status;
                case "dropped":
                    return actionstatus + "stopped";
                case "on_hold":
                    return actionstatus + "onhold";
            }
        }

        return null;
    }

    public static String getStreamAgent(String agent) {
        if (agent != null) {
            switch (agent.toLowerCase()) {
                case "crunchyroll":
                    return dbp + "Crunchyroll";
                case "hulu":
                    return dbp + "Hulu";
                case "netflix":
                    return dbp + "Netflix";
                case "funimation":
                    return dbp + "Funimation";
            }
        }

        return null;
    }
}
