package com.yekong.rss;

public class RssEntry {
    String title;
    String link;
    String description;
    String pubDate;

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[RssEntry]");
        sb.append("\n").append("title=").append(title);
        sb.append("\n").append("link=").append(link);
        sb.append("\n").append("pubDate=").append(pubDate);
        return sb.toString();
    }
}
