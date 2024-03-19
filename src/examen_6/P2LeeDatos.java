package examen_6;

import java.io.*;

public class P2LeeDatos {
    public static void main(String[] args) {

        String marca = "marca.dat";

            try {
                RandomAccessFile archivo = new RandomAccessFile(marca, "rw");

                String [] dia = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};

                archivo.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



    }
