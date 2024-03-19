package examen_6;

import java.io.*;

public class P1CalculaLluvia {

    public static void main(String[] args) throws IOException {

        String archivoEntrada = "lluvia.txt";
        String archivoSalida = "salida.txt";

        try {
            BufferedReader entrada = new BufferedReader( new FileReader(archivoEntrada));
            BufferedWriter salida = new BufferedWriter(new FileWriter(archivoSalida));

            int lluviaMinima = Integer.parseInt(entrada.readLine());
            salida.write("Introduce la lluvia mínima: " + lluviaMinima + "mm");

            salida.newLine();

            String l ;

            while ((l = entrada.readLine()) != null && l.equals(-1)) {

                String [] partes = l.split(" ");
                String mes = partes [0];
                int aguaTotal = 0;
                int MesesSuperados = 0;

                int [] acumularMeses = new int[12];
                String [] nombreMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

                for (int i = 1; i < partes.length; i++) {
                    int cantidad = Integer.parseInt(partes [i]);

                    if (acumularMeses[1] >= lluviaMinima){
                        salida.write("Mes: " + nombreMeses[1] + ", lluvia acumulada por meses " + acumularMeses + "mm");
                        salida.newLine();
                        MesesSuperados++;
                    }
                    aguaTotal += cantidad;
                }

                salida.write( + MesesSuperados + "mm");
                salida.newLine();

                salida.write( + aguaTotal + "mm");
                salida.newLine();

                salida.write(l);
                salida.newLine();

            }
            entrada.close();
            salida.close();

            System.out.println("Se han guardado los cambios en el archivo: " +archivoEntrada);

        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
