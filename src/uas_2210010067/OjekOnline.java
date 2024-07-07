
package uas_2210010067;


public class OjekOnline {
    //enkapsulasi dan atribut //
    protected String nama;
    protected String id;
    protected String tujuan;
    //constructor yang parameter //
    public OjekOnline(String nama, String id, String tujuan) {
        this.nama = nama;
        this.id = id;
        this.tujuan = tujuan;
    }
    // mutator  memanggil data tanpa mengubah data di in nya//
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
    // acessor memanggil data dengn mengubah data di in nya//
    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public String getTujuan() {
        return tujuan;
    }
    
    public String info(){
    return "\nNama Ojek :"+ getNama() +"\nId Ojek : "+ getId()+"\nTujuan : "+ getTujuan();
    }
}
