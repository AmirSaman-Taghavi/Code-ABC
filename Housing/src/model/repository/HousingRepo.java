package model.repository;

import model.entity.HousingEnti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class HousingRepo implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public void Housing() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-UPV59LDR:1521:xe",
            "Housing", "samrod82");
        connection.setAutoCommit(false);
    }

    public void groundsAndHouses() throws Exception{
        preparedStatement = connection.prepareStatement("insert into entity_dependency(id, abroad, against) values" +
            "(?, ?, ?)");
        preparedStatement.setLong(1, 1);
        preparedStatement.setLong(2, 1);
        preparedStatement.setLong(3, 2);

        preparedStatement = connection.prepareStatement("insert into entity_dependency(id, abroad, against) values" +
                "(?, ?, ?)");
        preparedStatement.setLong(1, 2);
        preparedStatement.setLong(2, 2);
        preparedStatement.setLong(3, 3);

        preparedStatement = connection.prepareStatement("insert into entity_dependency(id, abroad, against) values" +
                "(?, ?, ?)");
        preparedStatement.setLong(1, 3);
        preparedStatement.setLong(2, 3);
        preparedStatement.setLong(3, 4);

        preparedStatement = connection.prepareStatement("insert into groundhouses(area, price, sellersname, address" +
            "pipedwater, electricity, naturalgas, delete_date, delete_by, type, agent_name, agent_record_date" +
                "agent_record_time)" +
            "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        preparedStatement.setString(1, "100000 square meters");
        preparedStatement.setString(2, "600000000");
        preparedStatement.setString(3, "AmirArsalan yarian");
        preparedStatement.setString(4, "Tehran Province, Robatkarim city, Shahid Hemmat Square, " +
                "Yahya Alley, No.12");
        preparedStatement.setString(5, "Yes");
        preparedStatement.setString(6, "No");
        preparedStatement.setString(7, "Yes");
        preparedStatement.setString(8, "1401/02/21");
        preparedStatement.setString(9, "amirsaman");
        preparedStatement.setString(10, "Ground");

        preparedStatement = connection.prepareStatement("insert into groundhouses(area, price, sellersname, address" +
                "pipedwater, electricity, naturalgas, delete_date, delete_by, type, agent_name, agent_record_date" +
                "agent_record_time)" +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        preparedStatement.setString(1, "120 square meters");
        preparedStatement.setString(2, "300000000, 5000000");
        preparedStatement.setString(3, "Ali Bagheri");
        preparedStatement.setString(4, "Tehran Province, Tehran city, Tehranpars, Rashid St" +
                ", Ahaniamine St, Mohsen Alley, No.28, Unit 3");
        preparedStatement.setString(5, "Yes");
        preparedStatement.setString(6, "Yes");
        preparedStatement.setString(7, "Yes");
        preparedStatement.setString(8, "1401/02/21");
        preparedStatement.setString(9, "amirsaman");
        preparedStatement.setString(10, "House");

        preparedStatement = connection.prepareStatement("insert into groundhouses(area, price, sellersname, address" +
                "pipedwater, electricity, naturalgas, delete_date, delete_by, type, agent_name, agent_record_date" +
                "agent_record_time)" +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        preparedStatement.setString(1, "4200000 square meters");
        preparedStatement.setString(2, "450000000");
        preparedStatement.setString(3, "Gholamreza Gamshidi");
        preparedStatement.setString(4, "Tehran Province, Parand city, EmamKhmeini Boulevard, Motaghi St" +
                "Yavar Alley");
        preparedStatement.setString(5, "No");
        preparedStatement.setString(6, "Yes");
        preparedStatement.setString(7, "No");
        preparedStatement.setString(8, "1401/02/21");
        preparedStatement.setString(9, "amirsaman");
        preparedStatement.setString(10, "Ground");

        preparedStatement = connection.prepareStatement("insert into groundhouses(area, price, sellersname, address" +
                "pipedwater, electricity, naturalgas, delete_date, delete_by, type, agent_name, agent_record_date" +
                "agent_record_time)" +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        preparedStatement.setString(1, "1200 meters");
        preparedStatement.setString(2, "900000000");
        preparedStatement.setString(3, "Javad Lotfi");
        preparedStatement.setString(4, "Tehran Province, Vavan city, Shahid Beheshti Boulevard, " +
                "Nicknam St, Moridi Alley, No.32");
        preparedStatement.setString(5, "Yes");
        preparedStatement.setString(6, "Yes");
        preparedStatement.setString(7, "Yes");
        preparedStatement.setString(8, "1401/02/21");
        preparedStatement.setString(9, "amirsaman");
        preparedStatement.setString(10, "House");

        preparedStatement = connection.prepareStatement("insert into groundhouses(area, price, sellersname, address" +
                "pipedwater, electricity, naturalgas, delete_date, delete_by, type, agent_name, agent_record_date" +
                "agent_record_time)" +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        preparedStatement.setString(1, "400 square meters");
        preparedStatement.setString(2, "820000000");
        preparedStatement.setString(3, "Meharn Nori");
        preparedStatement.setString(4, "Tehran Province, Tehran city, Shahid Kolahdoz St, Motahhary St" +
                "Shahid Tehranchi Alley, No.28");
        preparedStatement.setString(5, "Yes");
        preparedStatement.setString(6, "Yes");
        preparedStatement.setString(7, "Yes");
        preparedStatement.setString(8, "1401/02/21");
        preparedStatement.setString(9, "amirsaman");
        preparedStatement.setString(10, "House");
    }

    public void contractsAndTransactions(HousingEnti housingEnti) throws Exception{
        preparedStatement = connection.prepareStatement("insert into contractstransactions (id_code, agent_password" +
            "land_type, people_date, people_time, registeredcontract, finalprice, sellersnationalcode" +
            ", sellersfathername, buyersnationalcode, buyersfathername, delete_date, delete_by, id_groundhouses" +
            "process_completed) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        preparedStatement.setString(1, housingEnti.getId_Code());
        preparedStatement.setString(2, housingEnti.getAgent_Password());
        preparedStatement.setString(3, housingEnti.getLand_Type());
        preparedStatement.setString(4, housingEnti.getPeople_Data());
        preparedStatement.setString(5, housingEnti.getPeople_Time());
        preparedStatement.setString(6, housingEnti.getRegisteredContract());
        preparedStatement.setString(7, housingEnti.getFinalPrice());
        preparedStatement.setString(8, housingEnti.getSellersNationalCode());
        preparedStatement.setString(9, housingEnti.getSellersFatherName());
        preparedStatement.setString(10, housingEnti.getBuyersNationalCode());
        preparedStatement.setString(11, housingEnti.getBuyersFatherName());
        preparedStatement.setString(12, "1401/02/21");
        preparedStatement.setString(13, "amirsaman");
        preparedStatement.setLong(14, 1);
        preparedStatement.setString(15, "Yes");

        preparedStatement = connection.prepareStatement("insert into contractstransactions (id_code, agent_password" +
                "land_type, people_date, people_time, registeredcontract, finalprice, sellersnationalcode" +
                ", sellersfathername, buyersnationalcode, buyersfathername, delete_date, delete_by, id_groundhouses" +
                "process_completed) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        preparedStatement.setString(1, housingEnti.getId_Code());
        preparedStatement.setString(2, housingEnti.getAgent_Password());
        preparedStatement.setString(3, housingEnti.getLand_Type());
        preparedStatement.setString(4, housingEnti.getPeople_Data());
        preparedStatement.setString(5, housingEnti.getPeople_Time());
        preparedStatement.setString(6, housingEnti.getRegisteredContract());
        preparedStatement.setString(7, housingEnti.getFinalPrice());
        preparedStatement.setString(8, housingEnti.getSellersNationalCode());
        preparedStatement.setString(9, housingEnti.getSellersFatherName());
        preparedStatement.setString(10, housingEnti.getBuyersNationalCode());
        preparedStatement.setString(11, housingEnti.getBuyersFatherName());
        preparedStatement.setString(12, "1401/02/21");
        preparedStatement.setString(13, "amirsaman");
        preparedStatement.setLong(14, 2);
        preparedStatement.setString(15, "Yes");

        preparedStatement = connection.prepareStatement("insert into contractstransactions (id_code, agent_password" +
                "land_type, people_date, people_time, registeredcontract, finalprice, sellersnationalcode" +
                ", sellersfathername, buyersnationalcode, buyersfathername, delete_date, delete_by, id_groundhouses" +
                "process_completed) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        preparedStatement.setString(1, housingEnti.getId_Code());
        preparedStatement.setString(2, housingEnti.getAgent_Password());
        preparedStatement.setString(3, housingEnti.getLand_Type());
        preparedStatement.setString(4, housingEnti.getPeople_Data());
        preparedStatement.setString(5, housingEnti.getPeople_Time());
        preparedStatement.setString(6, housingEnti.getRegisteredContract());
        preparedStatement.setString(7, housingEnti.getFinalPrice());
        preparedStatement.setString(8, housingEnti.getSellersNationalCode());
        preparedStatement.setString(9, housingEnti.getSellersFatherName());
        preparedStatement.setString(10, housingEnti.getBuyersNationalCode());
        preparedStatement.setString(11, housingEnti.getBuyersFatherName());
        preparedStatement.setString(12, "1401/02/21");
        preparedStatement.setString(13, "amirsaman");
        preparedStatement.setLong(14, 1);
        preparedStatement.setString(15, "Yes");

        preparedStatement = connection.prepareStatement("insert into contractstransactions (id_code, agent_password" +
                "land_type, people_date, people_time, registeredcontract, finalprice, sellersnationalcode" +
                ", sellersfathername, buyersnationalcode, buyersfathername, delete_date, delete_by, id_groundhouses" +
                "process_completed) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        preparedStatement.setString(1, housingEnti.getId_Code());
        preparedStatement.setString(2, housingEnti.getAgent_Password());
        preparedStatement.setString(3, housingEnti.getLand_Type());
        preparedStatement.setString(4, housingEnti.getPeople_Data());
        preparedStatement.setString(5, housingEnti.getPeople_Time());
        preparedStatement.setString(6, housingEnti.getRegisteredContract());
        preparedStatement.setString(7, housingEnti.getFinalPrice());
        preparedStatement.setString(8, housingEnti.getSellersNationalCode());
        preparedStatement.setString(9, housingEnti.getSellersFatherName());
        preparedStatement.setString(10, housingEnti.getBuyersNationalCode());
        preparedStatement.setString(11, housingEnti.getBuyersFatherName());
        preparedStatement.setString(12, "1401/02/21");
        preparedStatement.setString(13, "amirsaman");
        preparedStatement.setLong(14, 1);
        preparedStatement.setString(15, "Yes");

        preparedStatement = connection.prepareStatement("insert into contractstransactions (id_code, agent_password" +
                "land_type, people_date, people_time, registeredcontract, finalprice, sellersnationalcode" +
                ", sellersfathername, buyersnationalcode, buyersfathername, delete_date, delete_by, id_groundhouses" +
                "process_completed) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        preparedStatement.setString(1, housingEnti.getId_Code());
        preparedStatement.setString(2, housingEnti.getAgent_Password());
        preparedStatement.setString(3, housingEnti.getLand_Type());
        preparedStatement.setString(4, housingEnti.getPeople_Data());
        preparedStatement.setString(5, housingEnti.getPeople_Time());
        preparedStatement.setString(6, housingEnti.getRegisteredContract());
        preparedStatement.setString(7, housingEnti.getFinalPrice());
        preparedStatement.setString(8, housingEnti.getSellersNationalCode());
        preparedStatement.setString(9, housingEnti.getSellersFatherName());
        preparedStatement.setString(10, housingEnti.getBuyersNationalCode());
        preparedStatement.setString(11, housingEnti.getBuyersFatherName());
        preparedStatement.setString(12, "1401/02/21");
        preparedStatement.setString(13, "amirsaman");
        preparedStatement.setLong(14, 1);
        preparedStatement.setString(15, "Yes");
    }

    public void responsibles () throws Exception{
        preparedStatement = connection.prepareStatement("insert into responsibles (nameandsurname, responsibles_role" +
            ", responsibles_nationalcode, responsibles_fathersname, phonenumber, delete_date, delete_by) values " +
            "(?, ?, ?, ?, ?, ?, ?)");
        preparedStatement.setString(1, "Mostafa Tavakoli");
        preparedStatement.setString(2, "Head of the Company");
        preparedStatement.setString(3, "0252912431");
        preparedStatement.setString(4, "hosein");
        preparedStatement.setString(5, "09198704218");
        preparedStatement.setString(6, "1401/02/21");
        preparedStatement.setString(7, "amirsaman");

        preparedStatement = connection.prepareStatement("insert into responsibles (nameandsurname, responsibles_role" +
                ", responsibles_nationalcode, responsibles_fathersname, phonenumber, delete_date, delete_by) values " +
                "(?, ?, ?, ?, ?, ?, ?)");
        preparedStatement.setString(1, "Naser Monadi");
        preparedStatement.setString(2, "Head of the Company");
        preparedStatement.setString(3, "0218359043");
        preparedStatement.setString(4, "hasan");
        preparedStatement.setString(5, "09128754781");
        preparedStatement.setString(6, "1401/02/21");
        preparedStatement.setString(7, "amirsaman");

        preparedStatement = connection.prepareStatement("insert into responsibles (nameandsurname, responsibles_role" +
                ", responsibles_nationalcode, responsibles_fathersname, phonenumber, delete_date, delete_by) values " +
                "(?, ?, ?, ?, ?, ?, ?)");
        preparedStatement.setString(1, "Mahdi Gamali");
        preparedStatement.setString(2, "Head of the Company");
        preparedStatement.setString(3, "09335403718");
        preparedStatement.setString(4, "jalal");
        preparedStatement.setString(5, "09128754781");
        preparedStatement.setString(6, "1401/02/21");
        preparedStatement.setString(7, "amirsaman");

        preparedStatement = connection.prepareStatement("insert into responsibles (nameandsurname, responsibles_role" +
                ", responsibles_nationalcode, responsibles_fathersname, phonenumber, delete_date, delete_by) values " +
                "(?, ?, ?, ?, ?, ?, ?)");
        preparedStatement.setString(1, "Yasin momeni");
        preparedStatement.setString(2, "Head of the Company");
        preparedStatement.setString(3, "0625085126");
        preparedStatement.setString(4, "hadi");
        preparedStatement.setString(5, "09358644032");
        preparedStatement.setString(6, "1401/02/21");
        preparedStatement.setString(7, "amirsaman");

        preparedStatement = connection.prepareStatement("insert into responsibles (nameandsurname, responsibles_role" +
                ", responsibles_nationalcode, responsibles_fathersname, phonenumber, delete_date, delete_by) values " +
                "(?, ?, ?, ?, ?, ?, ?)");
        preparedStatement.setString(1, "Morteza golestani");
        preparedStatement.setString(2, "Head of the Company");
        preparedStatement.setString(3, "3932518701");
        preparedStatement.setString(4, "Ahmad");
        preparedStatement.setString(5, "09198704218");
        preparedStatement.setString(6, "1401/02/21");
        preparedStatement.setString(7, "amirsaman");
    }

    public void documents() throws Exception{
        preparedStatement = connection.prepareStatement("insert into documents(register_time_byresponsible" +
            ", responsible_name, address, price, delete_date, delete_by, register_date_byresponsible");
        preparedStatement.setString(1, "8:00");
        preparedStatement.setString(2, "Mostafa Tavakoli");
        preparedStatement.setString(3, "Tehran Province, Robatkarim city, Shahid Hemmat Square, " +
            "Yahya Alley, No.12");
        preparedStatement.setString(4, "595000000");
        preparedStatement.setString(5, "1401/02/21");
        preparedStatement.setString(6, "amirsaman");
        preparedStatement.setString(7, "1391/12/23");

        preparedStatement = connection.prepareStatement("insert into documents(register_time_byresponsible" +
            ", responsible_name, address, price, delete_date, delete_by, register_date_byresponsible");
        preparedStatement.setString(1, "10:05");
        preparedStatement.setString(2, "Naser Monadi");
        preparedStatement.setString(3, "Tehran Province, Tehran city, Tehranpars, Rashid St" +
            ", Ahaniamine St, Mohsen Alley, No.28, Unit 3");
        preparedStatement.setString(4, "300000000, 5000000");
        preparedStatement.setString(5, "1401/02/21");
        preparedStatement.setString(6, "amirsaman");
        preparedStatement.setString(7, "1393/10/02");

        preparedStatement = connection.prepareStatement("insert into documents(register_time_byresponsible" +
                ", responsible_name, address, price, delete_date, delete_by, register_date_byresponsible");
        preparedStatement.setString(1, "11:42");
        preparedStatement.setString(2, "Mahdi Gamali");
        preparedStatement.setString(3, "Tehran Province, Parand city, EmamKhmeini Boulevard, Motaghi St" +
            "Yavar Alley");
        preparedStatement.setString(4, "450000000");
        preparedStatement.setString(5, "1401/02/21");
        preparedStatement.setString(6, "amirsaman");
        preparedStatement.setString(7, "1389/11/30");

        preparedStatement = connection.prepareStatement("insert into documents(register_time_byresponsible" +
                ", responsible_name, address, price, delete_date, delete_by, register_date_byresponsible");
        preparedStatement.setString(1, "9:00");
        preparedStatement.setString(2, "Yasin momeni");
        preparedStatement.setString(3, "Tehran Province, Vavan city, Shahid Beheshti Boulevard, " +
            "Nicknam St, Moridi Alley, No.32");
        preparedStatement.setString(4, "890000000");
        preparedStatement.setString(5, "1401/02/21");
        preparedStatement.setString(6, "amirsaman");
        preparedStatement.setString(7, "1396/02/21");

        preparedStatement = connection.prepareStatement("insert into documents(register_time_byresponsible" +
                ", responsible_name, address, price, delete_date, delete_by, register_date_byresponsible");
        preparedStatement.setString(1, "8:50");
        preparedStatement.setString(2, "Morteza golestani");
        preparedStatement.setString(3, "Tehran Province, Tehran city, Shahid Kolahdoz St, Motahhary St" +
            "Shahid Tehranchi Alley, No.28");
        preparedStatement.setString(4, "820000000");
        preparedStatement.setString(5, "1401/02/21");
        preparedStatement.setString(6, "amirsaman");
        preparedStatement.setString(7, "1393/01/03");
    }

    public void commit() throws Exception{
        connection.commit();
    }

    public void rollback() throws Exception{
        connection.rollback();
    }

    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}