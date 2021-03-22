package com.roytuts.java.singleton.design.pattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationDeserializationTest {

	public static void main(String[] args) {
		try {
			SingletonSerializable ONE_INSTANCE = SingletonSerializable.getInstance();

			// Serialize to a file
			ObjectOutput objOut = new ObjectOutputStream(new FileOutputStream("file.txt"));
			objOut.writeObject(ONE_INSTANCE);
			objOut.close();
			
			ONE_INSTANCE.setName("Sushil");

			// Deserialize from a file
			ObjectInput objIn = new ObjectInputStream(new FileInputStream("file.txt"));
			SingletonSerializable TWO_INSTANCE = (SingletonSerializable) objIn.readObject();			
			objIn.close();

			System.out.println(ONE_INSTANCE.getName());
			System.out.println(TWO_INSTANCE.getName());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
