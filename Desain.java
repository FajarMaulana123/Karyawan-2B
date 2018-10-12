public class Desain extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=70){
			System.out.println("Gaji anda sebanyak = "+gaji);
		}else{
			System.out.println("maaf gaji anda tidak sesuai dengan UMR");
		}
	}
}