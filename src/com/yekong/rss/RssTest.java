package com.yekong.rss;


public class RssTest {
    public static void main(String[] args) {
        String[] urls = new String[] {
                "http://www.androiddesignpatterns.com/feed.atom",
                "http://www.androidweekly.cn/rss/",
                "http://likaiwen.cn/feed",
                "http://www.ruanyifeng.com/blog/atom.xml",
                "http://ticktick.blog.51cto.com/rss.php?uid=823160",
                "http://droidyue.com/atom.xml",
                "http://antonioleiva.com/feed/",
                "http://drakeet.me/feed",
                "http://feeds.feedburner.com/StylingAndroid",
                "http://andrewliu.in/atom.xml",
                "http://veaer.com/atom.xml",
                "http://blog.bihe0832.com/pages/atom.xml",
                "http://waylenw.github.io/atom.xml",
                "http://yanghui.name/atom.xml",
        };
        parseRss(urls[urls.length - 1]);
    }

    private static void parseRss(String url) {
        try {
            RssHandler handler = RssReader.parse(url);
            System.out.println(handler.getFeed());
            for (int i = 0; i < handler.getEntries().size(); i++) {
                RssEntry item = handler.getEntries().get(i);
                System.out.println(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
