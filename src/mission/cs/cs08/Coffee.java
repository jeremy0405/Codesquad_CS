package mission.cs.cs08;

import java.util.Map;

public class Coffee {

	//todo
	// 커피에 따른 시간을 아웃풋으로 줘야 함
	// 커피를 map으로 가지고 있으면 좋을듯
	// 바리스타에서 들어온 입력 가지고 맵 시간만큼 sleep 건 뒤에 출력하면 될 듯

	// immutable 이라서 좋다는데 replace put 이런거 다 안됨.
	private static final Map<String, Integer> coffeeMenu = Map.of(
		"아메리카노", 3,
		"카페라떼", 5,
		"프라프치노", 10
	);

	public static int getTime(String coffee) {
		return coffeeMenu.get(coffee);
	}

}
