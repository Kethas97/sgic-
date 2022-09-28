import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CsvToDb {

	public void Data(String ss) {
		// TODO Auto-generated method stub

		List<user> list=getUserDetails(ss);
		
		for(user usr:list) {
			System.out.println(usr);
		}
	

	DBC dbc=new DBC();
	try {
		
		dbc.insertuser(list);
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}
	
	private static List<user> getUserDetails(String file) {
		// TODO Auto-generated method stub
		List<user> list=new ArrayList<>();
		Path path=Paths.get(file);
		
		try {
			BufferedReader br=Files.newBufferedReader(path);
			String row=br.readLine();
			
			while(row!=null){
			    String [] attributes = row.split(",");
			    user usr = getOneUser(attributes);
			    list.add(usr);
			    row=br.readLine();
		}
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	private static user getOneUser(String[] attributes) {
		// TODO Auto-generated method stub
		String username,firstname,lastname,nicno,address;
		
		username=attributes[0];
		firstname=attributes[1];
		lastname=attributes[2];
		nicno=attributes[3];
		address=attributes[4];
		
		user usr=new user(username,firstname,lastname,nicno,address);
		return usr;
	}
}