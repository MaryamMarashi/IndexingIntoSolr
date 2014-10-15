package no.uis.solr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.client.solrj.response.UpdateResponse;

/**
 * Created by MaryamMarashi on 08/10/14.
 */
public class Main {

    public static void main(String[] args) throws IOException, SolrServerException {
        try {
            SolrServer server = new HttpSolrServer("http://localhost:8983/solr");
            String filePath = "/Users/MaryamMarashi/Desktop/news.rpt";


            ArrayList<Data> list = new ArrayList<Data>();
            BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
            String line;
            int i = 0;
            while ((line = br.readLine()) != null && ++i < 1000000) {

                if (i < 3) continue;
                if(line.length()<=841) continue;
                Data data = new Data();
                list.add(data);
                data.setId(line.substring(0, 21).trim());
                data.setLangID(line.substring(22, 33).trim());
                data.setRssID(line.substring(34, 45).trim());
                data.setDatePublished(line.substring(46, 59).trim());
                data.setTitle(line.substring(60, 317).trim());
                data.setDescription(line.substring(318, 574).trim());
                data.setLang(line.substring(575, 583).trim());
                data.setUrl(line.substring(584, 840).trim());
                data.setSourceHost(line.substring(841, line.length() - 1).trim());
                //System.out.println(data.toString());


                SolrInputDocument document = new SolrInputDocument();
                document.addField("id", data.id);
                document.addField("langID",data.langID);
                document.addField("rssID", data.rssID);
                document.addField("datePublished", data.datePublished);
                document.addField("title", data.title);
                document.addField("description", data.description);
                document.addField("lang", data.lang);
                document.addField("url", data.url);
                document.addField("sourceHost", data.sourceHost);
                 UpdateResponse response = server.add(document);
                System.out.println(response.toString());

            }
            server.commit();
            server.optimize();
            br.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}