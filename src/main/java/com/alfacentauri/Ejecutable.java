package com.alfacentauri;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;

public class Ejecutable {

    //
    public static void main( String []args ){
        System.out.println("Ejemplo de conexión de Mongo DB.");
        String uri = "mongodb://usuario:clave@mongodb****";
        MongoClientURI clientURI = new MongoClientURI(uri);
        MongoClient mongoClient = new MongoClient(clientURI);

        MongoDatabase mongoDatabase = mongoClient.getDatabase("MongoDB");
        MongoCollection collection = mongoDatabase.getCollection("test");

        System.out.println("Esta conectada la base de datos.");

        Document found = (Document) collection.find( new Document( "name", "Roger" ) ).first();

    }
}
