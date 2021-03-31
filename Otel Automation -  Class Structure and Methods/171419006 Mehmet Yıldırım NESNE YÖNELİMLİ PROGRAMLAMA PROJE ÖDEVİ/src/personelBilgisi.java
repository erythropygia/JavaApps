import java.util.ArrayList;


public class personelBilgisi {

    private String Adi;
    private String soyAdi;
    private String Dogumtarihi;
    private int Maasi;
    private String Cinsiyeti;
    private String Unvani;

    static ArrayList<personelBilgisi> arrayPersoneller = new ArrayList<>();
    int deger=1;
    int[] maaslar = new int[deger];

    public personelBilgisi(String adi, String soyAdi, String dogumtarihi, int maasi, String cinsiyeti, String unvani) {
        Adi = adi;
        this.soyAdi = soyAdi;
        Dogumtarihi = dogumtarihi;
        Maasi = maasi;
        Cinsiyeti = cinsiyeti;
        Unvani = unvani;

        deger = arrayPersoneller.size();
        for(int i = 0; i<deger; i++)
        {
            maaslar[i] = arrayPersoneller.get(i).getMaasi();
        }
    }
    public personelBilgisi(){
    	
    }

    public String getAdi() {
        return Adi;
    }

    public void setAdi(String adi) {
        Adi = adi;
    }

    public String getSoyAdi() {
        return soyAdi;
    }

    public void setSoyAdi(String soyAdi) {
        this.soyAdi = soyAdi;
    }

    public String getDogumtarihi() {
        return Dogumtarihi;
    }

    public void setDogumtarihi(String dogumtarihi) {
        Dogumtarihi = dogumtarihi;
    }

    public int getMaasi() {
        return Maasi;
    }

    public void setMaasi(int maasi) {
        Maasi = maasi;
    }

    public String getCinsiyeti() {
        return Cinsiyeti;
    }

    public void setCinsiyeti(String cinsiyeti) {
        Cinsiyeti = cinsiyeti;
    }

    public String getUnvani() {
        return Unvani;
    }

    public void setUnvani(String unvani) {
        Unvani = unvani;
    }

    public void personelEkle(String adi,String soyadi,String dogumtarihi,int maasi,String cinsiyeti,String unvani)
    {
        personelBilgisi personeller = new personelBilgisi();
        personeller.setAdi(adi);
        personeller.setSoyAdi(soyadi);
        personeller.setDogumtarihi(dogumtarihi);
        personeller.setMaasi(maasi);
        personeller.setCinsiyeti(cinsiyeti);
        personeller.setUnvani(unvani);

        arrayPersoneller.add(personeller);
        
        System.out.println("Personel Bilgileri Eklendi");
        
        
    }
    public void personelSil(int personelIndex)
    {
        arrayPersoneller.remove(personelIndex);
        System.out.printf("Girilen %d. Indexteki Personel Silindi, Güncel Personel Sayýmýz:%d\n",personelIndex,arrayPersoneller.size());
    }
    public int toplamPersonel()
    {
        int personelsayi = arrayPersoneller.size();
        return personelsayi;
    }
    public int toplamMaas()
    {
        int toplammaas=0;
       for(int i = 0;i<arrayPersoneller.size();i++ )
       {
           toplammaas += arrayPersoneller.get(i).getMaasi();
       }
       return toplammaas;
    }
    public int ortalamaMaas()
    {
        int ortlamaMaas = toplamMaas() / arrayPersoneller.size();
        return  ortlamaMaas;
    }
}