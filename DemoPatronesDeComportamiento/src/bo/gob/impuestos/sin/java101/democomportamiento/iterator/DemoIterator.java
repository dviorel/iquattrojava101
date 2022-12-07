package bo.gob.impuestos.sin.java101.democomportamiento.iterator;

import java.sql.ResultSet;

public class DemoIterator {

    public static void main(String[] args) {
        Container repositoryName = new RepositoryName();
//        Iterator iterator = repositoryName.getIterator();
//        while(iterator.hasNext()){
//            String name = (String)iterator.next();
//            System.out.println("Nombre: " + name);
//        }
        for(Iterator iterator = repositoryName.getIterator();
            iterator.hasNext();
        ){
            String name = (String)iterator.next();
            System.out.println("Nombre: " + name);
        }



    }

}
