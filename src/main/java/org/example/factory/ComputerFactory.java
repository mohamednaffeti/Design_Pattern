package org.example.factory;

import java.sql.SQLException;

public class ComputerFactory {

    public static Computer getComputer(String type)  {
        switch (type){
            case "pc" :
                return new Pc("8GO","1TO","2.3 Ghz");

            case "pcGamer" :
                return new Pc("16GO","2TO","2.3 Ghz");

            case "Server" :
                return new Pc("128GO","2TO","2.3 Ghz");

            default:
                throw new IllegalArgumentException("Ce pc n'existe pas");


        }
    }
}
