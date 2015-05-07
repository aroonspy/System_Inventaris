package PreSistem;

public class KondisiRuangtest extends IndukClass{
    
        KondisiRuang KondisiKelas = new KondisiRuang();
        private String bentuk;
        private double Rasio;
        private String analisis;
  
    public  void kondisi(){
           System.out.print("Masukkan Panjang Ruangan = ");
           KondisiKelas.setPanjang(input.nextInt());
           System.out.print("Masukkan Lebar Ruangan = ");
           KondisiKelas.setLebar(input.nextInt());
           System.out.print("Masukkan jumlah kursi = ");
           KondisiKelas.setJumlahkursi(input.nextInt());
           System.out.print("Masukkan jumlah pintu = ");
           KondisiKelas.setJumlahpintu(input.nextInt());
           System.out.print("Masukkan jumlah jendela = ");
           KondisiKelas.setJumlahjendela(input.nextInt());
    }   
    public   int luas(){
        return KondisiKelas.getPanjang()*KondisiKelas.getLebar();
    }
    public  void bentuk(){
        if(KondisiKelas.getPanjang()!=luas()){
            System.out.println("Bentuk Ruangan Persegi Panjang sesuai");
            Sesuai ++;
        }else{
            System.out.println("Bentuk Ruangan Tidak Persegi Panjang");
        }
    }
    
    public   void analisis(){   
        Rasio = luas()/ KondisiKelas.getJumlahkursi();
        if (Rasio >= 0){
            System.out.print("Rasio ruangan = "+Rasio);
            if(Rasio >= 0.5){
                System.out.println(" Sesuai");
                Sesuai++;
            }else{
                System.out.println();
           }
        }
        if(KondisiKelas.getJumlahpintu()>= 0){
            System.out.print("jumlah pintu "+KondisiKelas.getJumlahpintu());
            if(KondisiKelas.getJumlahpintu()>=2){
                System.out.println(" Sesuai"); 
                Sesuai ++;
            }else{
                System.out.println();
            }   
        }
        if(KondisiKelas.getJumlahjendela()>=0){
            System.out.print("jumlah jendela "+KondisiKelas.getJumlahjendela());
            if(KondisiKelas.getJumlahjendela()>=1){
                System.out.println(" Sesuai");
                Sesuai ++;      
            }else{
                System.out.println();
            }
        }
    }
    
    public   void kondisitest(){
        kondisi();
        luas();
        System.out.println("===================================================");
        bentuk();
        analisis();
        System.out.println("===================================================");
    }
}
