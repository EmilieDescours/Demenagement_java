
public class algo_demenagement {
	public static void algodemenagement() {
		int carton_ex_bureau = 34;
		int carton_nv_bureau = 0;
		int carton_camion = 0; // max : 9
		int voyage = 0;

		while (carton_ex_bureau > 0) {
			// chargement
			while (carton_ex_bureau > 0 && carton_camion < 9) {
				carton_ex_bureau--;
				carton_camion++;
			}
			System.out.format("c'est le voyage n°%d, il contient %d cartons.\n", voyage, carton_camion);
			// déchargement
			while (carton_camion > 0) {
				carton_camion--;
				carton_nv_bureau++;
			}
			System.out.format("il y a maintenant %d cartons dans le nouveau bureau.\n", carton_nv_bureau);
			voyage++;
		}
	}
}
