package program;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DataInput {

	private List<Shape> shapes;
	private Integer numberOfShapes;
	
	DataInput() {
		shapes = new ArrayList<Shape>();
		numberOfShapes = 0;
	}
	
	public void ReadShapes()
	{
		InputNumberOfShapes();
	}
	
	private void InputNumberOfShapes() {
		
		System.out.print("How many shapes? ");
		try {
			BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
			 numberOfShapes = Integer.parseInt(consoleReader.readLine());
		} catch (Exception e) {
			e.printStackTrace();
			System.err.print("Input failed!");
		}
	}
}
