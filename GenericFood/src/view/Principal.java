package view;

import java.io.IOException;

import controller.GenericFood;
import controller.IGenericFood;

public class Principal {
	public static void main(String[] args) {
		IGenericFood arqCont = new GenericFood();
		String path = "C:\\WINDOWS\\TEMP\\";
		String name = "generic_food.csv";
		try {
			arqCont.readDir(path);
			arqCont.readFile(path, name);
		} catch (IOException e) {
			e.printStackTrace();
		}
}
}