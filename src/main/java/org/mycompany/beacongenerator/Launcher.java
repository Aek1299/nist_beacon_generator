package org.mycompany.beacongenerator;

import org.mycompany.beacongenerator.domain.BeaconResponse;
import org.mycompany.beacongenerator.service.BeaconGenerator;
import org.mycompany.beacongenerator.service.ResponseParser;
import org.mycompany.beacongenerator.service.RestClient;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class Launcher {
    public static void main(String[] args) throws IOException {
        Integer len = null;
        if(args.length==2) if (args[0].equals("-l")) len = Integer.parseInt(args[1]);
        BeaconGenerator.getValue(len);
    }
}
