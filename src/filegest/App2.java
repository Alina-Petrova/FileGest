/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filegest;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tss
 */
public class App2 {
    public static void main(String[] args) throws IOException{
        
        Path srcPath = FileSystems.getDefault().getPath("Anagrafica.txt");
        Path destPath = FileSystems.getDefault().getPath("Anagrafica-Maiuscolo.txt");
        List<String> righe = Files.readAllLines(srcPath);
        List<String> righeNumerate = new ArrayList<>(righe.size());
        int count = 1;
        for(String riga : righe)
            righeNumerate.add(count++ + " " + riga.toUpperCase());
        Files.write(destPath, righeNumerate);
        
                
    }
}
