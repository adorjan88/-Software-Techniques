import java.io.*;

@Author(name = "Gordon")
public class Book implements Serializable {

    private int pageNumber;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Book(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void Serialization(String filename){
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;

        try{
            fileOutputStream = new FileOutputStream(filename);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(this);

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Successful serialization");
        }
        catch (Throwable T){
            T.getStackTrace();
        }
    }

    public void Deserialization(String filename){
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;

        try{
            fileInputStream = new FileInputStream(filename);
            objectInputStream = new ObjectInputStream(fileInputStream);

            Book book = (Book) objectInputStream.readObject();
            System.out.println("Object has been deserialized: "+book.toString());

            fileInputStream.close();
            objectInputStream.close();
        }
        catch (Throwable T){
            T.getStackTrace();
        }
    }
}
