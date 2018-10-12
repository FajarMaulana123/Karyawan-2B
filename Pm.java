public class Pm extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=100){
			System.out.println("Gaji anda sebanyak = "+gaji);
		}else{
			System.out.println("maaf gaji anda tidak sesuai dengan UMR");
		}
	}
}