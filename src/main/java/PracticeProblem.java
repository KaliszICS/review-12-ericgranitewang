public class PracticeProblem {

	public static void main(String args[]) {

	}
	
	public static boolean isPalindrome(String a) {
		a = a.toLowerCase();
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				a = a.substring(0, i) + a.substring(i+1);
				i--;
			}
		}
		for (int i = 0; i < a.length()/2; i++) {
			if (a.charAt(i) != a.charAt(a.length()-1-i)) {
				return false;
			}
		}
		return true;
	}

	public static int getAge(String[] names, int[] ages, String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name)) {
				return ages[i];
			}
		}
		return 0;
	}

	public static int countWords (String a, char b) {
		String[] array = a.split(" ");
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].indexOf(b) >= 0) {
				count++;
			}
		}
		return count;
	}
}
