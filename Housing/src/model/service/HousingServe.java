package model.service;

import model.entity.HousingEnti;
import model.repository.HousingRepo;

public class HousingServe {
    public void connection() throws Exception{
        try(HousingRepo housingRepo = new HousingRepo()) {
            housingRepo.Housing();
            housingRepo.commit();
        }
    }

    public void palace() throws Exception{
        try(HousingRepo housingRepo = new HousingRepo()) {
            housingRepo.groundsAndHouses();
            housingRepo.commit();
        }
    }

    public void process() throws Exception{
        try(HousingRepo housingRepo = new HousingRepo()) {
            housingRepo.contractsAndTransactions(new HousingEnti());
            housingRepo.commit();
        }
    }

    public void realStatePerson() throws Exception {
        try(HousingRepo housingRepo = new HousingRepo()) {
            housingRepo.responsibles();
            housingRepo.commit();
        }
    }

    public void documentation() throws Exception{
        try(HousingRepo housingRepo = new HousingRepo()) {
            housingRepo.documents();
            housingRepo.commit();
        }
    }
}
