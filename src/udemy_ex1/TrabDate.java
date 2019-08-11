package udemy_ex1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TrabDate {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat da1 = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dat = da1.parse("25/03/2018");
		
		Date atual = new Date();
		
		System.out.println(da1.format(dat));
		System.out.println(da1.format(atual));

	}

}
