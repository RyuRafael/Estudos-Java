package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		String path = "/home/rafael/Estudos-Java/Generics, Set, Map/Map/ExercicioDeFixacao/src/Candidatos.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Map<String, Integer> votos = new LinkedHashMap<>();
			String line = br.readLine();

			while (line != null) {

				String[] x = line.split(",");
				if (votos.containsKey(x[0])) {
					Integer n = Integer.parseInt(x[1]) + votos.get(x[0]);
					votos.put(x[0], n);
				}
				else {
					votos.put(x[0], Integer.parseInt(x[1]));
				}
				
				line = br.readLine();
			}

			for (String key : votos.keySet()) {
				System.out.println(key + ": " + votos.get(key));
			}

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}
}
