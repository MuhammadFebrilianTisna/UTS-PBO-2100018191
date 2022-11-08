class Main {
    public static void main(String[] args) {
        System.out.println("======================================================");
        System.out.println("UTS PEMROGRAMAN BERORIENTASI OBJEK");
        System.out.println("NAMA    : MUHAMMAD FEBRILIAN TISNA");
        System.out.println("NIM     : 2100018191");
        //dosen1
        System.out.println("======================DATA DOSEN=======================");

        Dosen dosen1=new Dosen();
        dosen1.Data_Karyawan(32343433,12,05,1982,2015,"Perempuan","Puan Maharani S.Kom","RT.34, RW 26, Bandung,Jawa Barat");
        dosen1.Display();
        dosen1.total_gaji_sks(10);
        System.out.println("");

        //dosen2 (6 sks)

        Dosen dosen2=new Dosen();
        dosen2.Data_Karyawan(32343445,22,12,1976,2012,"Laki-laki","Ferdi Sambo M.kom","RT.22,Rw.62, Bantul,Yogyakarta");
        dosen2.Display();
        dosen2.total_gaji_sks(6);
        System.out.println("");

        //tendik
        System.out.println("======================DATA TENDIK=======================");

        //nip dalam string
        Tendik tendik1=new Tendik();
        tendik1.Data_Karyawan("400000054",23,05,1992,2018,"Laki-laki","Deddy Corbuzier","RT.45,RW.02, Jakarta");
        tendik1.Display();
        tendik1.total_gaji_jam(0);
        System.out.println("");

        Tendik tendik2=new Tendik();
        tendik2.Data_Karyawan("400000058",17,03,1995,2019,"Laki-laki","Steven Kurniawan","RT.76,RW.09, Serang,Bantin");
        tendik2.Display();
        tendik2.total_gaji_jam(20);
        System.out.println("");
    }
}