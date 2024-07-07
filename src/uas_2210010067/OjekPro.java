
package uas_2210010067;


public class OjekPro extends OjekOnline  {
    public OjekPro (String nama, String id, String tujuan){
        super (nama, id, tujuan);
    }
    
    public String getPerusahaan(){
        String kodePt = getId().substring(0, 2);
        if (kodePt.equals("22")){
            return "PT. Ojek Asia";    
        }else{
            return "PT. Lain";
        }
    }
    public String getCode(){
        String codeOjek = getId().substring(2, 4);

        return switch (codeOjek) {
            case "31" -> "Gojek";
            case "32" -> "Grab";
            case "33" -> "maxim";
            default -> "Ojek Lain";
        };
    }
    public int getAnggotaOjek(){
        return Integer.parseInt(getId().substring(4));
    }

    @Override
    public String info() {
        return super.info()+
                "\nPerusahaan = "+getPerusahaan()+
                "\nCode Ojek = "+getCode()+
                "\nAnggota Ojek = "+getAnggotaOjek();
    }
    
}
