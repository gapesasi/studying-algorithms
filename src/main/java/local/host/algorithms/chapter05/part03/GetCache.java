package local.host.algorithms.chapter05.part03;

import java.util.HashMap;

public class GetCache {
    private static final HashMap<String, String> cache = new HashMap<>();

    public static void main(String[] args) {
        getCacheExample("google.com");
        getCacheExample("facebook.com");
        getCacheExample("google.com");

        System.out.println(cache);
    }
     public static String getCacheExample(String url) {
        if(cache.containsKey(url)) return cache.get(url);

        String data = "Recebe dados do servidor " + url;
        cache.put(url, data);
        return data;
     }
}
