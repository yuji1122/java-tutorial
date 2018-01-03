import java.util.Date;
public class MqmMonitor {
	/* Mqm Monitor Main Method */
	public static void main(String[] args) {
		boolean runMqmMonitor = true;
		String menuId = "m";
		String inputMenuId = "";
		startMqmMonitor();
		do {
			switch (menuId) {
			case "m":
				dispMenu();
				inputMenuId = scanMenuId();
				menuId = inputMenuId.substring(0,inputMenuId.length());
				break;
			case "1":
				listChannels();
				inputMenuId = scanMenuId();
				menuId = inputMenuId.substring(0,inputMenuId.length());
				break;
			case "2":
				listQueues();
				inputMenuId = scanMenuId();
				menuId = inputMenuId.substring(0,inputMenuId.length());
				break;
			case "q":
				runMqmMonitor = false;
				break;
			default:
				break;
			}
			System.out.println("menuId      = " + menuId);
			System.out.println("inputMenuId = " + inputMenuId);
		}  while ( runMqmMonitor == true ) ;
		endMqmMonitor();
	}
	public static String scanMenuId() {
		String inputMenuId = new java.util.Scanner(System.in).nextLine();
		return inputMenuId;
	}
	public static void startMqmMonitor() {
		System.out.println("Starting MQM Monitor");
	}
	public static void endMqmMonitor() {
		System.out.println("Exit MQM Monitor");
	}
	public static void currentTime() {
		Date cTime = new Date();
		System.out.println(cTime);
	}
	public static void dispMenu() {
//		System.out.printf("\033[2J");
//		System.out.printf("\033[%d;%dH",2,1);
		System.out.println("----- MQM Monitor ( Menu ) -----");
		currentTime();
		System.out.println("");
		System.out.println("  1 : List Channels ");
		System.out.println("  2 : List Queues ");
		System.out.println("  q : Quit ");
		System.out.println("");
		System.out.print("  Input Menu ID : ");
	}
	public static void listChannels() {
//		System.out.printf("\033[2J");
//		System.out.printf("\033[%d;%dH",2,1);
		System.out.println("----- MQM Monitor ( List Channels ) -----");
		currentTime();
		System.out.println("");
		System.out.println("ChannelName Type Status");
		System.out.println("=========== ==== ======");
		System.out.println("aaaaaaaaaaa bbbb running");
		System.out.println("");
		System.out.println("  m:Menu / 1:Channel / 2:Queue / q:Quit ");
		System.out.println("");
		System.out.print("  Input Menu ID : ");
	}
	public static void listQueues() {
//		System.out.printf("\033[2J");
//		System.out.printf("\033[%d;%dH",2,1);
		System.out.println("----- MQM Monitor ( List Queues ) -----");
		currentTime();
		System.out.println("");
		System.out.println("QueueName   Type Status");
		System.out.println("=========== ==== ======");
		System.out.println("aaaaaaaaaaa bbbb running");
		System.out.println("");
		System.out.println("  m:Menu / 1:Channel / 2:Queue / q:Quit ");
		System.out.println("");
		System.out.print("  Input Menu ID : ");
	}
}
