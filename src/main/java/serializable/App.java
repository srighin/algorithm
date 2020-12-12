package serializable;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String fileName = "serializedObject.ser";
        SerializedObject object = new SerializedObject();
        object.setId(1);
        object.setName("Sriman");
        object.setSalary(1200);
        System.out.println("Serialization in progress "+object.toString());
        try {
            SerializationUtil.serialized(fileName, object);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("De-serialization in progress");

        try {
            SerializedObject deserialized = SerializationUtil.deserialized(fileName);
            System.out.println("Deserialized Object"+deserialized.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
