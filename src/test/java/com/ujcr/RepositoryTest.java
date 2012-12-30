package com.ujcr;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.RepositoryFactory;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.neo4j.kernel.impl.util.FileUtils;

public class RepositoryTest {
//
//	private static final String DB_PATH = "target/neo4j-test-db";
//
//	private static void deleteDbFiles(){
//		try {
//			FileUtils.deleteRecursively(new File(DB_PATH));
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}
//	}
//	
//	@BeforeClass
//	public static void beforeClass() {
//		deleteDbFiles();
//		Ujcr.start(DB_PATH);
//	}
//
//	@AfterClass
//	public static void afterClass() {
//		Ujcr.stop();
//	}
//
//	@Test
//	public void loginTest() throws RepositoryException {
//		RepositoryFactory repositoryFactory = Ujcr.getRepositoryFactory();
//		Repository repository = repositoryFactory.getRepository(new HashMap<String, Object>());
//		Session session = repository.login(new SimpleCredentials("admin", "admin".toCharArray()));
//		org.junit.Assert.assertNotNull(session);
//	}
}
