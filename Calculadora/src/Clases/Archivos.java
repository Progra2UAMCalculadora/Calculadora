package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {
    public void CrearArchivo(File nuevo) throws IOException {
        if (!nuevo.exists()) {
            FileWriter crear = new FileWriter(nuevo);
            crear.write("");
            crear.close();
        }

    }
    public void GuardarError(String error) throws IOException {
        File nuevo = new File("Errores.txt");
        //nuevo.delete();
        if (!nuevo.exists()) {
            CrearArchivo(nuevo);
        }
        FileWriter escribir = new FileWriter(nuevo, true);
        BufferedWriter buffer = new BufferedWriter(escribir);
        String registro = error+"\r\n"; //Ultimo dato de la línea
        buffer.write(registro);
        buffer.close();
        escribir.close();
    }
    public void GuardarCinta(String cinta) throws IOException {
        File nuevo = new File("InfoCinta.txt");
        if (!nuevo.exists()) {
            CrearArchivo(nuevo);
        }
        FileWriter escribir = new FileWriter(nuevo, true);
        BufferedWriter buffer = new BufferedWriter(escribir);
        String registro = cinta+"\r\n";
        buffer.write(registro);
        buffer.close();
        escribir.close();

    }
    public void MS(String MS) throws IOException {
        File nuevo = new File("MS.txt");
        nuevo.delete();
        if (!nuevo.exists()) {
            CrearArchivo(nuevo);
        }
        FileWriter escribir = new FileWriter(nuevo, true);
        BufferedWriter buffer = new BufferedWriter(escribir);
        String registro = MS; 
        buffer.write(registro);
        buffer.close();
        escribir.close();
    }
    
}
