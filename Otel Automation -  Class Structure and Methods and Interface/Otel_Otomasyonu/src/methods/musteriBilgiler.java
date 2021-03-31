package methods;
import java.util.ArrayList;
public class musteriBilgiler {
    private String musteriNo;
    private String Adi;
    private String Soyadi;
    private String Sehiri;
    private  String Cinsiyet;
    private String medeniDurum;

    static ArrayList<musteriBilgiler> arrayMusteriler = new ArrayList<>();
    int erkek=0;
    int kadin=0;

    public musteriBilgiler()
    {

    }
    public musteriBilgiler(String musteriNo, String adi, String soyadi, String sehiri, String cinsiyet, String medeniDurum) {
        this.musteriNo = musteriNo;
        Adi = adi;
        Soyadi = soyadi;
        Sehiri = sehiri;
        Cinsiyet = cinsiyet;
        this.medeniDurum = medeniDurum;
    }
    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public String getAdi() {
        return Adi;
    }

    public void setAdi(String adi) {
        Adi = adi;
    }

    public String getSoyadi() {
        return Soyadi;
    }

    public void setSoyadi(String soyadi) {
        Soyadi = soyadi;
    }

    public String getSehiri() {
        return Sehiri;
    }

    public void setSehiri(String sehiri) {
        Sehiri = sehiri;
    }

    public String getCinsiyet() {
        return Cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        Cinsiyet = cinsiyet;
    }

    public String getMedeniDurum() {
        return medeniDurum;
    }

    public void setMedeniDurum(String medeniDurum) {
        this.medeniDurum = medeniDurum;
    }


    public void musteriEkle(String musterino,String adi,String soyadi,String sehiri,String cinsiyet,String medenidurum)
    {
        musteriBilgiler musteriler = new musteriBilgiler();
        musteriler.setMusteriNo(musterino);
        musteriler.setAdi(adi);;
        musteriler.setSoyadi(soyadi);
        musteriler.setSehiri(sehiri);
        musteriler.setCinsiyet(cinsiyet);
        musteriler.setMedeniDurum(medenidurum);
        arrayMusteriler.add( musteriler);
        System.out.println("Musteri Bilgileri Eklendi");
    }
    public void musteriSil(int musteriIndex)
    {
        arrayMusteriler.remove(musteriIndex);
    }
    public int musteriSayisi()
    {
        int msayi = arrayMusteriler.size();
        return  msayi;
    }
    public int cinsiyeteGoreDagilim()
    {
        for(int i = 0; i< arrayMusteriler.size();i++)
        {
            if(arrayMusteriler.get(i).getCinsiyet()=="Erkek")
            {
                erkek ++;
            }
            else if(arrayMusteriler.get(i).getCinsiyet()=="Kadin")
            {
                kadin++;
            }
        }
        if(kadin > erkek) return  kadin /erkek;
        else
        {
            return erkek/ kadin;   
        }
    }
}
