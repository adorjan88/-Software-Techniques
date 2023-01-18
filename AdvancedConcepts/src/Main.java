import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void printNumbers(){
        for(int i = 1; i<11; i++){
            System.out.print(i+" ");
            try{
                Thread.sleep(400);
            }catch (InterruptedException e){
                e.getStackTrace();
            }
        }
    }

    public static void printLetters(){
        for (int i = 97; i<107;i++){
            String str = Character.toString((char) i);
            System.out.print(str+" ");
            try{
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.getStackTrace();
            }
        }
    }


    public static void main(String[] args) {

        Book book = new Book(200);

        Author author = book.getClass().getAnnotation(Author.class);
        System.out.println(author.name());

        book.Serialization("output.txt");
        book.Deserialization("output.txt");

        //implements runnable, if you want to extend from other class, not only from thread class
        Thread printNumbers = new Thread(Main::printLetters);
        printNumbers.start();

        Thread printLetters = new Thread(Main::printNumbers);
        printLetters.start();

        try{
            printLetters.join();
            printNumbers.join();
        }catch (InterruptedException e){
            e.getStackTrace();
        }

        System.out.println();

        Threads threads = new Threads();
        threads.run(5);

        Threads threads1 = new Threads();
        threads1.run(10);

        String url = "jdbc:postgresql://localhost/test";

        String createTable = "CREATE TABLE Persons (\n" +
                "    ID int NOT NULL,\n" +
                "    LastName varchar(255) NOT NULL,\n" +
                "    FirstName varchar(255),\n" +
                "    Age int,\n" +
                "    CONSTRAINT PK_Person PRIMARY KEY (ID,LastName)\n" +
                ");";

        try(Connection connection = DriverManager.getConnection(url,"postgres","postgres")){ //database details are needed too!
            System.out.println("Connected successfully!");
            PreparedStatement preparedStatement = connection.prepareStatement(createTable);

            preparedStatement.executeUpdate();
            preparedStatement.close();

        }
        catch (SQLException e){
            e.printStackTrace();
        }



    }
}