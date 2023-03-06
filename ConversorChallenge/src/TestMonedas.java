import javax.swing.JOptionPane;

public class TestMonedas {

	public static void main(String[] args) {
		String ciclo = " ";
		while (!ciclo.equals("3 Salir") || ciclo != null) {
			String[] opciones = { "1 Moneda a peso", "2 Peso a moneda", "3 Salir" };
			String selecion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", null,
					JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

			if (selecion.equals("1 Moneda a peso")) {
				String[] opciones2 = { "1 Dolar a peso", "2 Euro a peso", "3 Libras esterlinas a peso",
						"4 Yen japones a peso", "5 Won sur-coreano a peso" };
				String selecion2 = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", null,
						JOptionPane.QUESTION_MESSAGE, null, opciones2, opciones2[0]);
				if (selecion2 != null) {
					switch (selecion2) {
					case "1 Dolar a peso": {
						String y = (String) JOptionPane.showInputDialog(null, "Digita la cantidad en dolar");
						double x = Double.valueOf(y);
						double z;
						Dolar moneda = new Dolar();
						z = moneda.conversorMonedaa(x);
						JOptionPane.showMessageDialog(null, "El valor es: " + z);
					}
						break;
					case "2 Euro a peso": {
						String y = (String) JOptionPane.showInputDialog(null, "Digita la cantidad en Euro");
						double x = Double.valueOf(y);
						double z;
						Euro moneda = new Euro();
						z = moneda.conversorMonedaa(x);
						JOptionPane.showMessageDialog(null, "El valor es: " + z);
					}
						break;
					case "3 Libras esterlinas a peso": {
						String y = (String) JOptionPane.showInputDialog(null, "Digita la cantidad en Libras");
						double x = Double.valueOf(y);
						double z;
						LibrasEsterlinas moneda = new LibrasEsterlinas();
						z = moneda.conversorMonedaa(x);
						JOptionPane.showMessageDialog(null, "El valor es: " + z);
					}
						break;
					case "4 Yen japones a peso": {
						String y = (String) JOptionPane.showInputDialog(null, "Digita la cantidad en Yen");
						double x = Double.valueOf(y);
						double z;
						YenJapones moneda = new YenJapones();
						z = moneda.conversorMonedaa(x);
						JOptionPane.showMessageDialog(null, "El valor es: " + z);
					}
						break;
					case "5 Won sur-coreano a peso": {
						String y = (String) JOptionPane.showInputDialog(null, "Digita la cantidad en Won");
						double x = Double.valueOf(y);
						double z;
						WonSurCoreano moneda = new WonSurCoreano();
						z = moneda.conversorMonedaa(x);
						JOptionPane.showMessageDialog(null, "El valor es: " + z);
					}
						break;
					}

				}

			} else if (selecion.equals("2 Peso a moneda")) {
				String[] opciones2 = { "1 Peso a Dolar", "2 Peso a Euro", "3 Peso a Libras esterlinas",
						"4 Peso a Yen japones", "5 Peso a Won sur-coreano" };
				String selecion2 = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", null,
						JOptionPane.QUESTION_MESSAGE, null, opciones2, opciones2[0]);
				if (selecion2 != null) {
					switch (selecion2) {
					case "1 Peso a Dolar": {
						String y = (String) JOptionPane.showInputDialog(null, "Digita la cantidad en dolar");
						double x = Double.valueOf(y);
						double z;
						Dolar moneda = new Dolar();
						z = moneda.conversorPesoa(x);
						JOptionPane.showMessageDialog(null, "El valor es: " + z);
					}
						break;
					case "2 Peso a Euro": {
						String y = (String) JOptionPane.showInputDialog(null, "Digita la cantidad en Euro");
						double x = Double.valueOf(y);
						double z;
						Euro moneda = new Euro();
						z = moneda.conversorPesoa(x);
						JOptionPane.showMessageDialog(null, "El valor es: " + z);
					}
						break;
					case "3 Peso a Libras esterlinas": {
						String y = (String) JOptionPane.showInputDialog(null, "Digita la cantidad en Libras");
						double x = Double.valueOf(y);
						double z;
						LibrasEsterlinas moneda = new LibrasEsterlinas();
						z = moneda.conversorPesoa(x);
						JOptionPane.showMessageDialog(null, "El valor es: " + z);
					}
						break;
					case "4 Peso a Yen japones": {
						String y = (String) JOptionPane.showInputDialog(null, "Digita la cantidad en Yen");
						double x = Double.valueOf(y);
						double z;
						YenJapones moneda = new YenJapones();
						z = moneda.conversorPesoa(x);
						JOptionPane.showMessageDialog(null, "El valor es: " + z);
					}
						break;
					case "5 Peso a Won sur-coreano": {
						String y = (String) JOptionPane.showInputDialog(null, "Digita la cantidad en Won");
						double x = Double.valueOf(y);
						double z;
						WonSurCoreano moneda = new WonSurCoreano();
						z = moneda.conversorPesoa(x);
						JOptionPane.showMessageDialog(null, "El valor es: " + z);

					}
						break;
					}
				}

			}
			ciclo = selecion;

		}

	}

}
