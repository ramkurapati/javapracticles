package Serializable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import Serialization.Employee;

public class SerializingObject {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter File name : ");

		String file = in.readLine();

		System.out.print("Enter extention : ");

		String ext = in.readLine();

		String filename = file + "." + ext;

		File f = new File(filename);

		try {

			ObjectOutput ObjOut = new ObjectOutputStream(new FileOutputStream(
					"C:/" + f));
			Employee e = new Employee("ravi", "ATP", 123);

			ObjOut.writeObject(e);

			ObjOut.close();

			System.out
					.println("Serializing an Object Creation completed successfully.");

		}

		catch (IOException e) {

			System.out.println(e.getMessage());

		}

	}

}
