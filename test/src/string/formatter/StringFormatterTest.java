package string.formatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class StringFormatterTest {
	public static void main(String[] args)
	{
		LocalDate today = LocalDate.now();
		System.out.println(today.format(DateTimeFormatter.ofPattern("MMMM")));
		System.out.println(today.format(DateTimeFormatter.ofPattern("MMMM ", new Locale("ar"))));
	}
}
