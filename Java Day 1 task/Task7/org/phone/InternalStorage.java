package org.phone;


class InternalStorage {

    
    public void processorName() {
        System.out.println("Processor Name: Snapdragon 8 Gen 2");
    }


    public void ramSize() {
        System.out.println("RAM Size: 8 GB");
    }

 
    public static void main(String[] args) {


        InternalStorage internalStorage = new InternalStorage();
        internalStorage.processorName();
        internalStorage.ramSize();

       
        ExternalStorage externalStorage = new ExternalStorage();
        externalStorage.size();
    }
}