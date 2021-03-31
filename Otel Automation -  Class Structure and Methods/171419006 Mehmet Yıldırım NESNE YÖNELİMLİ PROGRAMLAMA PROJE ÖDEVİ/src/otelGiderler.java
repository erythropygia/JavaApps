import java.util.ArrayList;


public class otelGiderler extends otelBilgi {
    private String giderAdi;
    private String giderTuru;
    private int komisyonOrani;
    private int toplamTutar;
    private String odemeTipi;
    private	String giderTarihi;

    static ArrayList<otelGiderler> arrayGiderler = new ArrayList<>();
    int odemeIndex=0;
    String[] Odemeler = new String[odemeIndex];

    public otelGiderler(){
    	
    }

    public otelGiderler(String giderAdi, String giderTuru, int komisyonOrani, int toplamTutar, String odemeTipi, String giderTarihi) {
        this.giderAdi = giderAdi;
        this.giderTuru = giderTuru;
        this.komisyonOrani = komisyonOrani;
        this.toplamTutar = toplamTutar;
        this.odemeTipi = odemeTipi;
        this.giderTarihi = giderTarihi;

        odemeIndex =arrayGiderler.size();
        for (int i = 0;i<odemeIndex;i++)
        {
         Odemeler[i] = arrayGiderler.get(i).getOdemeTipi();
        }
    }

    public String getGiderAdi() {
        return giderAdi;
    }

    public void setGiderAdi(String giderAdi) {
        this.giderAdi = giderAdi;
    }

    public String getGiderTuru() {
        return giderTuru;
    }

    public void setGiderTuru(String giderTuru) {
        this.giderTuru = giderTuru;
    }

    public int getKomisyonOrani() {
        return komisyonOrani;
    }

    public void setKomisyonOrani(int komisyonOrani) {
        this.komisyonOrani = komisyonOrani;
    }

    public int getToplamTutar() {
        return toplamTutar;
    }

    public void setToplamTutar(int toplamTutar) {
        this.toplamTutar = toplamTutar;
    }

    public String getOdemeTipi() {
        return odemeTipi;
    }

    public void setOdemeTipi(String odemeTipi) {
        this.odemeTipi = odemeTipi;
    }

    public String getGiderTarihi() {
        return giderTarihi;
    }

    public void setGiderTarihi(String giderTarihi) {
        this.giderTarihi = giderTarihi;
    }

    public void giderEkle(String gideradi,String giderturu,int komisyonorani,int toplamtutar,String odemetipi,String gidertarihi)
    {
        otelGiderler giderler = new otelGiderler();
        giderler.setGiderAdi(gideradi);
        giderler.setGiderTuru(giderturu);
        giderler.setKomisyonOrani(komisyonorani);
        giderler.setToplamTutar(toplamtutar);
        giderler.setOdemeTipi(odemetipi);
        giderler.setGiderTarihi(gidertarihi);
        arrayGiderler.add(giderler);
        System.out.println("Gider Bilgileri Eklendi");
    }
    public void giderSil(int giderIndex)
    {
        arrayGiderler.remove(giderIndex);
        int toplamGider=0;
        
        for (int i =0;i< arrayGiderler.size();i++)
        {
            toplamGider +=arrayGiderler.get(i).getToplamTutar();
        }
        System.out.printf("Girilen %d. Indexteki Gider Bilgisi Silindi, Güncel Gider:%d\n",giderIndex,toplamGider);
        
    }

    public int giderToplami()
    {
        int toplamGider=0;
        
        for (int i =0;i< arrayGiderler.size();i++)
        {
            toplamGider +=arrayGiderler.get(i).getToplamTutar();
        }
        return toplamGider;
    }

	@Override
	public void setYildizSayisi(int yildizSayisi) {
		super.setYildizSayisi(yildizSayisi);
		System.out.println("\nMevcut Otel Yýldýz Sayýsý " + yildizSayisi+ " Olarak Override Edildi." );
	}
    

}