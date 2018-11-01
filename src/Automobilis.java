public class Automobilis {

    //- markė;
    //- spalva;
    //- pagaminimo metai;
    //- durų skaičius;
    //- rida;

    private String marke;
    private String modelis;
    private String spalva;
    private Integer pagaminimoMetai;
    private Integer duruSkaicius;
    private Integer rida;
    private boolean elektromobilis;

    public Automobilis(String marke, String modelis, String spalva,
                       Integer pagaminimoMetai, Integer duruSkaicius,
                       Integer rida, boolean elektromobilis) {
        this.marke = marke;
        this.modelis = modelis;
        this.spalva = spalva;
        this.pagaminimoMetai = pagaminimoMetai;
        this.duruSkaicius = duruSkaicius;
        this.rida = rida;
        this.elektromobilis = elektromobilis;
    }

    public Automobilis(String marke, String modelis, String spalva, Integer pagaminimoMetai, Integer duruSkaicius, Integer rida) {
        this.marke = marke;
        this.modelis = modelis;
        this.spalva = spalva;
        this.pagaminimoMetai = pagaminimoMetai;
        this.duruSkaicius = duruSkaicius;
        this.rida = rida;
    }

    public Automobilis(String marke, String modelis) {
        this.marke = marke;
        this.modelis = modelis;
    }

    public Automobilis(String marke, String modelis, String spalva) {
        this.marke = marke;
        this.modelis = modelis;
        this.spalva = spalva;
    }

    public String getModelis() {
        return modelis;
    }

    public void setModelis(String modelis) {
        this.modelis = modelis;
    }

    public boolean isElektromobilis() {
        return elektromobilis;
    }

    public void setElektromobilis(boolean elektromobilis) {
        this.elektromobilis = elektromobilis;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getSpalva() {
        return spalva;
    }

    public void setSpalva(String spalva) {
        this.spalva = spalva;
    }

    public Integer getPagaminimoMetai() {
        return pagaminimoMetai;
    }

    public void setPagaminimoMetai(Integer pagaminimoMetai) {
        this.pagaminimoMetai = pagaminimoMetai;
    }

    public Integer getDuruSkaicius() {
        return duruSkaicius;
    }

    public void setDuruSkaicius(Integer duruSkaicius) {
        this.duruSkaicius = duruSkaicius;
    }

    public Integer getRida() {
        return rida;
    }

    public void setRida(Integer rida) {
        this.rida = rida;
    }
}
