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
    
    public MongoCollection<Document> getCollection(){
        return this.collection;
    }
    
    public Connexion(String str){
        collection = db.getCollection(str);
    }
    public List<String> requete(Map<String,Object> map){
        
        List<String> res=new ArrayList<String>();
        int temp=map.size();
        Set<Map.Entry<String, Object>> setMap = map.entrySet();
                Iterator<Map.Entry<String, Object>> it = setMap.iterator();
        switch (temp){
            case 1:{
                Entry<String, Object> e = it.next();
                List<Document> jeux = (List<Document>) collection.find(eq(e.getKey(),e.getValue())).into(
				new ArrayList<Document>());

		for (Document jeu : jeux) {

			res.add(jeu.getString("_id"));

		}
                break;
            }
            case 2:{
                Entry<String, Object> e = it.next();
                Entry<String, Object> f = it.next();
                List<Document> jeux = (List<Document>) collection.find(and(eq(e.getKey(),e.getValue()),eq(f.getKey(),f.getValue()))).into(
				new ArrayList<Document>());

		for (Document jeu : jeux) {

			res.add(jeu.getString("_id"));

		}
                break;
            }
            case 3:{
                Entry<String, Object> e = it.next();
                Entry<String, Object> f = it.next();
                Entry<String, Object> g = it.next();
                List<Document> jeux = (List<Document>) collection.find(and(and(eq(e.getKey(),e.getValue()),eq(f.getKey(),f.getValue())),eq(g.getKey(),g.getValue()))).into(
				new ArrayList<Document>());

		for (Document jeu : jeux) {

			res.add(jeu.getString("_id"));

		}
                break;            
            }
            case 4:{
                Entry<String, Object> e = it.next();
                Entry<String, Object> f = it.next();
                Entry<String, Object> g = it.next();
                Entry<String, Object> h = it.next();
                List<Document> jeux = (List<Document>) collection.find(and(and(and(eq(e.getKey(),e.getValue()),eq(f.getKey(),f.getValue())),eq(g.getKey(),g.getValue())),eq(h.getKey(),h.getValue()))).into(
				new ArrayList<Document>());

		for (Document jeu : jeux) {

			res.add(jeu.getString("_id"));

		}
                break;
            }
            case 5:{
                Entry<String, Object> e = it.next();
                Entry<String, Object> f = it.next();
                Entry<String, Object> g = it.next();
                Entry<String, Object> h = it.next();
                Entry<String, Object> i = it.next();
                List<Document> jeux = (List<Document>) collection.find(and(and(and(and(eq(e.getKey(),e.getValue()),eq(f.getKey(),f.getValue())),eq(g.getKey(),g.getValue())),eq(h.getKey(),h.getValue())),eq(i.getKey(),i.getValue()))).into(
				new ArrayList<Document>());

		for (Document jeu : jeux) {

			res.add(jeu.getString("_id"));

		}
                break;
            }
            case 6:{
                Entry<String, Object> e = it.next();
                Entry<String, Object> f = it.next();
                Entry<String, Object> g = it.next();
                Entry<String, Object> h = it.next();
                Entry<String, Object> i = it.next();
                Entry<String, Object> j = it.next();
                List<Document> jeux = (List<Document>) collection.find(and(and(and(and(and(eq(e.getKey(),e.getValue()),eq(f.getKey(),f.getValue())),eq(g.getKey(),g.getValue())),eq(h.getKey(),h.getValue())),eq(i.getKey(),i.getValue())),eq(j.getKey(),j.getValue()))).into(
				new ArrayList<Document>());

		for (Document jeu : jeux) {

			res.add(jeu.getString("_id"));

		}
                break;
            }
            case 7:{
                Entry<String, Object> e = it.next();
                Entry<String, Object> f = it.next();
                Entry<String, Object> g = it.next();
                Entry<String, Object> h = it.next();
                Entry<String, Object> i = it.next();
                Entry<String, Object> j = it.next();
                Entry<String, Object> k = it.next();
                List<Document> jeux = (List<Document>) collection.find(and(and(and(and(and(and(eq(e.getKey(),e.getValue()),eq(f.getKey(),f.getValue())),eq(g.getKey(),g.getValue())),eq(h.getKey(),h.getValue())),eq(i.getKey(),i.getValue())),eq(j.getKey(),j.getValue())),eq(k.getKey(),k.getValue()))).into(
				new ArrayList<Document>());

		for (Document jeu : jeux) {

			res.add(jeu.getString("_id"));

		}
                break;
            }
            case 8:{
                Entry<String, Object> e = it.next();
                Entry<String, Object> f = it.next();
                Entry<String, Object> g = it.next();
                Entry<String, Object> h = it.next();
                Entry<String, Object> i = it.next();
                Entry<String, Object> j = it.next();
                Entry<String, Object> k = it.next();
                Entry<String, Object> l = it.next();
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
    
    public Document resultat(String id){
        
        List<Document> temp = (List<Document>) collection.find(eq("_id",id)).into(
				new ArrayList<Document>());
        Document res=temp.get(0);
        
        return res;
        
    }
    public void insert(Map<String,Object> map){
        Document d1=new Document();
        Set<Entry<String, Object>> setMap = map.entrySet();
        Iterator<Entry<String, Object>> it = setMap.iterator();
        while(it.hasNext()){
            Entry<String, Object> e = it.next();
            d1.append(e.getKey() , e.getValue());
        }
        collection.insertOne(d1);
    }
    
    public void update(String id,Map<String,Object> map){
        Document d1=new Document();
        Set<Entry<String, Object>> setMap = map.entrySet();
        Iterator<Entry<String, Object>> it = setMap.iterator();
        while(it.hasNext()){
            Entry<String, Object> e = it.next();
            collection.updateOne(eq("_id",id),set(e.getKey(),e.getValue()));
        }
    }
    
}
