package aed.individual1;

public class Arrays2 {

	/**
	 * Comprueba si dos arrays son inversos, tienen los mismos elementos, pero
	 * en orden inverso
	 * 
	 * @param a1
	 *            Array de entrada 1
	 * @param a2
	 *            Array de entrada 2
	 * @return true si son inversos, false en otro caso
	 */
	public boolean sonInversos(Integer[] a1, Integer[] a2) {
		boolean inversos = true;
		if (a1 == null && a2 != null || a1 != null && a2 == null || a1.length != a2.length) {
			inversos = false;
			return inversos;
		}
		if (a1.length == a2.length) {
			for (int i = 0, j = a2.length - 1; i < a1.length && j > -1 && inversos; i++, j--) {
				if (!(a1[i] == null && a2[j] == null)) {
					if (a1[i] == null && a2[j] != null || a1[i] != null && a2[j] == null || !a1[i].equals(a2[j])) {
						inversos = false;
					}
				}
			}
		}
		return inversos;
	}
}