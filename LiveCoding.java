package com.programku.tugas3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LiveCoding {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Date hariIni = new Date();
        System.out.println(hariIni);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(format);
        String tanggal = format.format(hariIni);
        System.out.println(tanggal);
        Date in = new Date();
        String tanggal2 = sc.next();

        try {
            in = format.parse(tanggal2);
        }catch (Exception e){
            System.err.println("Tanggal Error");
        }

        String ex = "09/10/2021";
        Date exp = new Date();
        try {
            exp = format.parse(ex);
        }catch (Exception e){
            System.err.println(e);
        }


        if (in.before(exp)){
            System.out.println("Tidak Expired");

        }else {
            System.err.println("Expired");
        }
        String out = format.format(in);
        System.out.println(out);



        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateNow = sc.next();
        Date now = new Date();
        try {
            now = dateFormat.parse(dateNow);
        }catch (Exception e){
            System.err.println("Data ERROR");
            System.err.println(e);
        }
        if (now.after(exp)){
            System.out.println("NONONO");
        }else {
            System.out.println("YESYESYES");
        }




    }

}
