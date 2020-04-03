package hetansh;

public class ConsonentVoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "HETANSH";
		String consonents = "";
		String Vovales = "";
		for (int i = 0; i < name.length(); i++) {

			char ch = name.charAt(i);

			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				Vovales = Vovales + ch + "";
			}

			else {

				consonents = consonents + ch + "";

			}

		}

		System.out.println("Vovales...>>>" + Vovales );
		System.out.println("Consonents ----->>>>" + consonents);

	}

}
