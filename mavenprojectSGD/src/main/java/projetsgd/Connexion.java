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

/**
 *
 * @author florab
 */
public class Connexion {
    
    // TODO code application logic here
    String s="gd238947";    
    char [ ] pass = s.toCharArray();
    MongoCredential credential = MongoCredential.createCredential("gd238947", "gd238947", pass);
    MongoClient client = new MongoClient(new ServerAddress("mongo", 27017), Arrays.asList(credential));
    MongoDatabase db = client.getDatabase("gd238947");
    // Liste des collections
    /*for (String name : db.listCollectionNames()) {
        System.out.println(name);
    }*/
    MongoCollection<Document> collection = db.getCollection("Jeux");
    
}
