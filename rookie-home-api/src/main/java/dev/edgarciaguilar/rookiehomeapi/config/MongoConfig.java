package dev.edgarciaguilar.rookiehomeapi.config;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.lang.NonNull;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration{

	@Value("${mongodb.database}")
	private String database;
	
	@Value("${mongodb.username}")
	private String username;
	
	@Value("${mongodb.password}")
	private String password;
	
	@Value("${mongodb.host}")
	private String host;
	
	@NonNull
	@Override
	protected String getDatabaseName() {
		return database;
	}

	@NonNull
	@Override
	protected Collection<String> getMappingBasePackages() {
		return Collections.singleton("dev.edgarciaguilar.rookiehomeapi");
	}

	@NonNull
	@Override
	public MongoClient mongoClient() {
		String url = "mongodb+srv://%s:%s@%s".formatted(username, password, host);
		ConnectionString connectionString = new ConnectionString(url);
		MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
				.applyConnectionString(connectionString)
				.build();
		
		return MongoClients.create(mongoClientSettings);
	}
	
	
	

}
