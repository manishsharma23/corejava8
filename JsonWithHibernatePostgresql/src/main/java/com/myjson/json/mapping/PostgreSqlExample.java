package com.myjson.json.mapping;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Assert;

public class PostgreSqlExample {
	
	
	private EntityManagerFactory emf =  Persistence.createEntityManagerFactory("my-persistence-unit");
	public void testSelectJsonbEntity() {
		//log.info("... testSelectJsonbEntity ...");

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		MyEntity e = (MyEntity) em.createNativeQuery("SELECT * FROM devschemas.myentity e WHERE e.jsonproperty->'longProp' = '456'", MyEntity.class).getSingleResult();
		
		//Assert.assertNotNull(e.getJsonProperty());
		System.out.println("JSON: stringProp = "+e.getJsonProperty().getStringProp()+"    longProp = "+e.getJsonProperty().getLongProp());
		
		em.getTransaction().commit();
		em.close();
	}
	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "root", "root")) {

			System.out.println("Java JDBC PostgreSQL Example");
			// When this class first attempts to establish a connection, it automatically loads any JDBC 4.0 drivers found within 
			// the class path. Note that your application must manually load any JDBC drivers prior to version 4.0.
//			Class.forName("org.postgresql.Driver"); 

			System.out.println("Connected to PostgreSQL database!");
			Statement statement = connection.createStatement();
			System.out.println("Reading car records...");
			System.out.printf("%-30.30s  %-30.30s%n", "ID", "Id");
			ResultSet resultSet = statement.executeQuery("SELECT * FROM devschemas.test");
			while (resultSet.next()) {
				System.out.printf("%-30.30s  %-30.30s%n", resultSet.getString("id"), resultSet.getString("id"));
			}
			
		/*	ResultSet resultSet = statement.executeQuery("SELECT * FROM devschemas.myentity e WHERE e.jsonproperty->'longProp' = '456'");
			while (resultSet.next()) {
				System.out.printf("%-30.30s  %-30.30s%n", resultSet.getString("id"), resultSet.getString("id"));
			}*/
			
			//new PostgreSqlExample().testSelectJsonbEntity();

		} /*catch (ClassNotFoundException e) {
			System.out.println("PostgreSQL JDBC driver not found.");
			e.printStackTrace();
		}*/ catch (SQLException e) {
			System.out.println("Connection failure.");
			e.printStackTrace();
		}
	}
}
