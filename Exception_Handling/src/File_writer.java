import java.io.FileWriter;
import java.io.IOException;

public class File_writer {
public static void main(String[] args) {
	try {
		FileWriter fw=new FileWriter("D:\\Test.txt");
		fw.write("\r\n" + 
				"(Top)\r\n" + 
				"Biology\r\n" + 
				"Engineering\r\n" + 
				"Other uses\r\n" + 
				"See also\r\n" + 
				"Loading\r\n" + 
				"\r\n" + 
				"Article\r\n" + 
				"Talk\r\n" + 
				"Read\r\n" + 
				"Edit\r\n" + 
				"View history\r\n" + 
				"From Wikipedia, the free encyclopedia\r\n" + 
				"\r\n" + 
				"Look up loading in Wiktionary, the free dictionary.\r\n" + 
				"Loading may refer to:\r\n" + 
				"\r\n" + 
				"Biology\r\n" + 
				"Carbohydrate loading, a strategy employed by endurance athletes to maximize the storage of glycogen in the muscles\r\n" + 
				"Creatine loading, a phase of use of creatine supplements\r\n" + 
				"Vocal loading, the stress inflicted on the speech organs when speaking for long periods\r\n" + 
				"Engineering\r\n" + 
				"Application of a structural load to a system\r\n" + 
				"Disk loading, the pressure maintained over the swept area of a helicopter's rotor\r\n" + 
				"Seismic loading, one of the basic concepts of earthquake engineering\r\n" + 
				"Wing loading, the loaded weight of an aircraft divided by the area of its wing\r\n" + 
				"Loading characteristic, a measure of traffic on a telephone system\r\n" + 
				"Insertion of an electrical load into a circuit\r\n" + 
				"Use of a loading coil to increase inductance\r\n" + 
				"Loading (computing), the process in which the contents of a file are read into a computer's memory\r\n" + 
				"Other uses\r\n" + 
				"Task loading, the number of tasks taken on by a diver\r\n" + 
				"Loading (TV channel), a Brazilian TV Network focused on pop and geek culture\r\n" + 
				"See also\r\n" + 
				"Lading\r\n" + 
				"Load (disambiguation) ");
		
		fw.close();
	} catch (IOException e)
	{
		
		e.printStackTrace();
	}
	   
}
}
