public class Program extends Karyawan{
	public void setGaji(int uang){
		if(uang<=90){
			System.out.println("Gaji anda sebanyak = "+uang);
		}else{
			System.out.println("maaf gaji anda tidak sesuai dengan UMR");
		}
	}
}