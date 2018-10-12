public class CobaKaryawan{
	public static void main(String[] args) {
	System.out.println("  ");
	System.out.println("Jabatan Project Manager");
	Pm p = new Pm();
	p.setNama("Fajar");
	p.setAlamat("Jatibarang");
	p.setGaji(80);
	System.out.println(" ");

	System.out.println("Jabatan Programer");
	Program pr = new Program();
	pr.setNama("Riski");
	p.setAlamat("Pawidean");
	p.setGaji(55);
	System.out.println(" ");

	System.out.println("Jabatan Desainer");
	Desain d = new Desain();
	d.setNama("Palu");
	d.setAlamat("Kebulen");
	d.setGaji(40);
	}
}