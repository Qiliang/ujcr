package com.open;

import java.io.File;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;


public class Program {

	public static void main(String[] args) throws Throwable {
		JarFile jar = new JarFile("C:/Users/Edison/.m2/repository/javax/jcr/jcr/2.0/jcr-2.0.jar");
		Enumeration<JarEntry> enumeration = jar.entries();
		while (enumeration.hasMoreElements()) {
			JarEntry entry = (JarEntry) enumeration.nextElement();
			System.out.println(entry.getName());
			// "C:/Users/Edison/Desktop/jcr"
			String filename = entry.getName();
			if (filename.contains(".class") && !filename.contains("Exception")) {
				File dir = new File(FilenameUtils.concat("C:/Users/Edison/Desktop", FilenameUtils.getPath(filename)));
				dir.mkdirs();
				File file = new File(FilenameUtils.concat(dir.getAbsolutePath(), FilenameUtils.getBaseName(filename) + "Impl.java"));
				file.createNewFile();
				String text = "public class " + FilenameUtils.getBaseName(filename) + "Impl implements "+FilenameUtils.getBaseName(filename)+"{}";
				
				org.apache.commons.io.FileUtils.writeStringToFile(file, text);
				
			}

		}
	}

}