package org.example.designpatterns.solid;

public class DependencyInversion {
}
//bad practice
class MySqlDB{
    public void connect(){
        System.out.println("Connecting MySql");
    }
}
class UerService{
    MySqlDB mySqlDB=new MySqlDB();
    public void loadUsers(){
        mySqlDB.connect();
    }
}
interface Database{
    void connect();
}
class MSqlDatabase implements Database{
    @Override
    public void connect(){
        System.out.println("Connecting to MySql");
    }
}
class PostreSqlDatabase implements Database{
    @Override
    public  void connect(){
        System.out.println("Connecting to Postge" );
    }
}
class UserSErvice1{
    private  final Database database;
    public UserSErvice1(Database database){
        this.database=database;

    }
    public void loadusers(){
        database.connect();

    }

}

