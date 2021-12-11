package org.mycompany.beacongenerator.service;

import org.mycompany.beacongenerator.domain.BeaconResponse;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class BeaconGenerator {

    public static RestClient client = new RestClient();
    public static ResponseParser parser = new ResponseParser();

    static public void getValue(Integer len) throws IOException {

        if(len == null) {
            BeaconResponse beaconResponse = parser.parse(client.getLastPulse());
            System.out.println(beaconResponse.getPulse().getOutputValue());
            System.out.println(System.getProperty("user.dir"));
            try(FileWriter fw = new FileWriter(System.getProperty("user.dir")+
                    File.separator+"random_sequence.txt")){
                StringBuilder binaryString = new StringBuilder(new BigInteger(
                        beaconResponse.getPulse().getOutputValue(), 16).toString(2));
                while (binaryString.length()<512){
                    binaryString.insert(0, "0");
                }
                fw.write(binaryString.toString());
            }
        } else {
            int shift = (int) Math.ceil(len/512.0)-1;
            int remainder = len - 512*shift;
            System.out.println("Shift "+shift);
            System.out.println("Remainder "+remainder);
            BeaconResponse beaconResponse = parser.parse(client.getLastPulse());
            Integer lastIndex = beaconResponse.getPulse().getPulseIndex();
            System.out.println("Last index " +lastIndex);
            beaconResponse = parser.parse(client.getPulse(lastIndex-shift));
            try(FileWriter fw = new FileWriter(System.getProperty("user.dir")+
                    File.separator+"random_sequence.txt")){
                StringBuilder binaryString = new StringBuilder(new BigInteger(
                        beaconResponse.getPulse().getOutputValue(), 16).toString(2));
                while (binaryString.length()<512){
                    binaryString.insert(0, "0");
                }
                fw.write(binaryString.substring(512-remainder));

                for (int i = lastIndex-shift+1; i <= lastIndex ; i++) {
                    binaryString = new StringBuilder(new BigInteger(
                            parser.parse(client.getPulse(i)).getPulse().getOutputValue(), 16).toString(2));
                    while (binaryString.length()<512){
                        binaryString.insert(0, "0");
                    }
                    fw.write(binaryString.toString());
                }
            }

        }
    }

    public static Integer getLastIndex() throws IOException {
        BeaconResponse beaconResponse = parser.parse(client.getLastPulse());
        return beaconResponse.getPulse().getPulseIndex();
    }

    public static void getValueWithIndex(int index) throws IOException {
        try(FileWriter fw = new FileWriter(System.getProperty("user.dir")+
                File.separator+"random_sequence.txt")){
            StringBuilder binaryString = new StringBuilder(new BigInteger(
                    parser.parse(client.getPulse(index)).getPulse().getOutputValue(), 16).toString(2));
            while (binaryString.length()<512){
                binaryString.insert(0, "0");
            }
            fw.write(binaryString.toString());
        }
    }
}
