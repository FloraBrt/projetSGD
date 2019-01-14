/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsgd;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.*;
import java.util.*;
import org.bson.Document;
import static com.mongodb.client.model.Accumulators.sum;
import static com.mongodb.client.model.Aggregates.group;
import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.set;
import static java.util.Arrays.asList;
import java.util.Map.Entry;

/**
 *
 * @author gd238947
 */
public class Connexion {
    
    // TODO code application logic here
    String s="gd238947";    
    char [ ] pass = s.toCharArray();
    MongoCredential credential = MongoCredential.createCredential("gd238947", "gd238947", pass);
    MongoClient client = new MongoClient(new ServerAddress("mongo", 27017), Arrays.asList(credential));
    MongoDatabase db = client.getDatabase("gd238947");
    MongoCollection<Document> collection;
    // Liste des collections
    /*for (String name : db.listCollectionNames()) {
        System.out.println(name);
    }*/
    public Connexion(String str){
        collection = db.getCollection(str);
    }
    public List<String> requete(Map<String,String> map){
        Block<Document> printBlock = new Block<Document>() {
            @Override
            public void apply(final Document document) {
                System.out.println(document.toJson());
            }
        };
        List<String> res=new ArrayList<String>();
        int temp=map.size();
        System.out.println(temp);
        Set<Map.Entry<String, String>> setMap = map.entrySet();
                Iterator<Map.Entry<String, String>> it = setMap.iterator();
        switch (temp){
            case 1:{
                Entry<String, String> e = it.next();
                List<Document> jeux = (List<Document>) collection.find(eq(e.getKey(),e.getValue())).into(
				new ArrayList<Document>());

		for (Document jeu : jeux) {

			res.add(jeu.getString("_id"));

		}
                break;
            }
            case 2:{
                Entry<String, String> e = it.next();
                Entry<String, String> f = it.next();
                List<Document> jeux = (List<Document>) collection.find(and(eq(e.getKey(),e.getValue()),eq(f.getKey(),f.getValue()))).into(
				new ArrayList<Document>());

		for (Document jeu : jeux) {

			res.add(jeu.getString("_id"));

		}
                break;
            }
            case 3:{
                Entry<String, String> e = it.next();
                Entry<String, String> f = it.next();
                Entry<String, String> g = it.next();
                List<Document> jeux = (List<Document>) collection.find(and(and(eq(e.getKey(),e.getValue()),eq(f.getKey(),f.getValue())),eq(g.getKey(),g.getValue()))).into(
				new ArrayList<Document>());

		for (Document jeu : jeux) {

			res.add(jeu.getString("_id"));

		}
                break;            
            }
            case 4:{
                Entry<String, String> e = it.next();
                Entry<String, String> f = it.next();
                Entry<String, String> g = it.next();
                Entry<String, String> h = it.next();
                List<Document> jeux = (List<Document>) collection.find(and(and(and(eq(e.getKey(),e.getValue()),eq(f.getKey(),f.getValue())),eq(g.getKey(),g.getValue())),eq(h.getKey(),h.getValue()))).into(
				new ArrayList<Document>());

		for (Document jeu : jeux) {

			res.add(jeu.getString("_id"));

		}
                break;
            }
            case 5:{
                Entry<String, String> e = it.next();
                Entry<String, String> f = it.next();
                Entry<String, String> g = it.next();
                Entry<String, String> h = it.next();
                Entry<String, String> i = it.next();
                List<Document> jeux = (List<Document>) collection.find(and(and(and(and(eq(e.getKey(),e.getValue()),eq(f.getKey(),f.getValue())),eq(g.getKey(),g.getValue())),eq(h.getKey(),h.getValue())),eq(i.getKey(),i.getValue()))).into(
				new ArrayList<Document>());

		for (Document jeu : jeux) {

			res.add(jeu.getString("_id"));

		}
                break;
            }
            case 6:{
                Entry<String, String> e = it.next();
                Entry<String, String> f = it.next();
                Entry<String, String> g = it.next();
                Entry<String, String> h = it.next();
                Entry<String, String> i = it.next();
                Entry<String, String> j = it.next();
                List<Document> jeux = (List<Document>) collection.find(and(and(and(and(and(eq(e.getKey(),e.getValue()),eq(f.getKey(),f.getValue())),eq(g.getKey(),g.getValue())),eq(h.getKey(),h.getValue())),eq(i.getKey(),i.getValue())),eq(j.getKey(),j.getValue()))).into(
				new ArrayList<Document>());

		for (Document jeu : jeux) {

			res.add(jeu.getString("_id"));

		}
                break;
            }
            case 7:{
                Entry<String, String> e = it.next();
                Entry<String, String> f = it.next();
                Entry<String, String> g = it.next();
                Entry<String, String> h = it.next();
                Entry<String, String> i = it.next();
                Entry<String, String> j = it.next();
                Entry<String, String> k = it.next();
                List<Document> jeux = (List<Document>) collection.find(and(and(and(and(and(and(eq(e.getKey(),e.getValue()),eq(f.getKey(),f.getValue())),eq(g.getKey(),g.getValue())),eq(h.getKey(),h.getValue())),eq(i.getKey(),i.getValue())),eq(j.getKey(),j.getValue())),eq(k.getKey(),k.getValue()))).into(
				new ArrayList<Document>());

		for (Document jeu : jeux) {

			res.add(jeu.getString("_id"));

		}
                break;
            }
            case 8:{
                Entry<String, String> e = it.next();
                Entry<String, String> f = it.next();
                Entry<String, String> g = it.next();
                Entry<String, String> h = it.next();
                Entry<String, String> i = it.next();
                Entry<String, String> j = it.next();
                Entry<String, String> k = it.next();
                Entry<String, String> l = it.next();
                List<Document> jeux = (List<Document>)collection.find(and(and(and(and(and(and(and(eq(e.getKey(),e.getValue()),eq(f.getKey(),f.getValue())),eq(g.getKey(),g.getValue())),eq(h.getKey(),h.getValue())),eq(i.getKey(),i.getValue())),eq(j.getKey(),j.getValue())),eq(k.getKey(),k.getValue())),eq(l.getKey(),l.getValue()))).into(
				new ArrayList<Document>());

		for (Document jeu : jeux) {

			res.add(jeu.getString("_id"));

		}
                break;
            }
            default:{
                List<Document> jeux = (List<Document>) collection.find().into(
				new ArrayList<Document>());

		for (Document jeu : jeux) {

			res.add(jeu.getString("_id"));

		}
                break;
            }
        }
        
        return res;
    }
    
    
    
}
