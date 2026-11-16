package az.itbrains;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//
//        int ededcapi=1;
//        int gerisayim=10;
//        int[] ededcplari = new int[10];
//        int[]  gerisayimlar = new int[10];
//        int i=0;
//            while(ededcapi<=10 && gerisayim>0){
//                ededcplari[i]=ededcapi;
//                gerisayimlar[i]=gerisayim;
//                ededcapi++;gerisayim--;
//                i++;
//            }
//
//        System.out.println(Arrays.toString(ededcplari));
//        System.out.println(Arrays.toString(gerisayimlar));
////-------------------------------------------------
//        //cutler
//        int cut=2;
//        while(cut<=20){
//            System.out.println(cut);
//            cut+=2;
//        }
//        int index=0;
//        int[] cutler=new int[10];
//        while(index<=20){
//            cutler[index]=index;
//            index+=2;
//        }
//        System.out.println(Arrays.toString(cutler));



        //-------------------------------------------------
        //eded cemi
//        System.out.println("musbet eded daxil et");
//        int daxilEt= sc.nextInt();
//        if(daxilEt<0){
//            System.out.println("nok");
//        }
//        int copyDaxilEt=daxilEt-1;
//        while (copyDaxilEt>0){
//            daxilEt+=copyDaxilEt;
//            copyDaxilEt--;
//        }
//        System.out.println(daxilEt);

        //-------------------------------------
        //sifre yoxlanisi
//        String duzgunSifre="2525E";
//        String yoxlasifreni;
//        boolean okeydi=false;
//        do{
//            System.out.println("yeniden daxil edin");
//             yoxlasifreni= sc.nextLine();
//             if(yoxlasifreni.equals(duzgunSifre)){
//                 okeydi=true;
//             }
//        }while (!okeydi);
//        System.out.println("finito");

        //--------------------------------
        //task 6 - reqemlerin sayi
//        int eded= sc.nextInt();
//        int onaVur=10;
//
//        while(onaVur<eded){
//            onaVur*=10;
//        }
//        String sifirSayi=String.valueOf(onaVur);
//        int sifirlarinSayi=0;
//        for(int i=0;i<sifirSayi.length();i++){
//            if(sifirSayi.charAt(i)=='0') {
//                sifirlarinSayi++;
//            }
//        }
//        System.out.println(sifirlarinSayi);


        //-------------------------------
        //task7-reqemler cemi
//        int tamEded= sc.nextInt();
//        int copyTamEded=tamEded;
//        int cemi=0;
//        while(tamEded>0){
//            copyTamEded=tamEded%10;
//            cemi+=copyTamEded;
//            tamEded/=10;
//        }
//        System.out.println(cemi);

        //-----------------------------------
        //task 8 - texmin et
//        int number=37;
//        int daxilEt;
//        do{
//            daxilEt= sc.nextInt();
//            if(daxilEt<number){
//                System.out.println("daha boyuk eded daxil edin");
//            }if(daxilEt>number){
//                System.out.println("daha kicik eded daxil edin");
//            }if(daxilEt==number){
//                System.out.println("tebrikler");
//            }
//        }while(daxilEt!=number);




        //----------------------------
        //tas 9 - banomat menyuus
//        double balans=500;
//        System.out.println("vaiant secin");
//        double variantSec;
//        do{
//            variantSec= sc.nextInt();
//            if(variantSec==1){
//                System.out.println("balans gosterilir");
//                System.out.println(balans);
//            }
//            else if(variantSec==2){
//                System.out.println("pul elave et");
//                System.out.println("elave edilecek meblegi yazin");
//                double elave= sc.nextInt();
//                balans+=elave;
//                System.out.println("balansda"+balans+" qeder qaldi");
//            }
//            else if(variantSec==3){
//                System.out.println("balansdan cixarilacaq mebglegi yaz");
//                double cix= sc.nextInt();
//                balans-=cix;
//                System.out.println("balansda"+balans+" qeder qaldi");
//            }
//
//        }while (variantSec!=4);


        //----------------------------
        //task 10
//        int num;
//        int cem=0;
//        int[] musbetEdedler = new int[0];
//        int[] menfiEdedler = new int[0];
//        do {
//            num = sc.nextInt();
//
//                    if (num > 0) {
//                        musbetEdedler = Arrays.copyOf(musbetEdedler, musbetEdedler.length + 1);
//                        musbetEdedler[musbetEdedler.length - 1]=num;
//                    }
//                    if (num < 0) {
//                        menfiEdedler = Arrays.copyOf(menfiEdedler, menfiEdedler.length + 1);
//                        menfiEdedler[menfiEdedler.length - 1]=num;
//                    }
//                cem += num;
//            }
//            while (num != 0) ;
//
//            System.out.println(Arrays.toString(musbetEdedler));
//            System.out.println(Arrays.toString(menfiEdedler));
//            System.out.println(cem);
//



         //ededler cemi//diger taskla cut/yek
//
//        boolean ededirmi;
//        int cem=0;
//        int[] cutler = new int[0];
//        int[] tekler= new int[0];
//        int index=0;
//        do{
//
//            System.out.println("eded daxil edin");
//            int eded= sc.nextInt();
//            cem+=eded;
//            System.out.println(cem);
//            if(eded%2==0){
//                cutler = Arrays.copyOf(cutler, cutler.length + 1);
//                      cutler[cutler.length - 1]=eded;
//            }
//            else if(eded%2!=0){
//                tekler = Arrays.copyOf(tekler, tekler.length + 1);
//                tekler[tekler.length - 1]=eded;
//            }
//            System.out.println(Arrays.toString(cutler));
//            System.out.println(Arrays.toString(tekler));
//        }
//        while(sc.hasNext());


//---------------------------------
        //3 melumatin novu
//        System.out.println("deyeri daxil edin");
//        int nums=0;
//        int texts=0;
//        System.out.println("proqrami dayandirmaq ucun true yazin");
//        for(int i=0;i<7;i++){
//            if(sc.hasNextBoolean()){
//                boolean cavab= sc.nextBoolean();
//                if(cavab){
//                    break;
//                }else{
//                    texts++;
//                }
//            }else if(sc.hasNextInt()){
//                sc.nextInt();
//                nums++;
//            }else{
//                sc.next();
//                texts++;
//            }
//        }
//        System.out.println(nums);
//        System.out.println(texts);

        //----------------------------------
        //en boyuk en kicik
        System.out.println("tam eddeler daxil edin");
        System.out.println("dayandirmaq ucun her hansi herf daxil edin");
        if(sc.hasNextInt()) {
            int ilkeded = sc.nextInt();
            int enboyuk = ilkeded;
            int enkicik = ilkeded;

            while (sc.hasNextInt()) {
                int cariedde = sc.nextInt();
                if (cariedde > enboyuk) {
                    enboyuk = cariedde;
                }
                if (cariedde < enkicik) {
                    enkicik = cariedde;
                }
            }
            System.out.println(enboyuk);
            System.out.println(enkicik);
        }else{
                System.out.println("hec bir tam eded daxil eilmedi");
            }

    }
}