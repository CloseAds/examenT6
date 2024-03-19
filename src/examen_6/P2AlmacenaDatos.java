package examen_6;

import java.io.*;
import java.lang.ref.SoftReference;

public class P2AlmacenaDatos {

    public static void main(String[] args) {

        String marca = "marcas.dat";
        int dias = 30;

            try {
                RandomAccessFile archivo = new RandomAccessFile(marca, "rw");

                for (int i = 1; i < dias; i++) {
                    archivo.seek(1*12);

                    archivo.writeInt(0);
                    archivo.writeInt(0);
                    archivo.writeInt(0);
                }

                int n = 0;

                while (n != 0){
                    int dia = Integer.parseInt(archivo.readLine());
                    double medida = Double.parseDouble(archivo.readLine());
                    if (dia < 1 || dia > 5) {
                        dia = archivo.read();
                    }
                    else {
                        System.out.println("Dia introducido no válido");
                    }
                }

                System.out.println("Fichero aleatorio finalizado con éxito.");

                archivo.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

