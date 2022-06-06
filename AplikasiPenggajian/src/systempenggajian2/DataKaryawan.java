package systempenggajian2;


public class DataKaryawan extends Main{

    
    
public String ambildatajabatandangajistring (int index1, int index2){
    //methode yang berguna untuk mengambil nilai dari jabatan dan gaji karyawan.
    //dalam bentuk string
    //digunakan dalam penampilan jabatan dan gaji dalam textfield maupun textArea dalam GUI 
    String nilai;
    String datajabatandangaji [][] = 
    {{"Manager","10000000"},{"IT Staff","9000000"},{"Admin","5000000"},{"Sales","2000000"},{"Office boy","3000000"}};
    nilai = datajabatandangaji[index1][index2];
    return nilai;
    }
   
//perhitungan gaji menerapkan polymorphisme karena memiliki nama methode yang sama. namun dengan isi yang berbeda
public int totalgaji(int gajipokok){
//perthitungan gaji manager ,it dan admin
int nilai;
nilai = (int) (gajipokok - ((gajipokok*0.05)+100000+250000));
        return nilai;

}

public int totalgaji(double gajipokok){
//perthitungan gaji officeboy
int nilai;
nilai = (int) (gajipokok - (100000+250000));
        return nilai;

}

public int totalgaji (double gajipokok, int penjualan){
//perthitungan gaji sales
int nilai;
double gaji_bersih = gajipokok + bonussales()*penjualan ;
nilai = (int) ((gajipokok + bonussales()*penjualan + 900000) - ((gaji_bersih*0.05)+100000+250000));
        return nilai;

}

public int bonussales(){
// bonus sales
int bonus = 2000000;
return bonus; 
}








}
