package serializable;

import java.io.*;

public class SerializationUtil {

    public static SerializedObject deserialized(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SerializedObject readObject = (SerializedObject) objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();
        return readObject;
    }

    public static void serialized(String filename, SerializedObject object) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(object);
        fileOutputStream.close();
        objectOutputStream.close();
    }
}
