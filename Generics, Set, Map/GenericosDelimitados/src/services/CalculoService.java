package services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CalculoService {

	public int max(List<Integer> list) {
		return list.stream().max((a, b) -> a.compareTo(b)).orElse(null);
	}
}
