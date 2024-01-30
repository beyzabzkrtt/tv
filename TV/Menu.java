package TV;

import java.util.Scanner;

public class Menu {

    static Scanner scan = new Scanner(System.in);
    static Televizyon tv;
    public static void main(String[] args) {

        

        boolean cikis = false;

        menuGoster();

        while(!cikis){
            System.out.println("seciminiz(menuyu gormek icin 8 e basiniz)");
            int secim=scan.nextInt();

            switch(secim){

                case 1:
                tvKur();
                break;

                case 2:
                tvAc();
                break;

                case 3:
                sesAc();
                break;

                case 4:
                sesKis();
                break;

                case 5:
                kanalDegistir();
                break;

                case 6:
                kanalBilgi();
                break;

                case 7:
                tvKapat();
                break;


                case 8:
                menuGoster();
                break;

                case 0:
                System.out.println("sistemden cikiliyor");
                cikis=true;
                break;

                default:
                System.out.println("0 ile 8 arasinda bir deger giriniz");
                break;
            }
        }



    }



    private static void kanalBilgi() {
        if(tv!=null){
            tv.aktifKanaliGoster();
        }else{
            System.out.println("once tvyi kurun");
        }
        
    }



    private static void kanalDegistir() {
        if(tv!=null){
            System.out.println("istediginiz kanali girin");
            int istenenKanal=scan.nextInt();
            tv.kanalDegistir(istenenKanal);
        }else{
            System.out.println("once tvyi kurun");
        }
        
    }



    private static void sesKis() {
        if(tv!=null){
            tv.sesAzalt();
        }else{
            System.out.println("once tvyi kurun");
        }
        
    }



    private static void sesAc() {
        if(tv!=null){
            tv.sesArttir();
        }else{
            System.out.println("once tvyi kurun");
        }
       
    }



    private static void tvKapat() {
        if(tv!=null){
            tv.tvKapat();
        }else{
            System.out.println("once tvyi kurun");
        }
       
    }

    private static void tvAc() {
        if(tv!=null){
            tv.tvAc();
        }else{
            System.out.println("once tvyi kurun");
        }
    }



    private static void tvKur() {
        

        if(tv==null){ //tv yoksa oluştursun , bir tane oluşturduktan sonra yeni oluşturamasin
        scan.nextLine(); //pespese string alindiği icin basina bunu yazmazsak tek satirda ister
        System.out.println("televizyonun markasini giriniz");
        String marka=scan.nextLine();

        System.out.println("televizyonun boyutunu giriniz");
        String boyut = scan.nextLine();
            tv=new Televizyon(marka, boyut);
            System.out.println(tv);
        
        }else{
            System.out.println(tv);
        }

        
    }



    private static void menuGoster() {

        System.out.println("*********MENU**********");
        System.out.println("0-cikis\n" + 
        "1- televizyonu kur\n" +
        "2- televizyonu ac\n" +
        "3- sesi ac\n" + 
        "4- sesi azalt\n" + 
        "5- kanal degistir\n" + 
        "6- kanal goster\n" +
        "7- televizyonu kapat\n" + 
        "8- menu goster");

        
       
    }
    
}
