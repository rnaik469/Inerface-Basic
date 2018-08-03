package InterfaceQuestion3;

public class VDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle []vehicles=new Vehicle[3];
		Fourwheeler four=new Fourwheeler();//creating object four for four wheeler class
		vehicles[0]=four;//store four wheeler object it in array of interface
		TwoWheeler two=new TwoWheeler();//creating object two for Two wheeler class
		vehicles[1]=two;//store two wheeler object it in array of interface
		ThreeWheeler three=new ThreeWheeler();//creating object three for Three wheeler class
		vehicles[1]=three;//store three wheeler object it in array of interface
		for(int i=0;i<3;i++) {
			if(vehicles[i]==three) {//check three object exist or not
				vehicles[i].start();//call threewheeler class start method
			}
		}
	}

}
