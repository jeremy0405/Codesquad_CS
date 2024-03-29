package mission.cs.cs03;

public class VideoEditor {

	private VideoData[] videoData;
	private MyLinkedList linkedList;
	private static final int VIDEO_DATA_NUMBER = 13;

	public void init() {
		videoData = new VideoData[VIDEO_DATA_NUMBER];
		initVideoData();
	}

	public void start() {
		linkedList = new MyLinkedList();
		ValidationInput val = new ValidationInput();

		Print.print(videoData);

		boolean isWork = true;
		while (isWork) {
			String[] input = val.validateInput(UserInput.userInput(), videoData);
			isWork = classifyInput(input);
		}

	}

	private boolean classifyInput(String[] input) {
		switch (input[0]) {
			case "add":
				execAdd(input);
				return true;
			case "delete":
				execDelete(input);
				return true;
			case "insert":
				execInsert(input);
				return true;
			case "render":
				Print.print(linkedList.render(linkedList));
				return false;
			default:
				return true;
		}

	}

	private void execInsert(String[] input) {
		for (int i = 0; i < VIDEO_DATA_NUMBER; i++) {
			if (input[1].equals(videoData[i].getId())) {
				VideoData newData = new VideoData(videoData[i]);
				linkedList.insert(newData, Integer.parseInt(input[2]));
				break;
			}
		}
		Print.print(linkedList);
	}

	private void execDelete(String[] input) {
		boolean isdelete = false;
		for (int i = 0; i < linkedList.size(); i++) {
			if (input[1].equals(linkedList.get(i).getId())) {
				linkedList.delete(linkedList.get(i), i);
				isdelete = true;
				break;
			}
		}
		if(isdelete) {
			Print.print(linkedList);
		} else {
			System.out.println("id값이 랜더링 리스트 중에 존재하지 않습니다.");
		}
	}

	private void execAdd(String[] input) {
		for (int i = 0; i < VIDEO_DATA_NUMBER; i++) {
			if (input[1].equals(videoData[i].getId())) {
				VideoData newData = new VideoData(videoData[i]);
				linkedList.add(newData);
				break;
			}
		}
		Print.print(linkedList);
	}

	private void initVideoData() {
		for (int i = 0; i < 13; i++) {
			videoData[i] = new VideoData("제목" + (i + 1));
		}
	}

}
