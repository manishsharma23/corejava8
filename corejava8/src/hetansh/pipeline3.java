package hetansh;

import java.util.HashMap;
import java.util.Map;

public class pipeline3 {

	public static void versionInDecm() {
		String strExistingFileVersion = "1.2.3.4";
		char chrInExistingFile='.';

		String strRemovedchar = strExistingFileVersion.replace(".", "");
        char addNewCharIntoNewVer='_';

		Integer incrementedVersion = Integer.parseInt(strRemovedchar) + 1;
		String strIncrementedVersion = String.valueOf(incrementedVersion);
		String strNewFileVersion = generateFileVersion(strExistingFileVersion, chrInExistingFile, strIncrementedVersion, addNewCharIntoNewVer);
		
		System.out.println("strExistingFileVersion.........."+strExistingFileVersion);
		System.out.println("strNewFileVersion1.........."+strNewFileVersion);
	}

	public static void main(String[] args) {
		String fileNameFromDatabse = "V1_01__ab.sql";
		String fileNameForSystem = fileVersing(fileNameFromDatabse);
		System.out.println("from Database   ==>>" + fileNameFromDatabse);
		System.out.println("for system file ==>>" + fileNameForSystem);

		versionInDecm();
	}

	private static String fileVersing(String fileNameFromDatabse) {
		int intIndexforV = fileNameFromDatabse.indexOf("V") + 1;
		int intIndexforU = fileNameFromDatabse.indexOf("__");
		String part3 = fileNameFromDatabse.substring(intIndexforU + 2, fileNameFromDatabse.length());
		String strExistingFileVersion = fileNameFromDatabse.substring(intIndexforV, intIndexforU);
		int newVersionforSysFile = Integer.parseInt(strExistingFileVersion.replace("_", "")) + 1;
		String strIncrementedVersion = String.valueOf(newVersionforSysFile);
		String part2 = generateFileVersion(strExistingFileVersion, '_', strIncrementedVersion, '_');
		String finalFileVerion = "V" + part2 + "__" + part3;
		return finalFileVerion;
	}

	public static String generateFileVersion(String strExistingFileVersion, char chrInExistingFile,
			String strIncrementedVersion, char addNewCharIntoNewVer) {
		Map<String, Integer> mapPostionOfChar = new HashMap<>();
		for (int y = 0; y < strExistingFileVersion.length(); y++) {
			if (strExistingFileVersion.charAt(y) == chrInExistingFile) {
				mapPostionOfChar.put(String.valueOf(y), y);
			} else {
			}
		}
		for (Map.Entry<String, Integer> entry : mapPostionOfChar.entrySet()) {
			String strAdded = addCharIntoIncrementedVersion(strIncrementedVersion, addNewCharIntoNewVer, entry.getValue());
			strIncrementedVersion = strAdded;
		}
		return strIncrementedVersion;
	}

	public static String addCharIntoIncrementedVersion(String incrementedVersion, char addNewCharIntoNewVer,
			Integer charPosition) {
		// example 102 change into 1_0_2
		int len = incrementedVersion.length();
		char[] updatedArr = new char[len + 1];
		incrementedVersion.getChars(0, charPosition, updatedArr, 0);
		updatedArr[charPosition] = addNewCharIntoNewVer;
		incrementedVersion.getChars(charPosition, len, updatedArr, charPosition + 1);
		return new String(updatedArr);
	}
}