package model.entity;

public class HousingEnti {
    private String id_Code;
    private String agent_Password;
    private String land_Type;
    private String registeredContract;
    private String finalPrice;
    private String people_Data;
    private String people_Time;
    private String buyersNationalCode;
    private String buyersFatherName;
    private String sellersNationalCode;
    private String sellersFatherName;
    private String process_Completed;

    public String getId_Code() {
        return id_Code;
    }

    public HousingEnti setId_Code(String id_Code) {
        this.id_Code = id_Code;
        return this;
    }

    public String getAgent_Password() {
        return agent_Password;
    }

    public HousingEnti setAgent_Password(String agent_Password) {
        this.agent_Password = agent_Password;
        return this;
    }

    public String getLand_Type() {
        return land_Type;
    }

    public HousingEnti setLand_Type(String land_Type) {
        this.land_Type = land_Type;
        return this;
    }

    public String getRegisteredContract() {
        return registeredContract;
    }

    public HousingEnti setRegisteredContract(String registeredContract) {
        this.registeredContract = registeredContract;
        return this;
    }

    public String getFinalPrice() {
        return finalPrice;
    }

    public HousingEnti setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
        return this;
    }

    public String getSellersNationalCode() {
        return sellersNationalCode;
    }

    public HousingEnti setSellersNationalCode(String sellersNationalCode) {
        this.sellersNationalCode = sellersNationalCode;
        return this;
    }

    public String getSellersFatherName() {
        return sellersFatherName;
    }

    public HousingEnti setSellersFatherName(String sellersFatherName) {
        this.sellersFatherName = sellersFatherName;
        return this;
    }

    public String getProcess_Completed() {
        return process_Completed;
    }

    public HousingEnti setProcess_Completed(String process_Completed) {
        this.process_Completed = process_Completed;
        return this;
    }

    public String getBuyersNationalCode() {
        return buyersNationalCode;
    }

    public HousingEnti setBuyersNationalCode(String buyersNationalCode) {
        this.buyersNationalCode = buyersNationalCode;
        return this;
    }

    public String getBuyersFatherName() {
        return buyersFatherName;
    }

    public HousingEnti setBuyersFatherName(String buyersFatherName) {
        this.buyersFatherName = buyersFatherName;
        return this;
    }

    public String getPeople_Data() {
        return people_Data;
    }

    public HousingEnti setPeople_Data(String people_Data) {
        this.people_Data = people_Data;
        return this;
    }

    public String getPeople_Time() {
        return people_Time;
    }

    public HousingEnti setPeople_Time(String people_Time) {
        this.people_Time = people_Time;
        return this;
    }
}
