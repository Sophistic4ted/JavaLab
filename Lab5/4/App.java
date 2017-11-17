package com.kamil.maven.quickstart;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

import io.indico.Indico;

import io.indico.api.results.BatchIndicoResult;
import io.indico.api.utils.IndicoException;


class Photosort{
//ma wyrzucać wyjątki kiedy :jeśli podany folder nie istnieje, lub gdy plik wewnątrz folderu ze zdjęciami są pliki nie będące zdjęciem, 
	//gdy nie ma połączenia sieciowego, klucz API jest niepoprawny
		public static void main(String[] args) {
			ArrayList<String> example = new ArrayList<String>();
			
		
		/*Stream<Path> paths = Files.walk(Paths.get("C:\\Users\\Kamil\\JavaWorkspace\\quickstart\\src\\main\\foto"));
			paths
			    .filter(Files::isRegularFile)
			    .forEach(System.out::println);
				*/


			final File folder = new File("C:\\Users\\Kamil\\JavaWorkspace\\quickstart\\src\\main\\quickstart\\foto");
			try {
				listFilesForFolder(folder,example);
			} catch (WrongFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
			for( String s : example) {
				System.out.println(s);
			}
			
			//example.forEach(System.out::println);
			Indico indico;
			try {
				indico = new Indico("739cae82705a6258c20f45931da69e8d");
				// batch example
	
				BatchIndicoResult multiple = indico.imageFeatures.predict(example);
				List<List<Double>> results= multiple.getImageFeatures();
				System.out.println(results);
			} catch (IndicoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedOperationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		

	
	}
		static ArrayList<String> listFilesForFolder(final File folder,ArrayList<String> example) throws WrongFileException {
		    for (final File fileEntry : folder.listFiles()) {
		        if (!fileEntry.isFile()) {
		            throw new WrongFileException("Not a .jpg file!");
		        } else {
		        	System.out.println("znaleziono plik");
		            example.add(fileEntry.getPath());
		        }
		    }
		    return example;
		}
}
