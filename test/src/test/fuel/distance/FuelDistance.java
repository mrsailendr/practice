package test.fuel.distance;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FuelDistance {

	public static void main(String[] args) {
		List<Integer> fuelList = new ArrayList<>();
		List<Integer> distanceList = new ArrayList<>();
		fuelList.add(5);
		fuelList.add(4);
		fuelList.add(8);
		fuelList.add(1);
		fuelList.add(3);
		distanceList.add(5);
		distanceList.add(5);
		distanceList.add(8);
		distanceList.add(2);
		distanceList.add(3);
		System.out.println(fuelDistanceCheck(fuelList, distanceList));
	}

	private static int fuelDistanceCheck(List<Integer> fuelList, List<Integer> distanceList) {
		int totalDistance = sumList(distanceList);
		int totalFuel = sumList(fuelList);
		int fuelListSize = fuelList.size();
		int distanceListSize = distanceList.size();
		int startIndex = -1;
		int extraFuel = 0;
		if (totalDistance <= totalFuel)
			if (fuelListSize == distanceListSize) {
				for (int i = 0; i < distanceListSize; i++) {
					if (extraFuel + fuelList.get(i) >= distanceList.get(i)) {
						extraFuel = extraFuel + fuelList.get(i) - distanceList.get(i);
						if (extraFuel >= 0) {
							if (startIndex == -1)
								startIndex = i;
						} else {
							extraFuel = 0;
							startIndex = -1;
						}
					}
				}
				if (startIndex != 0) {
					for (int i = 0; i < startIndex; i++) {
						if (extraFuel + fuelList.get(i) >= distanceList.get(i)) {
							extraFuel = extraFuel + fuelList.get(i) - distanceList.get(i);
							if (extraFuel < 0) {
								startIndex = -1;
							}
						}
					}
				}
			}
		return startIndex;
	}

	private static int sumList(List<Integer> list) {
		Integer sum = list.stream().collect(Collectors.summingInt(Integer::intValue));
		return sum != null ? sum.intValue() : 0;
	}

}
