package ba.bitcamp.homework.Emir.generics;

public class CSVBuilder {

String res;
	
/*
 * Zadatak  2
 */
	/**
	 * Appends provided string to existing CSV line.
	 * 
	 * @param str value to append to line
	 * @return this builder
	 * @throws NullPointerException in case provided object is null
	 */
	public CSVBuilder append(String str) {
		if(str == null)
			str= "";
		if( str.contains(","))
			str = "\"" + str + "\"";
		
		if (res != null) {
			res = res.concat(",").concat(str);
		} else {
			res = str;
		}
		return this;
	}
	
	/**
	 * Appends string representation of provided object to existing CSV line.
	 * 
	 * @param str value to append to line
	 * @return this builder
	 * @throws NullPointerException in case provided object is null
	 */
	public CSVBuilder append(Object obj) {
		return append(obj.toString());
	}
	
	/**
	 * Resets builder.
	 */
	public void clear() {
		res = null;
	}
	
	@Override
	public String toString() {
		if (res != null) {
			return res;
		}
		return "";
	}

}
