package com.yekong.rss;

public class RssFeed {
    public String title;
    public String link;
    public String description;
    public String lastBuildDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLastBuildDate() {
        return lastBuildDate;
    }

    public void setLastBuildDate(String lastBuildDate) {
        this.lastBuildDate = lastBuildDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[RssFeed]");
        sb.append("\n").append("title=").append(title);
        sb.append("\n").append("link=").append(link);
        sb.append("\n").append("lastBuildDate=").append(lastBuildDate);
        return sb.toString();
    }
}
