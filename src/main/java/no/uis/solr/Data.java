package no.uis.solr;

/**
 * Created by MaryamMarashi on 08/10/14.
 */
public class Data {
    String id;
    String langID;
    String rssID;
    String datePublished;
    String title;
    String description;
    String lang;
    String url;
    String sourceHost;

    public Data() {
    }

    public Data(String id, String langID, String rssID, String datePublished, String title, String description, String lang, String url, String sourceHost) {
        this.id = id;
        this.langID = langID;
        this.rssID = rssID;
        this.datePublished = datePublished;
        this.title = title;
        this.description = description;
        this.lang = lang;
        this.url = url;
        this.sourceHost = sourceHost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLangID() {
        return langID;
    }

    public void setLangID(String langID) {
        this.langID = langID;
    }

    public String getRssID() {
        return rssID;
    }

    public void setRssID(String rssID) {
        this.rssID = rssID;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSourceHost() {
        return sourceHost;
    }

    public void setSourceHost(String sourceHost) {
        this.sourceHost = sourceHost;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", langID='" + langID + '\'' +
                ", rssID='" + rssID + '\'' +
                ", datePublished='" + datePublished + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", lang='" + lang + '\'' +
                ", url='" + url + '\'' +
                ", sourceHost='" + sourceHost + '\'' +
                '}';
    }
}
