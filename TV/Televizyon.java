package TV;

import java.util.ArrayList;

public class Televizyon {

    private String marka;
    private String boyut;
    private ArrayList<Kanal> kanallar;
    private boolean acik;
    private int ses;
    private int aktifKanal;

    public Televizyon(String marka,String boyut){
        this.marka=marka;
        this.boyut=boyut;
        this.acik=false;
        this.ses=0;
        this.aktifKanal=1;
        kanallar=new ArrayList<>();
        kanallariOlustur();

    }

    public void aktifKanaliGoster(){
        if(acik){
            System.out.println("Aktif kanal: "+aktifKanal+" " +kanallar.get(aktifKanal-1).kanalBilgisiGoster());
        }else{
            System.out.println("tv kapali");
        }
        

    }

    public void kanalDegistir(int istenenKanal){
        if(acik){
            if(istenenKanal != aktifKanal){
                if(istenenKanal<=kanallar.size() && istenenKanal>=0){
                    aktifKanal=istenenKanal;
                    System.out.println("kanal:" + aktifKanal+ " bilgi: "+ kanallar.get(aktifKanal-1).kanalBilgisiGoster());
                }else{
                    System.out.println("gecerli kanal numarasi giriniz");
                }

            }else{
                System.out.println("zaten " + aktifKanal + ". kanaldasiniz");
            }

        }else{
            System.out.println("once televizyonu acin");
        }
    }

    public void sesArttir(){
        if(acik){
            if(ses<20){ //en son 19 da girer 20 yapar , <= dersek 21 e kadar cikar
                ses++;
                System.out.println("ses seviyesi: " +ses);
            }else{
                System.out.println("ses en yuksek seviyede ");
            }
        }else{
            System.out.println("tv kapali");
        }
    }    
    public void sesAzalt(){
        if(acik){
            if(ses>=0){
            ses--;
            System.out.println("ses seviyesi: "+ses);
        }else{
            System.out.println("ses 0 da");
        }
        }else{
            System.out.println("tv kapali");
        }
        
    }

    public void tvAc(){
        if(acik==false){
            acik=true;
            System.out.println("tv acildi");
        }else{
            System.out.println("tv zaten acik");
        }
    }

    public void tvKapat(){
        if(acik){
            acik=false;
            System.out.println("tv kapatiliyor");
        }else{
            System.out.println("tv zaten kapali");
        }
    }
    private void kanallariOlustur() { //baskalari kanallarla oynamasin diye private

        Kanal cnn= new HaberKanali("CNN",1,"Genel Haber");
        kanallar.add(cnn);
        Kanal bein= new HaberKanali("BeinSport",2,"Genel Haber");
        kanallar.add(bein);
        Kanal dreamTurk = new MuzikKanali("DreamTurk", 3,"Yerli" );
        kanallar.add(dreamTurk);
        Kanal numberOne = new MuzikKanali("NumberOne", 4,"Yerli" );
        kanallar.add(numberOne);
        
    }
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getBoyut() {
        return boyut;
    }
    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }
    @Override
    public String toString() {
        
        return "Marka: " + marka + " Boyut: " + boyut + " olan tv olusturuldu";
    }
    
}
