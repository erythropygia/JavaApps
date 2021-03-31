package methods;
import java.util.ArrayList;

public class otelBilgi {
    private String otelAdi;
    private boolean durum;
    private int odaSayisi;
    private String Bolge;
    private int yildizSayisi;
    private int odaTurleri;


    public otelBilgi(String otelAdi, boolean durum, int odaSayisi, String bolge, int yildizSayisi, int odaTurleri) {
        this.otelAdi = otelAdi;
        this.durum = durum;
        this.odaSayisi = odaSayisi;
        Bolge = bolge;
        this.yildizSayisi = yildizSayisi;
        this.odaTurleri = odaTurleri;
    }
    public otelBilgi()
    {

    }

    public String getOtelAdi() {
        return otelAdi;
    }

    public void setOtelAdi(String otelAdi) {
        this.otelAdi = otelAdi;
    }

    public boolean isDurum() {
        return durum;
    }

    public void setDurum(boolean durum) {
        this.durum = durum;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public String getBolge() {
        return Bolge;
    }

    public void setBolge(String bolge) {
        Bolge = bolge;
    }

    public int getYildizSayisi() {
        return yildizSayisi;
    }

    public void setYildizSayisi(int yildizSayisi) {
        this.yildizSayisi = yildizSayisi;
    }

    public int getOdaTurleri() {
        return odaTurleri;
    }

    public void setOdaTurleri(int odaTurleri) {
        this.odaTurleri = odaTurleri;
    }

    static ArrayList<otelBilgi> arrayOteller = new ArrayList<>();

    public void otelEkle(String oteladi,boolean durum,int odasayi,String bolge,int yildizsayisi,int odaturleri)
    {
        otelBilgi oteller = new otelBilgi();
        oteller.setOtelAdi(oteladi);
        oteller.setDurum(durum);
        oteller.setOdaSayisi(odasayi);
        oteller.setBolge(bolge);
        oteller.setYildizSayisi(yildizsayisi);
        oteller.setOdaTurleri(odaturleri);

        arrayOteller.add(oteller);
        System.out.printf("Otel Eklendi, Güncel Otel Sayýmýz: %d\n", arrayOteller.size());
    }
    public void otelSil(int otelIndex)
    {
        arrayOteller.remove(otelIndex);
        System.out.printf("Girilen %d. Indexteki Otel Silindi, Güncel Otel Sayýmýz:%d\n",otelIndex,arrayOteller.size());
    }
}