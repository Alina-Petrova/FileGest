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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tss
 */
public class App3 {
    public static void main(String[] args) {
        
        try {
           Files.walk(path, 1)
                   .filter(p->!Files.isDirectory(p))
                   .filter(p->p.g)
            
            
            
            

            Files.list(path)
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .filter(v->v.endsWith(".txt"))
                    .forEach(System.out::println);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
