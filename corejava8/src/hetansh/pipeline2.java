package hetansh;

import java.util.HashMap;
import java.util.Map;

public class pipeline2 {
	public static void main(String[] args) {
		String fileNameFromDatabse = "V1_01__ab.sql";
		String fileNameForSystem = fileVersing(fileNameFromDatabse);
		System.out.println("from Database   ==>>" + fileNameFromDatabse);
		System.out.println("for system file ==>>" + fileNameForSystem);
	}

	private static String fileVersing(String fileNameFromDatabse) {
		int intIndexforV = fileNameFromDatabse.indexOf("V") + 1;
		int intIndexforU = fileNameFromDatabse.indexOf("__");
		String part3 = fileNameFromDatabse.substring(intIndexforU + 2, fileNameFromDatabse.length());
		String strActualFileName = fileNameFromDatabse.substring(intIndexforV, intIndexforU);
		String fileVersionfromDd = strActualFileName.replace("_", "");
		int newVersionforSysFile = Integer.parseInt(fileVersionfromDd) + 1;
		String part2 = generateFileVersion(strActualFileName, String.valueOf(newVersionforSysFile));
		String finalFileVerion = "V" + part2 + "__" + part3;
		return finalFileVerion;
	}

	public static String addChar(String originalString1, String originalString, String ch,
			Map<String, Integer> position) {
		for (Map.Entry<String, Integer> entry : position.entrySet()) {
			String strAdded = addCharNew(originalString, '_', entry.getValue());
			originalString = strAdded;
		}
		return originalString;
	}

	public static String addCharNew(String str, char ch, Integer position) {
		int len = str.length();
		char[] updatedArr = new char[len + 1];
		str.getChars(0, position, updatedArr, 0);
		updatedArr[position] = ch;
		str.getChars(position, len, updatedArr, position + 1);
		return new String(updatedArr);
	}

	public static String generateFileVersion(String strActualFileName, String increment) {
		Map<String, Integer> map = new HashMap<>();
		for (int y = 0; y < strActualFileName.length(); y++) {
			if (strActualFileName.charAt(y) == '_') {
				map.put(String.valueOf(y), y);
			} else {
			}
		}
		String finalstr = addChar(strActualFileName, increment, "-", map);
		return finalstr;
	}
}