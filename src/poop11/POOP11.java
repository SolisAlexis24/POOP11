package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author poo01alu36
 */
public class POOP11 {
    public static void main(String[] args) {
        System.out.println("#####File#####");
        File archivo = new File("archivo.txt");
        System.out.println(archivo.exists());
        try {
            boolean creado = archivo.createNewFile();
            System.out.println(creado);
            System.out.println(archivo.exists());
        } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("#####FileWriter#####");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe el texto para el archivo: ");
            String texto = br.readLine();
            System.out.println(texto);
        } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("#####FileWriter#####");
        
        try {
            FileWriter fw = new FileWriter("fw.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println("Esto es una impresion del archivo");
            salida.println("Esto es la segunda linea");
            for (int i = 0; i < 10; i++) {
                salida.println("Linea escrira num:" + i);
            }
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        
        System.out.println("#####FileReaderr#####");
        FileReader fr;
        try {
            fr = new FileReader("fw.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("El texto es:");
            String linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException ex5) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex1) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        Alumno al = new Alumno();
        List<String> info = new ArrayList<>();
        int cont = 0;
        System.out.println("#############Alunmo##############");
        System.out.println("#####FileWriter#####");
        
        try {
            FileWriter fw = new FileWriter("listaAlumnos.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println("Solis,Hernandez,Ian Alexis,319031676,19,9");
            bw.close();
        } catch (IOException ex2) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("#####FileReader#####");
        try {
            FileReader lec = new FileReader("listaAlumnos.csv");
            BufferedReader br = new BufferedReader(lec);
            System.out.println("El texto es:");
            String linea = br.readLine();
            System.out.println(linea);
            System.out.println("#####StringTokenizer#####");
            StringTokenizer tokenizador = new StringTokenizer(linea, ",");
            while(tokenizador.hasMoreTokens()){
                info.add(cont,tokenizador.nextToken());
                cont++;
            }
            br.close();
        } catch (FileNotFoundException ex3) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex4) {
            Logger.getLogger(POOP11.class.getName()).log(Level.SEVERE, null, ex);
        }
        al.setApPat(info.get(0));
        al.setApMat(info.get(1));
        al.setNombre(info.get(2));
        al.setNumCuenta(Integer.parseInt(info.get(3)));
        al.setEdad(Integer.parseInt(info.get(4)));
        al.setProm(Integer.parseInt(info.get(5)));
        System.out.println(al);
        
    }
}
}