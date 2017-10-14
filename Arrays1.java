package aed.individual1;

public class Arrays1 {

	/**
	 * Metodo que reduce los elementos iguales consecutivos de un array a una
	 * única repetición
	 * 
	 * @param array
	 *            Array de entrada
	 * @return Array compactado sin elementos iguales consecutivos
	 */
	public Integer[] compactar(Integer[] array) throws IllegalArgumentException {

		if (array == null) {
			throw new IllegalArgumentException();

		}
		Integer arrNuevo[] = null;
		if (array.length < 2) {
			arrNuevo = new Integer[array.length];
			for (int i = 0; i < array.length; i++) {
				arrNuevo[i] = array[i];
			}
		} else {
			int tamanio = array.length;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i].equals(array[i + 1])) {
					tamanio--;
				}
			}
			arrNuevo = new Integer[tamanio];
			arrNuevo[0] = array[0];
			int j = 1;
			for (int i = 1; i < array.length; i++) {
				if (!array[i - 1].equals(array[i]) && j < tamanio) {
					arrNuevo[j] = array[i];
					j++;
				}
			}
		}
		return arrNuevo;
	}
}
