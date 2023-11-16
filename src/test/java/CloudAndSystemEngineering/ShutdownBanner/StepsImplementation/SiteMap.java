package CloudAndSystemEngineering.ShutdownBanner.StepsImplementation;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SiteMap {

    private static final String DEFAULT_URL = "https://candymapper.com/";
    private static final String FILE_NAME = "sitemap.xml";

    public static void main(String[] args) {
//        List<String> urls = new ArrayList<>();
//        urls.add("/home");
//        urls.add("/about");
//        urls.add("/services");
//        urls.add("/contact");
//
//        try (PrintWriter out = new PrintWriter(new File(FILE_NAME))) {
//            out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
//            out.println("<urlset xmlns=\"http://www.sitemaps.org/schemas/sitemap/0.9\">");
//
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            for (String url : urls) {
//                out.println("\t<url>");
//                out.println("\t\t<loc>" + DEFAULT_URL + url + "</loc>");
//                out.println("\t\t<lastmod>" + sdf.format(new Date()) + "</lastmod>");
//                out.println("\t\t<changefreq>daily</changefreq>");
//                out.println("\t\t<priority>0.5</priority>");
//                out.println("\t</url>");
//            }
//
//            out.println("</urlset>");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}