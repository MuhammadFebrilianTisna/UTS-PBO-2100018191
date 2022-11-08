class Dosen extends Karyawan{
    int sks;
    public void total_gaji_sks(int sks){
        this.gaji=(sks*4*100000)+gaji;
        System.out.println("Gaji /bulan    = Rp."+gaji);
    }
}