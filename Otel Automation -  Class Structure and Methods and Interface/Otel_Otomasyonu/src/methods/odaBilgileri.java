package methods;
import java.util.ArrayList;

public class odaBilgileri extends otelBilgi {
    private String otelAdi;
    private int metrekare;
    private String odaTuru;
    private int Fiyat;
    private String Ozellik1;
    private String Ozellik2;

    static ArrayList<odaBilgileri> arrayOdalar = new ArrayList<>();

    public odaBilgileri(String otelAdi, int metrekare, String odaTuru, int fiyat, String ozellik1, String ozellik2) {
        this.otelAdi = otelAdi;
        this.metrekare = metrekare;
        this.odaTuru = odaTuru;
        Fiyat = fiyat;
        Ozellik1 = ozellik1;
        Ozellik2 = ozellik2;
    }

    public odaBilgileri(){
    	
    }
    public String getOtelAdi() {
        return otelAdi;
    }

    public void setOtelAdi(String otelAdi) {
        this.otelAdi = otelAdi;
    }

    public int getMetrekare() {
        return metrekare;
    }

    public void setMetrekare(int metrekare) {
        this.metrekare = metrekare;
    }

    public String getOdaTuru() {
        return odaTuru;
    }

    public void setOdaTuru(String odaTuru) {
        this.odaTuru = odaTuru;
    }

    public int getFiyat() {
        return Fiyat;
    }

    public void setFiyat(int fiyat) {
        Fiyat = fiyat;
    }

    public String getOzellik1() {
        return Ozellik1;
    }

    public void setOzellik1(String ozellik1) {
        Ozellik1 = ozellik1;
    }

    public String getOzellik2() {
        return Ozellik2;
    }

    public void setOzellik2(String ozellik2) {
        Ozellik2 = ozellik2;
    }

    public void odaEkle(String oteladi,int metrekare,String odaturu,int fiyat,String ozellik1,String ozellik2)
    {
        odaBilgileri Odalar = new odaBilgileri();
        Odalar.setOtelAdi(oteladi);
        Odalar.setMetrekare(metrekare);
        Odalar.setOdaTuru(odaturu);
        Odalar.setFiyat(fiyat);
        Odalar.setOzellik1(ozellik1);
        Odalar.setOzellik2(ozellik2);
        arrayOdalar.add(Odalar);
        System.out.printf("Oda Eklendi, Güncel Oda Sayýmýz: %d\n", arrayOdalar.size());
    }
    public void odaSil(int odaIndex)
    {
        arrayOdalar.remove(odaIndex);
        System.out.printf("Girilen %d. Indexteki Oda Silindi, Güncel Oda Sayýmýz:%d\n",odaIndex,arrayOdalar.size());
    }
    public int odaSayisi()
    {
        int psayi = arrayOdalar.size();
        return  psayi;
    }
    public int ortalamaOdaFiyat()
    {
        int ortalamaFiyat = 0;
        for(int i = 0; i<arrayOdalar.size();i++)
        {
            ortalamaFiyat += arrayOdalar.get(i).getFiyat();
        }
        return  ortalamaFiyat / arrayOdalar.size();
    }


	
	
    
    
    
    
    
    
    
}