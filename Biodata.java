/**
 *
 * @author FaAmZero
 */
public class biodata {
        
    private String nim;
    private String nama;
    private String kelas;
    
    // constructor
    public biodata(String namaa){
        nama = namaa;
    }
  
    public biodata(){
        nama = "Fakhrul Anam";
        nim = "18090113";
        kelas = "4D";
    }
// method
    //Setter
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    //Getter
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public String getKelas() {
        return kelas;
    }
 public String info() {
        return "Nim: " + nim + "\n" +
            "Nama: " + nama + "\n" +
            "Kelas: " + kelas;
    }

    public void print() {
        System.out.println("  NIM : " + nim);
        System.out.println("  NAMA : " + nama);
        System.out.println("  KELAS : " + kelas);
    }
}   
