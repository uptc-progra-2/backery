package co.edu.uptc.desserts.ms.utils.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import co.edu.uptc.desserts.ms.model.Dessert;
import co.edu.uptc.desserts.ms.utils.FilesOperations;

@Component
public class FilesOperationsImpl implements FilesOperations {

	@Override
	public void writeDessert(String path, Dessert dessert) {
		File file = new File(path);
		
		try(PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
			writer.append(dessert.getId()+"").append(";")
			.append(dessert.getName()).append(";")
			.append(dessert.getAmount()+"").append(";")
			.append(dessert.getRecipe()).append("\n");
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

	@Override
	public List<Dessert> readDesserts(String path) {
		File file = new File(path);
		List<Dessert> desserts = new ArrayList<>();
		
		try(Scanner reader = new Scanner(file)) {
			reader.useDelimiter("\n");
			
			while(reader.hasNext()) {
				String line = reader.next();
				String[] dessertLine = line.split(";");
				
				Dessert dessert = new Dessert();
				dessert.setId(Long.parseLong(dessertLine[0]));
				dessert.setName(dessertLine[1]);
				dessert.setAmount(Double.parseDouble(dessertLine[2]));
				
				
				if(dessertLine.length >= 4 ) {
					dessert.setRecipe(dessertLine[3]);
				}
				
				desserts.add(dessert);
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return desserts;
	}

}
