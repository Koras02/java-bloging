
public class swit {

    public static void main(String[] args) {
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "월요일";
                break;
            case 2:
                dayName = "화요일";
                break;
            case 3:
                dayName = "수요일";
                break;
            default:
                dayName = "주말";
                break;
        }

        System.out.println(dayName);
    }
}
